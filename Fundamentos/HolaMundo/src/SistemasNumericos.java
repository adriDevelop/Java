public class SistemasNumericos {
    public static void main(String[] args) {

        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);

        // Convertir en un numero entero binario.
        System.out.println("Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        // Convertir en un numero entero.
        int numeroBinario = 0b111110100;
        System.out.println("numero entero = " + numeroBinario);

        // Convertir a un entero octal.
        System.out.println("Numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));

        // Convertir en un numero entero.
        int numeroOctal = 0764;
        System.out.println("numero entero = " + numeroBinario);

        // Convertir a un entero octal.
        System.out.println("Numero Hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));

        // Convertir en un numero entero.
        int numeroHexadecimal = 0x1f4;
        System.out.println("numero entero = " + numeroBinario);


    }
}
