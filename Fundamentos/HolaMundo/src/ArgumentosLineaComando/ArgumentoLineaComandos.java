package ArgumentosLineaComando;

public class ArgumentoLineaComandos {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++){
            System.out.println("Argumento n " + i + " resultado " + args[i]);
        }

    }
}
