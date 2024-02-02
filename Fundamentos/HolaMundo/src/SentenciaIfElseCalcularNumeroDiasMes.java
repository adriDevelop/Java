public class SentenciaIfElseCalcularNumeroDiasMes {
    public static void main(String[] args) {

        // Declaramos las variables que vamos a a
        int mes = 2; // Mes de Septiembre.
        int numeroDiasMes = 0;
        int anio = 2023;

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes ==12){
            numeroDiasMes = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
            numeroDiasMes = 30;
        } else if (mes == 2) {
            // Regla para saber si un año es bisiesto.
            // Si es divisible por 400 o si lo es entre 4 y no lo es entre 100.
            if (anio % 400 == 0 || (anio % 4 == 0) && !(anio % 100 == 0)) {
                numeroDiasMes = 29;
            } else {
                numeroDiasMes = 28;
            }
        }

        // Mostramos el número del mes y el número de días que tiene ese mes.
        System.out.println("El numero de días que tiene el mes de ".concat(String.valueOf(mes)).concat(" es de ").concat(String.valueOf(numeroDiasMes)));
    }
}
