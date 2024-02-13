public class EjemploMatricesDivisionDiagonal {
    // La idea es dejar toda nuestra matriz a 0 excepto la fila que los divide, que la pondremos a 1.
    public static void main(String[] args) {

        // Declaramos nuestra matriz.
        int[][] matriz = new int[5][5];

        // Ahora, calculamos cual es la que divide a nuestra matriz en la mitad y la igualamos a 1.
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (i == j){
                    matriz[i][j] = 1;
                }
            }
        }

        // Devuelvo la matriz por pantalla.
        for (int[] i: matriz){
            for(int valor: i){
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }
}
