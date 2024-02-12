import java.util.Scanner;

public class Actividad4 {
      // La idea es crear un algoritmo que me devuelva el numero que mas se repite en el array.
      public static void main(String[] args) {

          // Creo mi array.
          int[] arr = new int[10];
          int[] arr2 = new int[10];
          int elemento = 0, numVeces = 0;
          Scanner sc = new Scanner(System.in);

          // Relleno el array con elementos que me va a ir pasando el usuario por teclado.
          System.out.println("Introduzca los valores en el array.");
          for (int i = 0; i < arr.length; i++){
              arr[i] = sc.nextInt();
          }

          // Ahora, le devuelvo las veces que se ha repetido el valor en el array y el valor que mas lo ha hecho.
          for (int i = 0; i < arr.length; i++){
              for (int j = 0; j < arr.length; j++){
                  if (arr[i] == arr[j]){
                      numVeces++;
                  }
              }
              arr2[i] = numVeces;
              numVeces = 0;
          }

          // Busco cual es el elemento del segundo array que mas valores tiene.
          for (int i = 0; i < arr.length; i++){
              if (arr2[i] > numVeces){
                  numVeces = arr2[i];
                  elemento = arr[i];
              }
          }

          // Y devuelvo el elemento por pantalla.
          System.out.println("El numero que mas se repite es " + elemento + " con un total de " + numVeces + " veces.");
      }
}
