package ClasesDateYCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {

        // Creamos una nueva instancia de fecha.
        Date fecha = new Date();

        // Y devolvemos la fecha por pantalla.
        System.out.println("fecha = " + fecha);

        // Tambien se puede cambiar el fromato de fecha mediante DateFormat.
        SimpleDateFormat df = new SimpleDateFormat("dd MMMM yyyy");
        String fechaStr = df.format(fecha);

        System.out.println("fechaStr = " + fechaStr);

        // Tambien se puede cambiar el fromato de fecha mediante DateFormat.
        SimpleDateFormat df2 = new SimpleDateFormat("dd/MM/yyyy");
        fechaStr = df2.format(fecha);

        System.out.println("fechaStr = " + fechaStr);
    }
}
