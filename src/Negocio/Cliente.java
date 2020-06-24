package Negocio;

import java.util.TreeSet;

/**
 *
 * @author Andrey
 */
public class Cliente implements Comparable<Cliente>{
    
   private  String nombre;
   private  int cedula;
   private  String telefono;

    public Cliente() {
    }

    public Cliente(String nombre, int cedula, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
    }
<<<<<<< HEAD
    
    

=======

    
    
>>>>>>> master
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", cedula=" + cedula + ", telefono=" + telefono + '}';
    }

<<<<<<< HEAD
   
=======
    @Override
    public int compareTo(Cliente o) {
    return nombre.compareTo(o.getNombre());    
    }

    
>>>>>>> master
  
    
}
