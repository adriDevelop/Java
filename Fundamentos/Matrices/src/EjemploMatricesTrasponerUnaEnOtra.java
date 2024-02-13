public class EjemploMatricesTrasponerUnaEnOtra {
    public static void main(String[] args) {

        // Creamos las dos matrices.
        int[][] matriz = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
                {17,18,19,20}
        };

        int[][] matriz2 = new int[4][5];

        // Vamos a transponer la primera en la segunda. Para ver el efecto, voy a mostrar primero la matriz.
        System.out.println("MATRIZ ORIGINAL:");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Ahora, transpongo la matriz en la segunda y la muestro.
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz2[j][i] = matriz[i][j];
            }
        }

        // Muestro la matriz transpuesta.
        System.out.println("MATRIZ TRANSPUESTA:");
        for (int i = 0; i < matriz2.length; i++){
            for (int j = 0; j < matriz2[i].length; j++){
                System.out.print(matriz2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
