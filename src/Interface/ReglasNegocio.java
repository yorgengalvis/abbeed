
package Interface;

import Negocio.Cliente;
import Negocio.Producto;
import Negocio.Proveedor;

public interface ReglasNegocio {
   public boolean guardarProducto(Producto producto);
   public boolean guardarCliente(Cliente cliente);
   public boolean guardarProveedor(Proveedor proveedor);
   
   
   public Producto buscarProducto(String codigo);
   public boolean venderProducto(Producto producto, Cliente cliente, int cantidad);
   public boolean comprarProducto(Producto producto, Proveedor proveedor, int cantidad);
   public boolean comprobarStock(Producto producto);
   
   
   public Cliente buscarCliente(int cedula);
   public Proveedor buscarProveedor(String NIT);
}
