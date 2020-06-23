
package Control;

import Interface.ReglasNegocio;
import Negocio.Cliente;
import Negocio.Producto;
import Negocio.Proveedor;
import Negocio.Tienda;

public class ControlNegocio implements ReglasNegocio{

    private Tienda tienda = new Tienda();
    
    @Override
    public boolean guardarProducto(Producto producto) {
        return tienda.guardarProducto(producto);
    }

    @Override
    public boolean guardarCliente(Cliente cliente) {
        return tienda.guardarCliente(cliente);
    }

    @Override
    public boolean guardarProveedor(Proveedor proveedor) {
        return tienda.guardarProveedor(proveedor);
    }
    
}
