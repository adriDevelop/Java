package ProyectoOrdenCompra;

import java.text.DateFormat;
import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {
        // Instancio el cliente.
        Cliente cliente = new Cliente("Adrian", "Velasco Carrasco");
        Cliente cliente2 = new Cliente("Andrea", "Velasco Carrasco");
        Cliente cliente3 = new Cliente("Dani", "Velasco Carrasco");

        // Instancio el producto.
        Producto[] productos = new Producto[5];
        productos[0] = new Producto("HACENDADO", "Spaghetti", 2.00);
        productos[1] = new Producto("HACENDADO", "Macarrones", 1.79);
        productos[2] = new Producto("HACENDADO", "Muslo de pollo", 7.0);
        productos[3] = new Producto("HACENDADO", "Leche", 8.0);
        productos[4] = new Producto("HACENDADO", "Colacao", 3.0);

        // Instancio la fecha.
        Date date = new Date();

        // Ahora, que ya tenemos lo necesario, creamos nuestra orden.
        OrdenCompra orden = new OrdenCompra("Compra");
        OrdenCompra orden2 = new OrdenCompra("Compra");
        OrdenCompra orden3 = new OrdenCompra("Compra");

        // Ahora, hacemos todas las ordenes.
        orden.setCliente(cliente);
        orden.setFecha(date);
        for(Producto p: productos){
            orden.addProducto(p);
        }

        orden2.setCliente(cliente2);
        orden2.setFecha(date);
        for(Producto p: productos){
            orden2.addProducto(p);
        }

        orden3.setCliente(cliente3);
        orden3.setFecha(date);
        for(Producto p: productos){
            orden3.addProducto(p);
        }

        // DEVUELVO EL TOSTRING().
        System.out.println(orden.toString() + " \n");
        System.out.println(orden2.toString() + " \n");
        System.out.println(orden3.toString() + " \n");

    }
}
