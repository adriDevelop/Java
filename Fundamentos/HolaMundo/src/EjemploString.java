public class EjemploString {
    public static void main(String[] args) {

        // Declaración de forma implícita.
        String curso = "Programación Java";
        // Declaración de forma explícita.
        String curso2 = new String("Programación Java");

        // Comparamos los objetos.
        boolean esIgual = curso == curso2;
        System.out.println("Es igual? " + esIgual);

        // Comparamos el valor.
        esIgual = curso.equals(curso2);
        System.out.println("Es igual? " + esIgual);

        // Volvemos a crear un nuevo curso.
        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println("Es igual? " + esIgual);
    }
}
