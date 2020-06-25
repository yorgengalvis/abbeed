/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author YorgenGalvis
 */
public class Venta {
    Producto producto;
    Cliente cliente;
    double total;
    int cantidad;
 

    public Venta() {
    }
    

    public Venta(Producto producto, Cliente cliente, int cantidad) {
        this.producto = producto;
        this.cliente = cliente;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }
    
    public void calcularTotal(){
       double total=(producto.getPrecioUnidad()*cantidad);
       double totalimpuesto=calcularImpuesto(); 
       totalimpuesto*=total;
       double totalneto=total+totalimpuesto;
        this.total=totalneto;
     }
    
    public double calcularImpuesto(){
         double iva=producto.getTipo().getIva();
        return (iva/100)*this.cantidad;
    }
   
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public String toString(){
        return this.producto.getCodigo()+" Nombre: "+this.producto.getNombre()+" Cantidad: "+this.cantidad+"  Total: "+this.total;
    }
    
    
}
