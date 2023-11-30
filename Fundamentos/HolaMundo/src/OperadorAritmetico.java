import javax.swing.*;

public class OperadorAritmetico {
    public static void main(String[] args) {

        int i = 5, j = 4, suma = i + j;
        System.out.println("resultado suma = " + suma);

        int resta = i - j;
        System.out.println("resultado resta = " + resta);

        int multiplicacion = i * j;
        System.out.println("resultado multiplicación = " + multiplicacion);

        float division = (float) i / j;
        System.out.println("resultado division = " + division);

        int resto = i % j;
        System.out.println("resto división = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));
        if ( numero%2 == 0 )
            JOptionPane.showMessageDialog(null, "numero par = " + numero);
        else
            JOptionPane.showMessageDialog(null, "numero impar = " + numero);




    }
}
