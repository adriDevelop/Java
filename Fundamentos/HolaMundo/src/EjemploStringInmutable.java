public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";

        String resultado = curso.concat(profesor);
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

        // Hacemos uso de una función lambda ( función flecha ).
        String resultado2 = curso.transform(c -> {
            return c.concat(" con ".concat(profesor));
        });
        System.out.println(resultado2);

        // Reemplazamos los caracteres que sean a estén dento de resultado2 por A.
        System.out.println(resultado2.replace("a", "A"));
    }
}
