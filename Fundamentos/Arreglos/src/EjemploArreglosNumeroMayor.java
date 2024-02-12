import java.util.Scanner;

public class EjemploArreglosNumeroMayor {

   // La idea es que, a traves de consola, nos ingresen datos numericos y despues devolder el numero mayor.
   public static void main(String[] args) {

       // Declaro un array de enteros, con un tamanio de 5, nuestro Scanner y una variable para almacenar el valor mayor
       // .
       int[] a = new int[5];
       int mayor = 0;
       Scanner sc = new Scanner(System.in);

       // Pido los valores por pantalla.
       System.out.println("Introduzca 5 valores enteros y le devolveré el mayor de ellos:");
       for (int i = 0; i < a.length; i++){
           a[i] = sc.nextInt();
       }

       // Comprobamos cual de ellos el el mayor y lo devolvemos.
       for (int j : a) {
           if (mayor < j)
               mayor = j;
       }
       System.out.println("mayor = " + mayor);
   }
}
