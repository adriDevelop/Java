import javax.swing.*;
import java.util.Scanner;

public class ConversorNumerosEntradaScanner {
    public static void main(String[] args) {

        // Instacia de la clase Scanner.
        Scanner scn = new Scanner(System.in);

        // Abrimos una ventana de dialogo para introducir los datos y como estos datos vienen dados en String, los
        // convertimos en entero y los almacenamos en otra variable para poder hacer las conversiones.
        System.out.println("Introduzca un número entero");
        String numeroStr = scn.nextLine();
        int numeroDecimal = 0;
        // Controlamos que la variable sea entera.
        try{
             numeroDecimal = Integer.parseInt(numeroStr);
        }catch(NumberFormatException e){
            System.out.println("Debe ingresar un numero entero.");
            main(args);
            System.exit(0);
        }
        
        // Mensajes personalizados para cada conversión.
        String mensajeBinario = "Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal) ;
        String mensajeOctal = "Numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String mensajeHexadecimal = "Numero Hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        // Mensaje a mostrar.
        String message = mensajeBinario +
        "\n" + mensajeOctal+
        "\n" + mensajeHexadecimal;

        // Ventana de dialogo que muestra el mensaje por pantalla.
        System.out.println(message);
    }
}
