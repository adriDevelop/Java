public class OperadoresIncrementales {
    public static void main(String[] args) {

        // Preincrementamos la variable i.
        int i = 1, j = ++i;
        // Muestra 2 ya que modificamos el valor de i incrementándolo en 1.
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Postincremento de la variable i.
        i = 2;
        j = i++;
        // Ahora mostraría 3 y 2 ya que el valor de j se mantiene porque se hace el incremento post-asignación.
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Predecremento de la variable i.
        i = 3;
        j = --i;
        // Devolverá 2 y 2 ya que se decrementa en el antes de la asignación.
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Postdecremento de la variable i.
        i = 4;
        j = i--;
        // Devolverá 3 y 4 ya que el decremento se realiza despues de la asignación.
        System.out.println("i = " + i);
        System.out.println("j = " + j);

    }
}
