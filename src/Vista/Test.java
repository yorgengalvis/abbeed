package Vista;

import Negocio.Cliente;
import Negocio.EnumProducto;
import Negocio.Producto;
import Negocio.Tienda;

public class Test {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
<<<<<<< HEAD
        tienda.guardarProducto(new Producto("Arroz", "001", EnumProducto.Supermercado, 10, 2, 2500, 2));
        tienda.guardarProducto(new Producto("Buñuelos", "002", EnumProducto.Supermercado, 10, 2, 2500, 2));
        tienda.guardarProducto(new Producto("Papel impresora", "006", EnumProducto.Papeleria, 10, 2, 3000, 2));
       
        System.out.println("Productos:");       
        System.out.println(tienda.verProductos());
        
        System.out.println(tienda.buscarProducto("006").toString());
        
        
        
=======
        tienda.guardarProducto(new Producto("Arroz", "001", EnumProducto.Supermercado, 10, 2500, 2));
        tienda.guardarProducto(new Producto("Buñuelos", "002", EnumProducto.Supermercado, 10, 2500, 2));
        tienda.guardarProducto(new Producto("Papel impresora", "001", EnumProducto.Papeleria, 10, 3000, 2));
       
        System.out.println(tienda.buscarProducto("002"));
        System.out.println(tienda.buscarProducto("001"));
        System.out.println("Productos:" + "\n");       
        System.out.println(tienda.verProductos());
        
        
        tienda.guardarCliente(new Cliente("Rodrigo",1156354,"31555865"));
        tienda.guardarCliente(new Cliente("Alberto",6565995,"23265652"));
        tienda.guardarCliente(new Cliente("Jota M.",96568152,"56364556"));
        tienda.guardarCliente(new Cliente("Michael Ja.",3563655,"98562542"));
        
        
        System.out.println(tienda.verClientes());
        
>>>>>>> master
    }
}
