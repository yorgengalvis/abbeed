package Negocio;

import Interface.ReglasNegocio;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 *
 * @author Andrey
 */
public class Tienda implements ReglasNegocio {

    private TreeSet<Producto> productos = new TreeSet<>();
    private TreeSet<Cliente> clientes = new TreeSet<>();
    private LinkedList<Venta> ventas = new LinkedList<>();

    @Override
    public Producto buscarProducto(String codigo) {
        Producto aux = null;
        for (Iterator<Producto> p = productos.iterator(); p.hasNext();) {
            Producto buscar = p.next();
            if (buscar.getCodigo().equals(codigo)) {
                aux = buscar;
                break;
            }
        }
        return aux;
    }

    @Override
    public boolean guardarProducto(Producto producto) {
        if (buscarProducto(producto.getCodigo()) == null) {
            productos.add(producto);
            return true;
        }
        return false;
    }

    @Override
    public boolean hacerPedido(String codigo, int cantidad) {
        Producto producto = buscarProducto(codigo);
        if (producto != null) {
            if (buscarProducto(producto.getCodigo()) == null) {
                Producto pe = buscarProducto(producto.getCodigo());
                int nuevaCantidad = pe.getCantidad() + cantidad;
                pe.setCantidad(nuevaCantidad);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean venderProducto(String codigoProducto, int cedulaCliente, int cant) {
        Producto producto = buscarProducto(codigoProducto);
        Cliente cliente = buscarCliente(cedulaCliente);

        if (producto != null && cliente != null) {
            if (cant <= producto.getCantidad()) {
                Producto avender = buscarProducto(producto.getCodigo());
                avender.setCantidad(avender.getCantidad() - cant);
                Venta venta = new Venta(avender, cliente, cant);
                venta.calcularTotal();
                this.ventas.add(venta);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean comprobarStock(String codigo) {
        Producto producto = buscarProducto(codigo);
        if (producto != null) {
            return producto.getCantidad() <= producto.getStockMinimo();
        }
        return false;
    }

    @Override
    public Cliente buscarCliente(int cedula) {
        Cliente aux = null;
        for (Iterator<Cliente> c = clientes.iterator(); c.hasNext();) {
            Cliente buscar = c.next();
            if (buscar.getCedula() == cedula) {
                aux = buscar;
                break;
            }
        }
        return aux;
    }

    @Override
    public boolean guardarCliente(Cliente cliente) {
        if (buscarCliente(cliente.getCedula()) == null) {
            clientes.add(cliente);
            return true;
        }

        return false;
    }

    @Override
    public String verProductos() {
        String msg = "";

        for (Iterator<Producto> p = productos.iterator(); p.hasNext();) {
            msg += p.next().toString() + "\n";
        }

        return msg;
    }

    @Override
    public String verClientes() {
        String msg = "";
        for (Iterator<Cliente> c = clientes.iterator(); c.hasNext();) {
            msg += c.next().toString() + "\n";
        }
        return msg;
    }

    public String verVentas() {
        String msg = "";
        for (Venta ve : this.ventas) {
            msg += ve.toString() + "\n";
        }
        return msg;
    }

    public int cantidadProductoVendido(Producto producto) {
        int aux = 0;
        for (Venta ves : this.ventas) {
            if (ves.getProducto().equals(producto)) {
                aux += ves.getCantidad();
            }
        }
        return aux;
    }

    @Override
    public Producto productoMasVendido() {
        Producto mayor = this.ventas.getFirst().getProducto();
        for (Venta ves : this.ventas) {
            if (cantidadProductoVendido(ves.getProducto()) > cantidadProductoVendido(mayor)) {
                ves.getProducto().setCantidad(cantidadProductoVendido(ves.getProducto()));
                mayor = ves.getProducto();
            }
        }
        return mayor;
    }

    @Override
    public Producto productoMenosVendido() {
        Producto menor = this.ventas.getFirst().getProducto();
        for (Venta ves : this.ventas) {
            if (cantidadProductoVendido(ves.getProducto()) < cantidadProductoVendido(menor)) {
                ves.getProducto().setCantidad(cantidadProductoVendido(ves.getProducto()));
                menor = ves.getProducto();
            }
        }
        return menor;
    }

    @Override
    public double totalVentas() {
        double aux = 0;
        for (Venta ve : this.ventas) {
            aux += ve.getTotal();
        }
        return aux;
    }

    @Override
    public int promedioVentas() {
        return (int) this.totalVentas() / this.ventas.size();
    }

}
