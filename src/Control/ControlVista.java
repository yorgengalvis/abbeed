package Control;

import Negocio.Cliente;
import Negocio.EnumProducto;
import Negocio.Producto;

public class ControlVista {

    private ControlNegocio control = new ControlNegocio();

    public boolean guardarProducto(String nombre, String codigo, EnumProducto tipo, int cantidad, double precioUnidad, int stockMinimo) {
        return control.guardarProducto(new Producto(nombre, codigo, tipo, cantidad, cantidad, stockMinimo));
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

    public String buscarProducto(String codigo) {
        return control.buscarProducto(codigo).toString();
    }

    public String verClientes() {
        return control.verClientes();
    }

    public String buscarCliente(int cedula) {
        return control.buscarCliente(cedula).toString();
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
