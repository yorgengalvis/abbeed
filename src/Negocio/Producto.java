/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Andrey
 */
public class Producto implements Comparable<Producto>{
    
  private String nombre;
  private String codigo;
  private EnumProducto tipo;
  private int cantidad;
  private float precioUnidad;
  private int stockMinimo;

    public Producto() {
    }

    public Producto(String nombre, String codigo, EnumProducto tipo, int cantidad,float precioUnidad, int stockMinimo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.tipo = tipo;
        this.cantidad = cantidad;     
        this.precioUnidad = precioUnidad;
        this.stockMinimo = stockMinimo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public EnumProducto getTipo() {
        return tipo;
    }

    public void setTipo(EnumProducto tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(float precioUnidad) {
        this.precioUnidad = precioUnidad;
    }
    
       public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", codigo=" + codigo + ", tipo=" + tipo + ", cantidad=" + cantidad + ", precioUnidad=" + precioUnidad + ", stockMinimo=" + stockMinimo + '}';
    }
    
    

    @Override
    public int compareTo(Producto o) {
            return nombre.compareTo(o.getNombre());
    }

 

  
  
   

  
}


