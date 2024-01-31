package WhileDoWhile;

public class SentenciaWhile {
    public static void main(String[] args) {
        // Usamos while().
        int contador = 0;

        while(contador < 5){
            System.out.println(contador);
            contador++;
        }

        // Segunda prueba while().
        contador = 0;
        boolean prueba = true;

        while(prueba){
            if (contador == 7){
                prueba = false;
            }
            System.out.println(contador);
            contador++;
        }

        // Nunca se va a ejecutar.
        prueba = false;
        while(prueba){
            System.out.println("Nunca se va a ejecutar porque prueba siempre es false");
        }

    }
}

