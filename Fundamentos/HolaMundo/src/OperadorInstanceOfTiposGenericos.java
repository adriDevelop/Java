public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {

        Object texto = "Esto es un texto...que tal!";

        boolean b1 = texto instanceof String;
        System.out.println("texto es del tipo String? = " + b1);

        Object numero = 1;

        b1 = numero instanceof Integer;
        System.out.println("numero es del tipo Integer? = " + b1);
    }
}
