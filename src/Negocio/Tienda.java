package Negocio;

import Interface.ReglasNegocio;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Andrey
 */
public class Tienda implements ReglasNegocio {

    private TreeSet<Producto> productos = new TreeSet<>();
    private TreeSet<Cliente> clientes = new TreeSet<>();
    private TreeSet<Proveedor> proveedores = new TreeSet<>();

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

    public void hacerPedido(Producto producto, int cantidad) {
        if (buscarProducto(producto.getCodigo()) == null) {
            Producto pe = buscarProducto(producto.getCodigo());
            int nuevaCantidad = pe.getCantProducto() + cantidad;
            pe.setCantProducto(nuevaCantidad);
        }
    }

    @Override
    public boolean venderProducto(Producto producto, Cliente cliente, int cant) {

        if (cant >= producto.getCantProducto()) {

            Iterator<Producto> it = productos.iterator();
            while (it.hasNext()) {

                productos.remove(buscarProducto(producto.getCodigo()));

            }
            return true;
        }
        return false;
    }

    @Override
    public boolean comprarProducto(Producto producto, Proveedor proveedor, int cantidad) {
        if (comprobarStock(producto)) {

            Iterator<Producto> it = productos.iterator();
            while (it.hasNext()) {

                productos.add(buscarProducto(producto.getCodigo()));

            }
            return true;
        }
        return false;
    }

    @Override
    public boolean comprobarStock(Producto producto) {
        return producto.getCantProducto() <= producto.getStockMinimo();
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
    public Proveedor buscarProveedor(String NIT) {
        Proveedor aux = null;
        for (Iterator<Proveedor> p = proveedores.iterator(); p.hasNext();) {
            Proveedor buscar = p.next();
            if (buscar.getNit().equals(NIT)) {
                aux = buscar;
                break;
            }
        }
        return aux;
    }

    @Override
    public boolean guardarProveedor(Proveedor proveedor) {
        if (buscarProveedor(proveedor.getNit()) == null) {
            proveedores.add(proveedor);
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

    @Override
    public String verProveedores() {
        String msg = "";
        for (Iterator<Proveedor> p = proveedores.iterator(); p.hasNext();) {
            msg += p.next().toString() + "\n";
        }
        return msg;
    }

}
