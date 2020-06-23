
package Negocio;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Andrey
 */
public class Tienda {

  TreeSet<Producto> productos = new TreeSet<Producto>();   
  
  
  
  
  public void AgregarProducto(Producto o){
      productos.add(o);
  }
  
  
  
  public void VenderProducto(Producto producto,Cliente cliente ,int cant){
      
      if(cant>=producto.getCantProducto()){
      
      Iterator<Producto> it = productos.iterator();
		while(it.hasNext()) {
                    
                    if(it.next().getNombre().equals(producto.getNombre())){
                    productos.remove(it.next());    }
                }
      }
  }





    
    
    public boolean guardarProducto(Producto producto){
        return false;
    }
    
    public boolean guardarCliente(Cliente cliente){
        return false;
    }
    
    public boolean guardarProveedor(Proveedor proveedor){
        return false;
    }

}
