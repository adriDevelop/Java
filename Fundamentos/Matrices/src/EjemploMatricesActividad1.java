public class EjemploMatricesActividad1 {
    // La idea es imprimir una X y que los espacios en blanco sean un _.
    public static void main(String[] args) {

        // Creamos nuestra matriz.
        String[][] matriz = new String[5][5];

        // Ahora rellenamos nuestra matriz como dice nuestro ejercicio.
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (i == j || j == matriz.length - i - 1){
                    matriz[i][j] = "X";
                }else {
                    matriz[i][j] = "_";
                }
            }
        }

        // Devuelvo por pantalla la matriz.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
