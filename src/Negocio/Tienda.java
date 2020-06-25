package Negocio;

import Interface.ReglasNegocio;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 *
 * @author Andrey
 */
public class Tienda implements ReglasNegocio {

    private TreeSet<Producto> productos = new TreeSet<>();
    private TreeSet<Cliente> clientes = new TreeSet<>();
    private TreeSet<Proveedor> proveedores = new TreeSet<>();
    private LinkedList<Venta> ventas = new LinkedList<Venta>();
  
    @Override
    public Producto buscarProducto(String codigo) {
     Producto aux= null;
     for(Iterator<Producto> p = productos.iterator(); p.hasNext(); ){
     Producto buscar= p.next();
     if(buscar.getCodigo().equals(codigo)){
     aux=buscar;
     break;
     }}
    return aux;
    }

    @Override
    public boolean guardarProducto(Producto producto) {
       
        if(buscarProducto(producto.getCodigo())==null){
        productos.add(producto);
        return true;
        }
        return false;
    }

    @Override
    public boolean venderProducto(Producto producto, Cliente cliente, int cant) {
        if (cant <= producto.getCantProducto()) {
            Producto avender=buscarProducto(producto.getCodigo());
            avender.setCantProducto(avender.getCantProducto()-cant);
            Venta venta=new Venta(avender,cliente,cant);
            venta.calcularTotal();
            this.ventas.add(venta);
            return true;
        }
        return false;
    }
    
    
    public String verVentas(){
        String msg="";
        for (Venta ve:this.ventas) {
            msg+=ve.toString()+"\n";
        }
        return msg;
    }

    @Override
    public boolean hacerPedido(Producto producto, Proveedor proveedor, int cantidad) {
        if(buscarProducto(producto.getCodigo())!=null){
          Producto pe=buscarProducto(producto.getCodigo());
          int nuevaCantidad=pe.getCantProducto()+cantidad;
          pe.setCantProducto(nuevaCantidad);
      }
        return false;
    }

    @Override
    public boolean comprobarStock(Producto producto) {
      return producto.getCantProducto()<=producto.getStockMinimo();
    }

    @Override
    public Cliente buscarCliente(int cedula) {
       Cliente aux= null;
     for(Iterator<Cliente> c = clientes.iterator(); c.hasNext(); ){
     Cliente buscar= c.next();
     if(buscar.getCedula()==cedula){
     aux=buscar;
     break;
     }
     }
    return aux;
    }

    @Override
    public boolean guardarCliente(Cliente cliente) {
        if(buscarCliente(cliente.getCedula())==null){
            clientes.add(cliente);
        return true;
        }
        
        return false;
    }

    @Override
    public Proveedor buscarProveedor(String NIT) {
         Proveedor aux= null;
     for(Iterator<Proveedor> p = proveedores.iterator(); p.hasNext(); ){
     Proveedor buscar= p.next();
     if(buscar.getNit().equals(NIT)){
     aux=buscar;
     break;
     }
     }
    return aux;
    }

    @Override
    public boolean guardarProveedor(Proveedor proveedor) {
         if(buscarProveedor(proveedor.getNit())==null){
            proveedores.add(proveedor);
        return true;
        }
 
        return false;
    }
   
    @Override
    public String verProductos() {
        String msg = "";
        
        for(Iterator<Producto> p = productos.iterator(); p.hasNext();){
           msg += p.next().toString() + "\n";
        }
       
        return msg;
    }

    @Override
    public String verClientes() {
          String msg = "";
        for(Iterator<Cliente> c = clientes.iterator(); c.hasNext();){
           msg += c.next().toString() + "\n";
        }
        return msg;
    }

    @Override
    public String verProveedores() {
          String msg = "";
        for(Iterator<Proveedor> p = proveedores.iterator(); p.hasNext();){
           msg += p.next().toString() + "\n";
        }
        return msg;
    }

    public int cantidadProductoVendido(Producto producto){
        int aux=0;
        for(Venta ves:this.ventas){
            if(ves.getProducto().equals(producto)){
                aux+=ves.getCantidad();
            }
        }
       return aux;
    }
    
    public Producto productoMasVendido(){
        Producto mayor=this.ventas.getFirst().getProducto();
        for(Venta ves:this.ventas){
          if(cantidadProductoVendido(ves.getProducto())>cantidadProductoVendido(mayor)){
              ves.getProducto().setCantProducto(cantidadProductoVendido(ves.getProducto()));
              mayor=ves.getProducto();
          }
        }
        return mayor;
    }
    public Producto productoMenosVendido(){
        Producto menor=this.ventas.getFirst().getProducto();
        for(Venta ves:this.ventas){
          if(cantidadProductoVendido(ves.getProducto())<cantidadProductoVendido(menor)){
              ves.getProducto().setCantProducto(cantidadProductoVendido(ves.getProducto()));
              menor=ves.getProducto();
          }
        }
        return menor;
    }
    
    public double totalVentas(){
        double aux=0;
        for (Venta ve:this.ventas) {
            aux+=ve.getTotal();
        }
        return aux;
    }
    
    public int promedioVentas(){
        return (int)this.totalVentas()/this.ventas.size();
    }
    
    
    
}
