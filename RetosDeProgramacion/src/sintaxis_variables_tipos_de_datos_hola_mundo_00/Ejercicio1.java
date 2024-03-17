package sintaxis_variables_tipos_de_datos_hola_mundo_00;

// Ejercicio 1.- Crea un comentario en el código y coloca la URL del sitio web oficial del lenguaje seleccionado.
// https://docs.oracle.com/javase/tutorial/index.html

public class Ejercicio1 {
    public static void main(String[] args) {

        // Ejercicio 2.- Representa las diferentes sintaxis que existen de crear comentarios en el lenguaje.
        /*
            Como esta también
         */
        ///
        // Y esta otra tambien...
        // /

        // Ejercicio 3.- Crea una variable (y una contaste si el lenguaje lo soporta).
        String nombre;
        final String apellidos = "Velasco Carrasco";

        // Ejercicio 4.- Crea variables representando todos los tipos de datos primitivos del lenguaje (cadenas de texto, enteros, booleanos... )
        int variableEntera = 1;
        double variableDouble = 1.2;
        float variableFloat = 1.3f;
        short variableShort = 2;
        char variableChar = 'a';
        boolean variableBooleana = true;

        // Imprime por terminal el texto: "¡Hola, [y el nombre de tu lenguaje]!".
        System.out.println("¡Hola Java!");
    }
}
