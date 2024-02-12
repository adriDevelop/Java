public class EjemploArregloDesafio {
    // La idea es cambiar el orden del array para que las posiciones se trunquen uno hacia abajo y el ultimo valor pase
    // a ser el primero, y el primero, el primero el segundo y asi sucesivamente.
    public static void main(String[] args) {

        // Creamos el array de elementos.
        int[] arr = new int[10];
        int[] arr2 = new int[10];

        // Rellenamos con datos el array mediante un for.
        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
        }

        // Ahora tenemos que cambiarles la posicion a los elementos del array y devolverlos junto con su posicion para
        // comprobar que se ha realizado correctamente.
        for(int i = 0; i < arr.length; i++){
            if (i == arr.length-1) {
                int elementoPosicion = arr[i];
                arr2[0] = elementoPosicion;
            } else {
                int elementoPosicion = arr[i];
                arr2[i + 1] = elementoPosicion;
            }
        }

        // Devuelvo por pantalla.
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr2[i];
            System.out.println("Posicion  [" + i + "] valor = " + arr[i]);
        }
    }
}
