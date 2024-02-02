import javax.swing.*;

public class ConversionDeTipos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Introduzca número entero.");
        String mensajeError = "Debe ingresar un número entero.";

        int numeroInt = 0;
        double numeroDouble = 0;
        try{
            numeroInt = Integer.parseInt(numeroStr);
            numeroDouble = Double.parseDouble(numeroStr);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, mensajeError);
            main(args);
            System.exit(0);
        }

        // Mensajes a mostrar.
        String mensajeNumeroEntero = "El número pasado entero es = " + numeroInt;
        String mensajeNumeroDouble = "El número pasado double es = " + numeroDouble;
        String mensaje = mensajeNumeroEntero + "\n" + mensajeNumeroDouble;


        JOptionPane.showMessageDialog(null, mensaje);
    }
}
