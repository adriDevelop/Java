public class EjemplosArreglosMostrariesimoNumero {
    // La idea es mostrar el i-esimo numero.
    public static void main(String[] args) {

        // Declaramos nuestro array de numeros enteros.
        int[] numEnteros = {1,2,3,4,5,6,980,890,900};

        // Ahora, vamos a mostrar el i-esimo numero de cada uno.
        for (int i = 0; i < numEnteros.length - i; i++){
            System.out.println(numEnteros[i] + " ==== " + numEnteros[numEnteros.length- 1 - i]);

        }
    }
}
