package Control;

import Negocio.Cliente;
import Negocio.Proveedor;

public class ControlVista {
   private ControlNegocio control = new ControlNegocio();
   
  // public boolean guardarProducto(String nombre, String codigo, int cantidad, )
   
   public boolean guardarCliente(String nombre, int cedula, String telefono){
       return control.guardarCliente(new Cliente(nombre, cedula, telefono));
   }
   
   public boolean guardarProveedor(String nombre, String NIT, String telefono){
       return control.guardarProveedor(new Proveedor(nombre, NIT, telefono));
   }
}
