import javax.swing.*;

public class ConversorNumeros {
    public static void main(String[] args) {

        // Abrimos una ventana de dialogo para introducir los datos y como estos datos vienen dados en String, los
        // convertimos en entero y los almacenamos en otra variable para poder hacer las conversiones.
        String numeroStr = JOptionPane.showInputDialog(null, "Introduzca un número entero");
        int numeroDecimal = 0;
        // Controlamos que la variable sea entera.
        try{
             numeroDecimal = Integer.parseInt(numeroStr);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Debe ingresar un numero entero.");
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
        JOptionPane.showMessageDialog(null, message);
    }
}
