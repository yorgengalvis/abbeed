package Control;

import Negocio.Cliente;
import Negocio.EnumProducto;
import Negocio.Producto;
import javax.swing.JOptionPane;

public class ControlVista {

    private ControlNegocio control = new ControlNegocio();

    public boolean guardarProducto(Producto pro) {
        return control.guardarProducto(pro);
    }

    public boolean guardarCliente(String nombre, int cedula, String telefono) {
        return control.guardarCliente(new Cliente(nombre, cedula, telefono));
    }

    public boolean venderProducto(String codigo, int cedula, int cantidad) {
        return control.venderProducto(codigo, cedula, cantidad);
    }

    public boolean comprobarStock(String codigo) {
        return control.comprobarStock(codigo);
    }

    public boolean hacerPedido(String codigo, int cantidad) {
        return control.hacerPedido(codigo, cantidad);
    }

    public String verProductos() {
        return control.verProductos();
    }

    public Producto buscarProducto(String codigo) {
        return control.buscarProducto(codigo);
    }
    
    public int totalProductosVendidas(){
        return control.totalProductosVendidas();
    }

    public String verClientes() {
        return control.verClientes();
    }

    public Cliente buscarCliente(int cedula) {
        return control.buscarCliente(cedula);
    }

    public String productoMasVendido() {
        return control.productoMasVendido().toString();
    }

    public String productoMenosVendido() {
        return control.productoMenosVendido().toString();
    }

    public double totalVentas() {
        return control.totalVentas();
    }

    public double promedioVentas() {
        return control.promedioVentas();
    }
    
    public String verVentas(){
        return control.verVentas();
    }

}
