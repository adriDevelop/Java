public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";

        // Concatenación con el símbolo +.
        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        // Concatenación con el método concat.
        detalle = curso.concat( " con ".concat(profesor));
        System.out.println(detalle);
    }
}
