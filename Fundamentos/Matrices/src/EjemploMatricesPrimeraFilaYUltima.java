public class EjemploMatricesPrimeraFilaYUltima {
    // La idea es que la primera fila y la ultima tengan 1 como valor y que las demas esten vacias, es decir, 0.
    // Editado el ejercicio para tener tanto la primera fila como la ultima y tambien la primera columan y la ultima
    // dejando asi un cuadrado en el centro de 0.
    public static void main(String[] args) {

        // Creamos nuestra matriz.
        int[][] matriz = new int[5][5];

        // Recorremos nuestra matriz y asignamos los valores correspondientes a nuestra primera fila y a nuestra ultima.
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (i == 0 || i == matriz.length-1){
                    matriz[i][j] = 1;
                }
                if (j == 0 ||j == matriz[i].length -1){
                    matriz[i][j] = 1;
                }
            }
        }

        // Retornamos la matriz.
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
