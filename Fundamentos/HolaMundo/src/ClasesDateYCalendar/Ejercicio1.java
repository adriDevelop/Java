package ClasesDateYCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio1 {
    // Calcular edad ingresando la fecha de nacimiento de una persona.
    public static void main(String[] args) throws ParseException {

        // Creamos nuestro formato de fecha.
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        // Ahora creamos el objeto date que recojera la fecha de hoy.
        Date fechaActual = new Date();

        // Ahora, esta fecha debemos de darle el formato que hemos puesto en nuestro SimpleDateFormat().
        String fecha = formato.format(fechaActual);

        // Una vez tengamos la fecha con el formato, ahora debemos de pedirle al usuario la fecha.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su fecha de nacimiento usando el siguiente formato de fecha (DD/MM/YYYY)");
        String fechaIntroducida = sc.nextLine();

        // Cuando la tengamos, la almacenamos en nuestra clase date.
        Date fechaCumpleanios = formato.parse(fechaIntroducida);
        fechaActual = formato.parse(fecha);
        
        // Ahora, hacemos el calculo.
        int totalEdad = fechaActual.getYear() - fechaCumpleanios.getYear();
        
        // Imprimimos la edad.
        System.out.println("totalEdad = " + totalEdad);
    }
}
