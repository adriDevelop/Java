public class Primitivos {

    public static void main(String[] args) {

        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("Valor maximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("Valor minimo de un byte " + Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo byte corresponde en byte a " + Short.BYTES);
        System.out.println("Tipo byte corresponde en bites a " + Short.SIZE);
        System.out.println("Valor maximo de un byte: " + Short.MAX_VALUE);
        System.out.println("Valor minimo de un byte " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo byte corresponde en byte a " + Integer.BYTES);
        System.out.println("Tipo byte corresponde en bites a " + Integer.SIZE);
        System.out.println("Valor maximo de un byte: " + Integer.MAX_VALUE);
        System.out.println("Valor minimo de un byte " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo byte corresponde en byte a " + Long.BYTES);
        System.out.println("Tipo byte corresponde en bites a " + Long.SIZE);
        System.out.println("Valor maximo de un byte: " + Long.MAX_VALUE);
        System.out.println("Valor minimo de un byte " + Long.MIN_VALUE);
    }
}
