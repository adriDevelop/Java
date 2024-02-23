package org.avelcar.actividad2.ejemploalmacen;

import org.avelcar.actividad2.almacen.*;

public class EjemploAlmacen {
    public static void main(String[] args) {

        // CREAMOS UN ARRAY DONDE ALMACENAREMOS TODOS LOS PRODUCTOS.
        Producto[] productos = new Producto[8];

        // ALMACENAMOS EN CADA LUGAR DEL ARRAY LOS PRODUCTOS.
        productos[0] = new Lacteo("Leche", 0.80, 150);
        productos[1] = new Lacteo("Yogur Griego", 1.50, 125);
        productos[2] = new Fruta("Manzana", 7.50, 150, "verde");
        productos[3] = new Fruta("Manzana", 9.50, 150, "roja");
        productos[4] = new Limpieza("Fregasuelos", 2.50, "Lejia, ambientador, perfumador", 2);
        productos[5] = new Limpieza("Lejia", 5.50, "Lejia", 2);
        productos[6] = new NoPerecible("Chocolate", 4.50, 150, 200);
        productos[7] = new NoPerecible("Kinder Bueno", 1.50, 150, 150);

        // MOSTRAMOS LOS VALORES RECORRIENDO EL ARRAY MEDIANTE UN FOR-EACH.
        for(Producto p: productos){
            System.out.println(p.toString());
        }
    }
}
