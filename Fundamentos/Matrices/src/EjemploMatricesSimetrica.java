public class EjemploMatricesSimetrica {
    public static void main(String[] args) {

        // Partimos con que la matriz es simetrica.
        boolean simetrica = true;

        // Creamos nuestra matriz.
        int matriz[][] = {
                {1,2,3,4},
                {2,1,0,5},
                {3,0,1,6},
                {4,5,6,7}
        };

        // Ahora vamos a comprobar si es o no simetrica.
        int i = 0, j = 0;
        while ( i < matriz.length && simetrica){
            while ( j < matriz[i].length && simetrica){
                if (matriz[i][j] != matriz[j][i]){
                    simetrica = false;
                }
                j++;
            }
            i++;
        }

        // Ahora devolvemos si es o no simetrica.
        System.out.println("Es simetrica? " + simetrica);
    }
}
