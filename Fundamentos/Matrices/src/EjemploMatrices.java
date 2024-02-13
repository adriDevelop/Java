public class EjemploMatrices {
    public static void main(String[] args) {

        // Creamos nuestra primera matriz. Tendrá 2 filas y 4 columnas.
        int[][] numeros = new int[2][4];

        // Vamos a rellenar la matriz con valores.
        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; j++){
                numeros[i][j] = j;
            }
        }

        // Mostramos el numero de filas y el numero de columnas por pantalla.
        System.out.println("Numero de filas: " + numeros.length);
        System.out.println("Numero de columnas: " + numeros[0].length);

        // Devolvemos el primer elemento de la matriz.
        System.out.println("Primer elemento de la matriz: " + numeros[0][0]);
        System.out.println("Ultimo elemento de la matriz: " + numeros[numeros.length-1][numeros[1].length-1]);

    }
}