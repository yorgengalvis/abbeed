package Control;

import Interface.ReglasNegocio;
import Negocio.Cliente;
import Negocio.Producto;
import Negocio.Tienda;

public class ControlNegocio implements ReglasNegocio {

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
    public boolean venderProducto(String codigo, int cedula, int cantidad) {
        return tienda.venderProducto(codigo, cedula, cantidad);
    }

    @Override
    public boolean hacerPedido(String codigo, int cantidad) {
        return tienda.hacerPedido(codigo, cantidad);
    }

    @Override
    public boolean comprobarStock(String codigo) {
        return tienda.comprobarStock(codigo);
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
    public String verProductos() {
        return tienda.verProductos();
    }

    @Override
    public String verClientes() {
        return tienda.verClientes();
    }

    @Override
    public Producto productoMasVendido() {
        return tienda.productoMasVendido();
    }

    @Override
    public Producto productoMenosVendido() {
        return tienda.productoMenosVendido();
    }

    @Override
    public double totalVentas() {
        return tienda.totalVentas();
    }

    @Override
    public int promedioVentas() {
        return tienda.promedioVentas();
    }
    
    public String verVentas(){
        return tienda.verVentas();
    }

}
