package Vista;

import Negocio.EnumProducto;
import Negocio.Producto;
import Negocio.Tienda;

public class Test {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        tienda.guardarProducto(new Producto("Arroz", "001", EnumProducto.Supermercado, 10, 2, 2500, 2));
        tienda.guardarProducto(new Producto("Buñuelos", "002", EnumProducto.Supermercado, 10, 2, 2500, 2));
        tienda.guardarProducto(new Producto("Papel impresora", "001", EnumProducto.Papeleria, 10, 2, 3000, 2));
       
        System.out.println("Productos:" + "\n");       
        System.out.println(tienda.verProductos());
    }
}
