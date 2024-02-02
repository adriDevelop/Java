import java.util.Scanner;

public class OperadoresLogicosEjemploLoginArray {
    public static void main(String[] args) {

        // Creamos los arrays con los datos de cada usuario.
        String[] userNames = new String[2];
        String[] passwords = new String[2];
        userNames[0] = "Adrian";
        userNames[1] = "Andrea";
        passwords[0] = "12345";
        passwords[1] = "12345";

        // Declaramos nuestro scanner y las variables que pediremos al usuario.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre de usuario:");
        String userName = sc.nextLine();
        System.out.println("Introduce tu contraseña:");
        String pass = sc.nextLine();

        // Iteramos cada uno de las arrays.
        boolean esAutenticado = false;
        for (int i = 0; i < userNames.length; i++){
            if (userNames[i].equals(userName) && passwords[i].equals(pass))
                esAutenticado = true;
        }

        // Mostramos nuestro mensaje.
        if (esAutenticado)
            System.out.println("Bienvenido ".concat(userName).concat("!"));
        else
            System.out.println("No ha introducido bien los datos.");


    }
}
