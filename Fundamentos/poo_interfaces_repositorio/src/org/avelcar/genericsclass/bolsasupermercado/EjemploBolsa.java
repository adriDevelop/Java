package org.avelcar.genericsclass.bolsasupermercado;

import org.avelcar.genericsclass.bolsasupermercado.productos.Fruta;
import org.avelcar.genericsclass.bolsasupermercado.productos.Lacteo;
import org.avelcar.genericsclass.bolsasupermercado.productos.Limpieza;
import org.avelcar.genericsclass.bolsasupermercado.productos.NoPerecible;

public class EjemploBolsa {

    public static <T> void muestraObjetosBolsa(BolsaSupermercado<T> bolsa){
        for(T a: bolsa){
            if (a instanceof Fruta){
                System.out.println("Producto: " + ((Fruta)a).getNombre());
            }
            if (a instanceof Limpieza){
                System.out.println("Producto: " + ((Limpieza)a).getNombre());
            }
            if (a instanceof Lacteo){
                System.out.println("Producto: " + ((Lacteo)a).getNombre());
            }
            if (a instanceof NoPerecible){
                System.out.println("Producto: " + ((NoPerecible)a).getNombre());
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("=====BOLSA DE FRUTA=====");

        BolsaSupermercado<Fruta> bolsa = new BolsaSupermercado<>();

        bolsa.addProducto(new Fruta("Manzana", 0.75, "Verde", 5));
        bolsa.addProducto(new Fruta("Uva", 1.25, "Morado", 2));
        bolsa.addProducto(new Fruta("Manzana", 0.75, "Roja", 3));
        bolsa.addProducto(new Fruta("Naranja", 1.00, "Naranja", 5));
        bolsa.addProducto(new Fruta("Fresas", 1.99, "Naranja", 2));

        muestraObjetosBolsa(bolsa);

        System.out.println("=====BOLSA DE LIMPIEZA=====");

        BolsaSupermercado<Limpieza> bolsaLimpieza = new BolsaSupermercado<>();

        bolsaLimpieza.addProducto(new Limpieza("Sanitol", 0.75, 2, "Lejia, Aromatizadores"));
        bolsaLimpieza.addProducto(new Limpieza("Lejia", 1.25, 1, "Lejia"));
        bolsaLimpieza.addProducto(new Limpieza("Fregasuelos", 0.75, 1.75, "Aromatizador, Jabon"));
        bolsaLimpieza.addProducto(new Limpieza("Limpia Cristales", 1.00, 1, "Aromatizador, Abrillantador"));
        bolsaLimpieza.addProducto(new Limpieza("Limipiador de Tapiceria", 1.99, 1, "Aromatizador, "));

        muestraObjetosBolsa(bolsaLimpieza);

        System.out.println("=====BOLSA DE LACTEOS=====");

        BolsaSupermercado<Lacteo> bolsaLacteos = new BolsaSupermercado<>();

        bolsaLacteos.addProducto(new Lacteo("Yogurt Natural", 1.75, 6, 20));
        bolsaLacteos.addProducto(new Lacteo("Copas de chocolate", 1.25, 2, 30));
        bolsaLacteos.addProducto(new Lacteo("Griego Stracciatela", 1.25, 6, 25));
        bolsaLacteos.addProducto(new Lacteo("Yogurt trozos de fruta", 1.50, 6, 100));
        bolsaLacteos.addProducto(new Lacteo("Tiramisú", 1.99,4 , 50));

        muestraObjetosBolsa(bolsaLacteos);

        System.out.println("=====BOLSA DE NO PERECIBLES=====");

        BolsaSupermercado<NoPerecible> bolsaNoPerecibles = new BolsaSupermercado<>();

        bolsaNoPerecibles.addProducto(new NoPerecible("Lentejas", 0.90, "500 gr", 20));
        bolsaNoPerecibles.addProducto(new NoPerecible("Habichuelas", 1.25, "1 kg", 30));
        bolsaNoPerecibles.addProducto(new NoPerecible("Arroz", 1.25, "1 kg", 25));
        bolsaNoPerecibles.addProducto(new NoPerecible("Garbanzos", 1.50, "1 kg", 100));
        bolsaNoPerecibles.addProducto(new NoPerecible("Fideos", 1.99,"1 kg" , 50));

        muestraObjetosBolsa(bolsaNoPerecibles);

    }
}
