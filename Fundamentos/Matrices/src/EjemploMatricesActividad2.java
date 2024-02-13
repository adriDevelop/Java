public class EjemploMatricesActividad2 {
    // La idea es hacer una silla con 1 en la matriz y todos los demas valores en 0.
    public static void main(String[] args) {

        // Creo mi matriz.
        int[][] matriz = new int[5][5];

        // Le asigno los valores correspondientes.
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (j == 0 || i == matriz.length/2 && j != matriz.length -1 || j == matriz.length -1 && i >= matriz.length / 2){
                    matriz[i][j] = 1;
                }
            }
        }

        // Lo muestro por pantalla.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
