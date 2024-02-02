package WhileDoWhile;

public class SentenciasBuclesEtiquetas {
    public static void main(String[] args) {

        // Etiquetamos nuestro for para que podamos referenciarlo.
        bucle1: for(int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue;
                }
                System.out.print("i = " + i + ", j = " + j);
            }
        }

        System.out.print("\n===============================================\n");

        //
        bucle: for(int i = 1; i <= 7 ; i++) {
            int j = 1;
            while (j <= 8) {
                if (i == 6 || i == 7) {
                    System.out.println("Descanso fin de semana dia = " + i);
                    continue bucle;
                }
                System.out.println("Dia i = " + i + " trabajando = " + j + " horas. ");
                j++;
            }
        }

        System.out.print("\n===============================================\n");

        // Etiquetamos nuestro segundo for para poder jugar con nuestra etiqueta haciendole un break.
        etiqueta: for(int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    break etiqueta;
                }
                System.out.print("i = " + i + ", j = " + j);
            }
        }
    }
}
