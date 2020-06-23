
package Interface;

import Negocio.Cliente;
import Negocio.Producto;
import Negocio.Proveedor;

public interface ReglasNegocio {
   public boolean guardarProducto(Producto producto);
   public boolean guardarCliente(Cliente cliente);
   public boolean guardarProveedor(Proveedor proveedor);
}
