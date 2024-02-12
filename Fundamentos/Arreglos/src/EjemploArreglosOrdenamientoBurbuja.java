public class EjemploArreglosOrdenamientoBurbuja {
    // La idea es ordenar el array con un algoritmo burbuja, es decir, comparando todos los objetos para saber cuales
    // son mayores que otros en terminos de la posicion de la tabla UNICODE.

    public static void main(String[] args) {

        // Lo primero que vamos a realizar es inicializar un array de Strings.
        String[] arregloStrings = {"Andrea", "Adrian", "Manolo", "Eva", "Ainhoa", "Xavier", "Monica"};

        // Ahora, vamos a comparar cada elemento del array con el siguiente para saber si es mayor o no en la
        // tabla UNICODE.
        for (int i = 0; i < arregloStrings.length -1; i++){

            for (int j = 0; j < arregloStrings.length -1 -i; j++){
                if (arregloStrings[j+1].compareTo(arregloStrings[j]) < 0){
                    String aux = arregloStrings[j];
                    arregloStrings[j] = arregloStrings[j+1];
                    arregloStrings[j] = aux;
                }
            }

        }

        // Ahora imprimimos los elementos por pantalla.
        for (String a: arregloStrings){
            System.out.println("Elementos del array = " + a);
        }

    }
}
