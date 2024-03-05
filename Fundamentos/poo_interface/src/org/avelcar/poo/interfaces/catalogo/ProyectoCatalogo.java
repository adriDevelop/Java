package org.avelcar.poo.interfaces.catalogo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ProyectoCatalogo {
    public static void main(String[] args) throws ParseException {


        SimpleDateFormat ft = new SimpleDateFormat("yyyy/MM/dd");

        List<Producto> productos = new ArrayList<>();

        productos.add(new TvLcd(34000, "Sony", 40));
        productos.add(new TvLcd(28000, "Hisense", 45));
        productos.add(new Libro(18000, ft.parse("2024/03/05"), "Eric Gamma", "Elementos reusables POO", "Anaya"));
        productos.add(new Libro(14000, ft.parse("2024/02/23"),"Martin Flower", "UML Gota a Gota", "Alguna..."));
        productos.add(new Comic(1400, ft.parse("1980/03/14"), "Stan Lee", "Spiderman: Far from home", "Marvel", "Spiderman"));
        productos.add(new Comic(1400, ft.parse("1980/08/12"), "Stan Lee", "Spiderman: Back to home", "Marvel", "Spiderman"));
        productos.add(new IPhone(15000, "Apple California", "Rojo", "Iphone 11 Pro"));
        productos.add(new IPhone(12000, "Apple California", "Blanco", "Iphone 12"));

        for(Producto p : productos){
            System.out.println(p.toString());
        }
    }
}
