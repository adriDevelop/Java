package ClasesDateYCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateConvertirDesdeString {
    public static void main(String[] args) throws ParseException {

        // Creamos nuestro SimpleDateFormat.
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");

        // Ahora, debemos pedirle al usuario una fecha válida.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una fecha válida.");
        String fechaIntroducida = sc.nextLine();

        // Ahora, debemos comprobar que la fecha ha sido introducida en el formato correcto.
        try{
            Date fecha = formato.parse(fechaIntroducida);

            Date fecha2 = new Date();

            // Comparamos fechas. Primer caso, la fecha es mayor que la actual. Segundo case, fecha anterior.
            if (fecha.after(fecha2)){
                System.out.println("fecha es posterior a fecha actual = " + fecha);
            } else if (fecha.before(formato.parse(formato.format(fecha2)))){
                System.out.println("fecha es anterior a fecha actual = " + fecha2);
            } else if (fecha.equals(formato.parse(formato.format(fecha2)))){
                System.out.println("fecha es igual a fecha actual = " + fecha2);
            }

            // Devuelvo la fecha por consola.
            System.out.println("fecha = " + fecha);
        } catch (ParseException e){
            e.printStackTrace();
        }
    }
}
