
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
    public boolean hacerPedido(Producto producto, Proveedor proveedor, int cantidad) {
        return tienda.hacerPedido(producto, proveedor, cantidad);
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
       return tienda.verClientes();
    }

    @Override
    public String verProveedores() {
    return tienda.verProveedores();
    }
    
}
