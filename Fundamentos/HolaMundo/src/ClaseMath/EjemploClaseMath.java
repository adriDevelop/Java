package ClaseMath;

public class EjemploClaseMath {
    public static void main(String[] args) {

        // Vamos a calcular el valor de un entero absoluto.
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        // Maximo entre dos enteros.
        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);

        // Maximo entre dos enteros.
        double min = Math.min(3.5, 1.2);
        System.out.println("min = " + min);

        // Redondear a un valor maximo de un decimal.
        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);

        // Redondear un valor haci abajo.
        double abajo = Math.floor(3.5);
        System.out.println("abajo = " + abajo);

        // Simplemente redondear.
        long redondeo = Math.round(3.5);
        System.out.println("redondeo = " + redondeo);

        // constante pi.
        double pi = Math.PI;
        System.out.println("pi = " + pi);
    }
}
