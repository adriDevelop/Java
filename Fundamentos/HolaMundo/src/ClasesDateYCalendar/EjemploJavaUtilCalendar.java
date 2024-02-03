package ClasesDateYCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        // Creamos nuestro objeto de tipo Calendar.
        Calendar calendario = Calendar.getInstance();

        // Ahora, vamos a inicializar nuestro objeto calendar con una fecha que nosotros le pasemos.
        calendario.set(2024, Calendar.FEBRUARY, 3);

        // Creamos un objeto de tipo date y le ponemos la fecha que nosotros hemos creado mediante nuestro Calendar haciendo uso del metodo getTime().
        Date fecha = calendario.getTime();

        // Imprimo la fecha por consola.
        System.out.println("calendario = " + fecha);

        // Tambien podemos hacer uso de nuestro SimpleDateFormat para darle formato.
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");

        // Creamos un String en el que almacenaremos nuestra fecha.
        String fechaConFormato = formato.format(fecha);

        // Mostramos la fecha por linea de comandos.
        System.out.println("fechaConFormato = " + fechaConFormato);
    }
}
