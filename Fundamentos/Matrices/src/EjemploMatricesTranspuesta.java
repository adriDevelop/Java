public class EjemploMatricesTranspuesta {
    public static void main(String[] args) {

        // Creamos nuestra matriz.
        int matriz[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        // Devuelvo la matriz original.
        System.out.println("MATRIZ ORIGINAL.");
        for (int[] ints : matriz) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }

        // Ahora, igualamos a su transpuesta.
        int aux;
        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < i; j++){
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }

        // Ahora, muestro por pantalla el resultado.
        System.out.println("MATRIZ TRANSVERSADA:");
        for (int[] ints : matriz) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }
    }
}
