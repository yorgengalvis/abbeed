package Negocio;

/**
 *
 * @author Andrey
 */
public class Proveedor implements Comparable<Proveedor>{

    private String nombre;
    private String NIT;
    private String telefono;

    public Proveedor() {
    }

    public Proveedor(String nombre, String NIT, String telefono) {
        this.nombre = nombre;
        this.NIT = NIT;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return NIT;
    }

    public void setNit(String NIT) {
        this.NIT = NIT;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public int compareTo(Proveedor o) {     
    return nombre.compareTo(o.getNombre());
    }

}
