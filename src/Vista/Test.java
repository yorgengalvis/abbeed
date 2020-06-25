package Vista;

import Negocio.Cliente;
import Negocio.EnumProducto;
import Negocio.Producto;
import Negocio.Proveedor;
import Negocio.Tienda;

public class Test {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
<<<<<<< HEAD
        
        tienda.guardarProducto(new Producto("Arroz", "001", EnumProducto.Supermercado, 10, 2500, 2));
        tienda.guardarProducto(new Producto("Buñuelos", "002", EnumProducto.Supermercado, 10, 2500, 2));
        tienda.guardarProducto(new Producto("Papel impresora", "001", EnumProducto.Papeleria, 10, 3000, 2));
=======
        Producto p1=new Producto("Arroz", "001", EnumProducto.Supermercado, 10, 2500, 2);
        Producto p2=new Producto("Buñuelos", "002", EnumProducto.Supermercado,40, 2500, 2);
        Producto p3=new Producto("Papel impresora", "001", EnumProducto.Papeleria, 10, 3000, 2);
        tienda.guardarProducto(p1);
        tienda.guardarProducto(p2);
        tienda.guardarProducto(p3);
>>>>>>> master
       
        System.out.println(tienda.buscarProducto("002"));
        System.out.println(tienda.buscarProducto("001"));
        System.out.println("Productos:" + "\n");       
        System.out.println(tienda.verProductos());
        
        Cliente c1=new Cliente("Rodrigo",1156354,"31555865");
        Cliente c2=new Cliente("Alberto",6565995,"23265652");
        Cliente c3=new Cliente("Jota M.",96568152,"56364556");
        Cliente c4=new Cliente("Michael Ja.",3563655,"98562542");
        tienda.guardarCliente(c1);
        tienda.guardarCliente(c2);
        tienda.guardarCliente(c3);
        tienda.guardarCliente(c4);
        System.out.println(tienda.verClientes());
        
        tienda.guardarProveedor(new Proveedor("Antonio", "355585", "3155865"));
        tienda.guardarProveedor(new Proveedor("Barbaro", "5551545", "3155865"));
        tienda.guardarProveedor(new Proveedor("Jose Lino", "9851585", "3155865"));
        
        System.out.println("=========VENTAS================");
        tienda.venderProducto(p1, c1, 5);
        tienda.venderProducto(p2, c2, 10);
        tienda.venderProducto(p2, c2, 15);
        
        System.out.println("=================================");
        System.out.println("MAS VENDIDO");
        System.out.println(tienda.productoMasVendido().toString());
        System.out.println("MENOS VENDIDO");
        System.out.println(tienda.productoMenosVendido().toString());
        System.out.println("=================================");
        System.out.println(tienda.verVentas());
        System.out.println("TOTAL VENTAS");
        System.out.println(tienda.totalVentas());
        System.out.println("PROMEDIO");
        System.out.println(tienda.promedioVentas());
        //System.out.println(tienda.verProveedores());
        
        System.out.println(tienda.verClientes());

    }
}
