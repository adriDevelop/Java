import java.util.Scanner;

public class EjemploMatricesBuscar {
    // La idea es que busquemos un elemento dentro de una matriz y devolvamos el elemento y donde se encuentra.
    public static void main(String[] args) {

        // Declaro la matriz de enteros.
        int[][] matriz = new int[3][5];

        // Relleno los valores de cada uno de los componentes de la matriz pidiendole al usuario que me los introduzca.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca valores en la matriz:");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        // Ahora, le pido al usuario que introduzca un valor para mostrarle si existe y en que lugar de la matriz se
        // encuentra.
        System.out.println("Introduce un valor y te dire si se encuentra en la matriz y en que posicion se encuentra:");
        int posicionI = 0, posicionJ = 0, valorIntroducido = sc.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (valorIntroducido == matriz[i][j]){
                    posicionI = i;
                    posicionJ = j;
                    break;
                }
            }
        }

        // Ahora, devolvemos donde se encuentra y si se ha encontrado.
        if (!encontrado){
            System.out.println("Se ha encontrado el objeto. Se encuentra en la posicion [ " + posicionI + " ] [ " + posicionJ + " ].");
        }

    }
}
