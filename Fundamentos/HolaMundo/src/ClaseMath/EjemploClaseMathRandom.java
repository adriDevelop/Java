package ClaseMath;

import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        double random = Math.random();
        System.out.println("random = " + random);

        System.out.println("random = " + Math.round(random));

        // Ejemplo.
        String[] colores = {"rojo", "azul", "amarillo", "verde", "blanco", "negro"};

        // Si queremos obtener un numero entre el 0 y el 7.
        random *= colores.length;
        System.out.println("colores[random] = " + colores[(int) random]);

        // Ahora vamos a hacer uso de Random.
        Random randomObj = new Random();
        System.out.println("randomObj = " + colores[randomObj.nextInt(colores.length)]);
    }
}
