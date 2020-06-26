package Interface;

import Negocio.Cliente;
import Negocio.Producto;

public interface ReglasNegocio {
    public boolean guardarProducto(Producto producto);
    public Producto buscarProducto(String codigo);
    public String verProductos();
    
    public boolean guardarCliente(Cliente cliente);
    public Cliente buscarCliente(int cedula);
    public String verClientes();
        
    public boolean venderProducto(String codigoProducto, int cedulaCliente, int cantidad);
    public boolean hacerPedido(String codigo, int cantidad);
    public boolean comprobarStock(String codigo);
    public Producto productoMasVendido();
    public Producto productoMenosVendido();
    public double totalVentas(); 
    public int promedioVentas(); 
   
}
