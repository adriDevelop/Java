public class OperadorInstaceOf {
    public static void main(String[] args) {

        String texto = "Creamos un objeto de la clase String...que tal!";

        Integer numero = 13;

        // Ahora vamos a validar si un objeto es tipo de una clase.
        boolean b1 = texto instanceof String;
        System.out.println("texto es del tipo String? " + b1);

        b1 = texto instanceof Object;
        System.out.println("texto es del tipo Object? " + b1);

        b1 = numero instanceof Integer;
        System.out.println("numero es del tipo Integer? " + b1);

        b1 = numero instanceof Number;
        System.out.println("numero es del tipo Number? " + b1);

        b1 = numero instanceof Object;
        System.out.println("numero es del tipo Object? " + b1);

    }
}
