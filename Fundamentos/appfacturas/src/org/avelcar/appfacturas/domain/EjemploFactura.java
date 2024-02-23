package org.avelcar.appfacturas.domain;

import org.avelcar.appfacturas.domain.Modelo.Cliente;
import org.avelcar.appfacturas.domain.Modelo.Factura;
import org.avelcar.appfacturas.domain.Modelo.ItemFactura;
import org.avelcar.appfacturas.domain.Modelo.Producto;

import java.util.Scanner;

public class EjemploFactura {

    public static void main(String[] args) {

        // Creamos un cliente.
        Cliente cliente = new Cliente();
        cliente.setNif("31016821X");
        cliente.setNombre("Adrian");

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la descripcion de la factura: ");
        String desc = sc.nextLine();

        // Creamos una Factura.
        Factura factura = new Factura(desc, cliente);

        // Anadimos los productos mediante una iteraccion.
        Producto producto;
        String nombre;
        double precio;
        int cantidad;

        System.out.println();

        for(int i = 0; i < 5; i++){
            producto = new Producto();
            System.out.print("Introduzca el nombre del producto No " + producto.getCodigo() + ": ");
            nombre = sc.next();
            producto.setNombre(nombre);

            System.out.print("Introduzca el precio del producto No " + producto.getCodigo() + ": ");
            precio = sc.nextDouble();
            producto.setPrecio(precio);

            System.out.print("Introduzca la cantidad del producto No " + producto.getCodigo() + ": ");
            cantidad = sc.nextInt();
            producto.setPrecio(precio);

            ItemFactura item = new ItemFactura(cantidad, producto);
            factura.addItemFactura(item);

            System.out.println();
        }
        System.out.println(factura.generarDetalle());
    }
}
