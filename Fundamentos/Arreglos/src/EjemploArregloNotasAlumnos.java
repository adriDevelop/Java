import java.util.Scanner;

public class EjemploArregloNotasAlumnos {
    public static void main(String[] args) {

        // Creamos los arrays de las clases donde almacenaremos las notas.
        double sumaNotasMatematicas = 0, sumaNotasHistoria = 0, sumaNotasLengua = 0;
        double[] claseMatematicas, claseHistoria, claseLengua;
        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLengua = new double[7];

        // Creamos nuestra clase Scanner y pedimos las notas por asignatura.
        Scanner sc = new Scanner(System.in);
        int i = 0;
        do {
            System.out.println("Introduzca 7 notas de estudiantes para matematicas:");
            claseMatematicas[i] = sc.nextDouble();
            i++;
        } while(i < claseMatematicas.length);
        i = 0;
        do {
            System.out.println("Introduzca 7 notas de estudiantes para historia:");
            claseHistoria[i] = sc.nextDouble();
            i++;
        } while(i < claseHistoria.length);
        i = 0;
        do {
            System.out.println("Introduzca 7 notas de estudiantes para lengua:");
            claseLengua[i] = sc.nextDouble();
            i++;
        } while(i < claseLengua.length);

        // Una vez tengamos todas las notas de todas las asignaturas, vamos a calcular su promedio en cada una de las
        // asignaturas.
        for(int j = 0; j < claseMatematicas.length; j++){
            sumaNotasMatematicas += (int) claseMatematicas[j];
        }
        for(int j = 0; j < claseHistoria.length; j++){
            sumaNotasHistoria += (int) claseHistoria[j];
        }
        for(int j = 0; j < claseLengua.length; j++){
            sumaNotasLengua += (int) claseLengua[j];
        }

        // Calculo del promedio.
        System.out.println("El promedio de la nota de matematicas es: " + sumaNotasMatematicas/claseMatematicas.length);
        System.out.println("El promedio de la nota de historia es: " + sumaNotasHistoria/claseHistoria.length);
        System.out.println("El promedio de la nota de lengua es: " + sumaNotasLengua/claseLengua.length);

    }
}
