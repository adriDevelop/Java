public class EjemploMatricesTamanioVariable {
    public static void main(String[] args) {

        // Definimos nuestra matriz.
        int[][] matriz = new int[3][];

        // Y le damos distintos tamaños de columnas.
        matriz[0] = new int[2];
        matriz[1] = new int[3];
        matriz[2] = new int[4];

        // Mostrar la longitud de cada una de ellas.
        System.out.println("Longitud de nuestra matriz: " + matriz.length);
        System.out.println("Longitud de nuestra primera fila: " + matriz[0].length);
        System.out.println("Longitud de nuestra segunda fila: " + matriz[1].length);
        System.out.println("Longitud de nuestra tercera fila: " + matriz[2].length);

        // Ahora, vamos a rellenar los elementos de la matriz.
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = j;
            }
        }

        // Ahora imprimimos en pantalla los valores de cada uno.
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
        }
    }
}
