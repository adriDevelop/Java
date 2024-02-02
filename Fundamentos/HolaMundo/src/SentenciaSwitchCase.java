import java.sql.SQLOutput;

public class SentenciaSwitchCase {
    public static void main(String[] args) {

        int num = 3;
        // Switch para tipos numericos.
        switch (num){
            case 0:
                System.out.println("El número es 0");
                break;
            case 1:
                System.out.println("El número es 1");
                break;
            case 2:
                System.out.println("El núymero es 2");
                break;
            case 3:
                System.out.println("El número es 3");
                break;
            case 4:
                System.out.println("El número es 4");
                break;
            default:
                System.out.println("Número o caracter desconocido.");
        }

        String nombre = "adrian";
        // Switch para tipos String.
        switch (nombre){
            case "adrian":
                System.out.println("El nombre es adrian");
                break;
            case "pepe":
                System.out.println("El nonmbre es pepe");
                break;
            case "andrea":
                System.out.println("El nombre es andrea");
                break;
            case "macbook":
                System.out.println("El nombre es macbook");
                break;
            case "andres":
                System.out.println("El nombre es andres");
                break;
            default:
                System.out.println("Número o caracter desconocido.");
        }
    }
}
