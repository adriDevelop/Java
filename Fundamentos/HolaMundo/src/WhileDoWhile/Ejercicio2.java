package WhileDoWhile;

import java.util.Scanner;

public class Ejercicio2 {
    // Pedir 20 notas finales de alumnos en una escala de 1 a 7.
    // Manejar decimales en las notas (double).
    // Mostrar el promedio de las notas mayores a 5, promedio de las notas inferiores a 4 y la cantidad de notas 1, ademas mostrar el promedio total.

    public static void main(String[] args) {

        // Declaro Scanner y variables necesarias.
        Scanner sc = new Scanner(System.in);
        int mayorCinco = 0;
        int menorCuatro = 0;
        int igualUno = 0;
        double totalMayorCinco = 0;
        double totalMenorCuatro = 0;
        double totalIgualUno = 0;
        double total = 0;

        // Pedimos las notas.
        pideNotas: for(int i = 0; i <20; i++){
            System.out.println("Introduce la nota del alumno (teniendo en cuenta que el maximo es 7 y el minimo 1).");
            double nota = sc.nextDouble();

            if (nota == 0){
                break pideNotas;
            }
            // Calculo el promedio de la nota y lo almaceno.
            else if (nota > 5){
                totalMayorCinco += nota;
                mayorCinco ++;
            } else if (nota < 4 && nota >1){
                totalMenorCuatro += nota;
                menorCuatro ++;
            } else if (nota == 1){
                totalIgualUno += nota;
                igualUno++;
            }

        }
        total = totalMayorCinco + totalMenorCuatro + totalIgualUno;
        System.out.println("El total del promedio es " + total/20);
        System.out.println("El promedio de mayores de 5 es " + totalMayorCinco/mayorCinco);
        System.out.println("El promedio de menores de 4 es " + totalMenorCuatro/menorCuatro);
        System.out.println("El promedio de iguales a 1 es " + totalIgualUno/igualUno);
    }
}
