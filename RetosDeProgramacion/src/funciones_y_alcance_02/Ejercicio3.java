package funciones_y_alcance_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio3 {
    /*
     * EJERCICIO:
     * - Crea ejemplos de funciones básicas que representen las diferentes
     *   posibilidades del lenguaje:
     *   Sin parámetros ni retorno, con uno o varios parámetros, con retorno...
     * - Comprueba si puedes crear funciones dentro de funciones.
     * - Utiliza algún ejemplo de funciones ya creadas en el lenguaje.
     * - Pon a prueba el concepto de variable LOCAL y GLOBAL.
     * - Debes hacer print por consola del resultado de todos los ejemplos.
     *   (y tener en cuenta que cada lenguaje puede poseer más o menos posibilidades)
     */
    public static void noRetornoNada(){
        System.out.println("Hola, soy una funcion y no retorno nada.");
    }

    public static String retornaNombre(String nombre){
        StringBuilder sb = new StringBuilder("El nombre es: ");
        return sb.append(nombre).toString();
    }

    public static String sumaValores(int numero1, int numero2){
        StringBuilder sb = new StringBuilder("El resultado de la suma es: ");
        int suma = numero1 + numero2;
        return sb.append(Integer.toString(suma)).toString();
    }

    public static String retornaMayor(int ...nums){
        StringBuilder sb = new StringBuilder("El numero mayor es: ");
        int mayor = nums[0];
        for(int a : nums){
            if (a > mayor){
                mayor = a;
            }
        }
        return sb.append(Integer.toString(mayor)).toString();
    }

    public static String retornaValoresOrdenados(List<Integer> numeros){
        Collections.sort(numeros);
        return numeros.toString();
    }

    /*
     * DIFICULTAD EXTRA (opcional):
     * Crea una función que reciba dos parámetros de tipo cadena de texto y retorne un número.
     * - La función imprime todos los números del 1 al 100. Teniendo en cuenta que:
     *   - Si el número es múltiplo de 3, muestra la cadena de texto del primer parámetro.
     *   - Si el número es múltiplo de 5, muestra la cadena de texto del segundo parámetro.
     *   - Si el número es múltiplo de 3 y de 5, muestra las dos cadenas de texto concatenadas.
     *   - La función retorna el número de veces que se ha impreso el número en lugar de los textos.
     *
     * Presta especial atención a la sintaxis que debes utilizar en cada uno de los casos.
     * Cada lenguaje sigue una convenciones que debes de respetar para que el código se entienda.
     */
    public static int retornaSumaStrings(String num1, String num2){
        int numVecesNum1 = 0, numVecesNum2 = 0;
        for (int i = 1; i < 100; i++){
            if (i%3 == 0) {
                System.out.println(num1);
                numVecesNum1++;
            } else if (i%5 == 0){
                System.out.println(num2);
                numVecesNum2++;
            } else if (i%3 == 0 && i%5 == 0) {
                System.out.println(num1 + " " + num2);
                numVecesNum1++;
                numVecesNum2++;
            }
        }
        return numVecesNum1 + numVecesNum2;
    }
    public static void main(String[] args) {

        List<Integer> valoresDesordenados = new ArrayList<>();
        valoresDesordenados.add(8);
        valoresDesordenados.add(1);
        valoresDesordenados.add(3);
        valoresDesordenados.add(4);
        valoresDesordenados.add(2);
        valoresDesordenados.add(5);

        noRetornoNada();
        System.out.println(retornaValoresOrdenados(valoresDesordenados));
        System.out.println(retornaNombre("Adrian"));
        System.out.println(retornaMayor(3,4,5,6,29,200,50009876,5));
        System.out.println(retornaSumaStrings("Hola", "Adrian"));
    }
}
