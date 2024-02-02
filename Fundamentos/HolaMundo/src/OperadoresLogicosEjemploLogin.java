import java.util.Scanner;

public class OperadoresLogicosEjemploLogin {
    public static void main(String[] args) {

        // Definimos variables.
        String userName = "Adrian";
        String password = "12345";
        String userName2 = "Andrea";
        String password2 = "12345";
        Scanner sc = new Scanner(System.in);

        // Pedimos al cliente que introduzca los datos del login.
        System.out.println("Introduce nombre de usuario:");
        String usuario = sc.nextLine();
        System.out.println("Introduce password del usuario:");
        String pass = sc.nextLine();

        // Comprobamos los datos que nos introduce el cliente para saber si accede o no.
        boolean esAutenticado = false;
        esAutenticado = (userName.equals(usuario) || userName2.equals(usuario)) && (password.equals(pass) || password2.equals(pass));

        if (esAutenticado)
            System.out.println("Bienvenido ".concat(usuario).concat("!"));
        else
            System.out.println("Datos introducidos no válidos.");

    }
}
