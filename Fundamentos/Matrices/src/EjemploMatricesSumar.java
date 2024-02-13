public class EjemploMatricesSumar {
    public static void main(String[] args) {

        // Creamos nuestras matrices.
        int[][] a = { {1,2,3}, {4,5,6}, {7,8,9}};
        int[][] b = { {10,20,30}, {40,50,60}, {70,80,90} };
        int[][] resultado = new int[3][3];

        // Ahora, recorremos nuestras matrices.
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                resultado[i][j] = a[i][j] + b[i][j];
            }
        }

        // Devolvemos las matrices para comprobar que las sumas se han realizado correctamente.
        System.out.println("MATRIZ A:");
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("MATRIZ B:");
        for (int i = 0; i < b.length; i++){
            for (int j = 0; j < b[i].length; j++){
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("MATRIZ RESULTADO:");
        for (int i = 0; i < resultado.length; i++){
            for (int j = 0; j < resultado[i].length; j++){
                System.out.print(resultado[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
