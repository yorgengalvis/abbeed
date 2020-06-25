package Interface;

import Negocio.Cliente;
import Negocio.Producto;
import Negocio.Proveedor;

public interface ReglasNegocio {

    public boolean guardarProducto(Producto producto);
    public Producto buscarProducto(String codigo);
    public boolean venderProducto(Producto producto, Cliente cliente, int cantidad);
    public boolean hacerPedido(Producto producto, Proveedor proveedor, int cantidad);
    public boolean comprobarStock(Producto producto);
    public String verProductos();

    public boolean guardarCliente(Cliente cliente);
    public Cliente buscarCliente(int cedula);
    public String verClientes();


    public boolean guardarProveedor(Proveedor proveedor);
    public Proveedor buscarProveedor(String NIT);
    public String verProveedores();
}
