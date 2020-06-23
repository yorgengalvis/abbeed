package Negocio;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Andrey
 */
public class Tienda {

    TreeSet<Producto> productos = new TreeSet<Producto>();
    TreeSet<Cliente> clientes = new TreeSet<Cliente>();
    TreeSet<Proveedor> proveedores = new TreeSet<Proveedor>();

    /*
    Andrey men cuando es usted declara un metodo la primera letra es en minuscula
    ejemplo venderProducto no VenderProducto ya que se puede llegar a confundir con otra cosa
    son pequeños tips 
     */
 /*
    Hay que realizar un metodo para buscar un producto
    terminelo Andrey por favor
     */
    public Producto buscarProducto(String codigo) {
        return null;
    }

    public boolean guardarProducto(Producto producto) {
        productos.add(producto);
        return true;
    }

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
    
    public boolean comprarProducto(Producto producto, Proveedor proveedor, int cantidad){
        return false;
    }
    
    
    public boolean comprobarStock(Producto producto){
        return false;
    }

    public Cliente buscarCliente(int cedula) {
        return null;
    }

    public boolean guardarCliente(Cliente cliente) {
        clientes.add(cliente);
        return true;
    }

    public Proveedor buscarProveedor(String NIT) {
        return null;
    }

    public boolean guardarProveedor(Proveedor proveedor) {
        proveedores.add(proveedor);
        return false;
    }

}
