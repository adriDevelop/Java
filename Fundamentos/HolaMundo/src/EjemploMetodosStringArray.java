public class EjemploMetodosStringArray {
    public static void main(String[] args) {
        
        String trabalenguas = "Trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        // Mostramos los caracteres de nuestro array.
        char[] array = trabalenguas.toCharArray();

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        // Convertimos de distinta manera nuestro array.
        // Hacemos que la a sea el separador de la frase.
        String[] array2 = trabalenguas.split("a");

        for (int i = 0; i < array2.length; i++){
            System.out.println(array2[i]);
        }
    }
}
