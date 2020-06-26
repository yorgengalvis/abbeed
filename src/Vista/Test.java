package Vista;

import Control.ControlVista;
import Negocio.EnumProducto;

public class Test {
    public static void main(String[] args) {
        ControlVista control = new ControlVista();
        
        control.guardarProducto("Arroz", "001", EnumProducto.Supermercado, 10, 1200, 2);
        control.guardarProducto("Buñuelos", "002", EnumProducto.Supermercado,40, 2500, 2);
        control.guardarProducto("Papel impresora", "003", EnumProducto.Papeleria, 10, 3000, 2);

        System.out.println(control.buscarProducto("002"));
        System.out.println(control.buscarProducto("001"));
        System.out.println("Productos:" + "\n");       
        System.out.println(control.verProductos());
        
  
        control.guardarCliente("Rodrigo",1156354,"31555865");
        control.guardarCliente("Alberto",6565995,"23265652");
        System.out.println(control.verClientes());
    
        System.out.println("=========VENTAS================");
        
        control.venderProducto("001",1156354,  5);
        control.venderProducto("002",6565995,  10);
        control.venderProducto("002",6565995, 15);
        
        System.out.println("=================================");
        System.out.println("MAS VENDIDO");
        System.out.println(control.productoMasVendido().toString());
        System.out.println("MENOS VENDIDO");
        System.out.println(control.productoMenosVendido().toString());
        System.out.println("=================================");
        System.out.println(control.verVentas());
        System.out.println("TOTAL VENTAS");
        System.out.println(control.totalVentas());
        System.out.println("PROMEDIO");
        System.out.println(control.promedioVentas());
        
        System.out.println(control.verClientes());

    }
}
