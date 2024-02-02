package WhileDoWhile;

public class SentenciaBucleEtiquetasBuscar {
    public static void main(String[] args) {
        // La idea es saber cuantas veces esta repetida un caracter que se encuentra en una frase.

        // Almacenamos la frase.
        String frase = "Tres tristes tigres tragan trigo en un trigal.";

        // Obtenemos su máximo y creamos un contador para mostrar las veces que está repetida la letra t.
        int max = frase.length();
        int contador = 0;

        // Ahora recorremos esa frase mediante un for().
        for(int i = 0; i < max; i++){
            char[] arrayLetras = frase.toLowerCase().toCharArray();
            if(arrayLetras[i] == 't'){
                contador++;
            }
        }
        
        // Devolvemos el contador.
        System.out.println("contador = " + contador);

        System.out.println("\n ================================ \n");


        // Otra forma de hacerlo USANDO FOR-EACH.
        contador = 0;

        // Cramos un array con los caracteres de la frase.
        char[] letrasFrase = frase.toLowerCase().toCharArray();

        // Recorremos mediante for-each.
        for(char a: letrasFrase){
            if (a == 't'){
                contador++;
            }
        }
        
        // Devolvemos contador.
        System.out.println("contador = " + contador);
    }
}
