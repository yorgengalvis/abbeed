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
  private EnumProducto tipo;
  private int cantProducto;
  private double numeroProducto;
  private float precioUnidad;

    public Producto() {
    }

  
  
    public Producto(String nombre, EnumProducto tipo, int cantProducto, double numeroProducto, float precioUnidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantProducto = cantProducto;
        this.numeroProducto = numeroProducto;
        this.precioUnidad = precioUnidad;
    }

    

    
  
  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public EnumProducto getTipo() {
        return tipo;
    }

    public void setTipo(EnumProducto tipo) {
        this.tipo = tipo;
    }

    public int getCantProducto() {
        return cantProducto;
    }

    public void setCantProducto(int cantProducto) {
        this.cantProducto = cantProducto;
    }

    public double getNumeroProducto() {
        return numeroProducto;
    }

    public void setNumeroProducto(double numeroProducto) {
        this.numeroProducto = numeroProducto;
    }

    public float getPrecioUnidad() {
        return precioUnidad;
    }

  
     
    public void setPrecioUnidad(float precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", tipo=" + tipo + ", cantProducto=" + cantProducto + ", numeroProducto=" + numeroProducto + ", precioUnidad=" + precioUnidad + '}';
    }

   
    @Override
    public int compareTo(Producto o) {
            return nombre.compareTo(o.getNombre());
    }
  
}


