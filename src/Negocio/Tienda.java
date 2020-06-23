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

    /*
    Andrey men cuando es usted declara un metodo la primera letra es en minuscula
    ejemplo venderProducto no VenderProducto ya que se puede llegar a confundir con otra cosa
    son pequeños tips 
     */
 /*
    Hay que realizar un metodo para buscar un producto
    terminelo Andrey por favor
     */
    @Override
    public Producto buscarProducto(String codigo) {
        return null;
    }

    @Override
    public boolean guardarProducto(Producto producto) {
        productos.add(producto);
        return true;
    }

    @Override
    public boolean venderProducto(Producto producto, Cliente cliente, int cant) {

        if (cant >= producto.getCantProducto()) {

            Iterator<Producto> it = productos.iterator();
            while (it.hasNext()) {

                if (it.next().getNombre().equals(producto.getNombre())) {
                    productos.remove(it.next());
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean comprarProducto(Producto producto, Proveedor proveedor, int cantidad) {
        return false;
    }

    @Override
    public boolean comprobarStock(Producto producto) {
        return false;
    }

    @Override
    public Cliente buscarCliente(int cedula) {
        return null;
    }

    @Override
    public boolean guardarCliente(Cliente cliente) {
        clientes.add(cliente);
        return true;
    }

    @Override
    public Proveedor buscarProveedor(String NIT) {
        return null;
    }

    @Override
    public boolean guardarProveedor(Proveedor proveedor) {
        proveedores.add(proveedor);
        return false;
    }

    @Override
    public String verProductos() {
        String msg = "";
        
        for(Iterator<Producto> p = productos.iterator(); p.hasNext();){
           msg += p.toString();
        }
       
        return msg;
    }

    @Override
    public String verClientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String verProveedores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
