import javax.swing.*;

public class SentenciaForArray {
    public static void main(String[] args) {

        // Creamos un array de String.
        String[] nombres = {"Adrián", "Andrea", "Pepe", "Paco", "Maria", "Lalo", "Pepa"};

        // Iteramos el array que hemos creado.
        for (int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i]);
        }

        // Vamos a crear un ejemplo en el que el cliente quiere consultar en la base de datos si existe el cliente.
        String mensaje = JOptionPane.showInputDialog("Ingrese el nombre a buscar.");

        boolean encontrado = false;
        int longitudArray = nombres.length;

        // Recorremos el array y confirmamos si existe el nombre en el array de nombres.
        for (int i = 0; i < longitudArray; i++) {
            if (nombres[i].equalsIgnoreCase(mensaje)) {
                encontrado = true;
                break;
            }
        }

        // Confirmamos al cliente que se ha encontrado o no el nombre.
        if (encontrado) {
            JOptionPane.showMessageDialog(null, "Si existe el nombre en la base de datos.");
        } else {
            JOptionPane.showMessageDialog(null, "No existe el nombre en la base de datos.");
        }
    }
}
