public class EjemploMatricesSumarUnaSola {
    public static void main(String[] args) {

        // Creamos nuestra matriz y otra matriz para almacenar el resultado
        int[][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int sumaFila = 0, sumaColumna = 0;

        // Hacemos la suma de nuestra matriz.
        for (int i = 0; i < a.length; i++){
            sumaFila = 0;
            sumaColumna = 0;
            for (int j = 0; j < a[i].length; j++){
                sumaFila += a[i][j];
                sumaColumna += a[j][i];
            }
            // Devuelvo los totales.
            System.out.println("TOTAL FILA SUMA: " + i + ": " + sumaFila);
            System.out.println("TOTAL SUMA COLUMNA: " + i + ": " + sumaColumna);
        }




    }
}
