
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

    @Override
    public boolean venderProducto(Producto producto, Cliente cliente, int cantidad) {
        return tienda.venderProducto(producto, cliente, cantidad);
    }

    @Override
    public boolean comprarProducto(Producto producto, Proveedor proveedor, int cantidad) {
        return tienda.comprarProducto(producto, proveedor, cantidad);
    }

    @Override
    public boolean comprobarStock(Producto producto) {
        return tienda.comprobarStock(producto);
    }

    @Override
    public Producto buscarProducto(String codigo) {
        return tienda.buscarProducto(codigo);
    }

    @Override
    public Cliente buscarCliente(int cedula) {
        return tienda.buscarCliente(cedula);
    }

    @Override
    public Proveedor buscarProveedor(String NIT) {
        return tienda.buscarProveedor(NIT);
    }

    @Override
    public String verProductos() {
        return tienda.verProductos();
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
