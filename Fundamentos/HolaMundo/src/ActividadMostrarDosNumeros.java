import javax.management.StringValueExp;
import java.util.Scanner;

public class ActividadMostrarDosNumeros {
    public static void main(String[] args) {

        // Pedimos los datos al cliente.
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número");
        int num1 = sc.nextInt();

        System.out.println("Introduce el segundo número");
        int num2 = sc.nextInt();

        int mayor = (num1 > num2)? num1: num2;
        int menor = (num1 < num2)? num1: num2;

        System.out.println("Ordenados de mayor a menor: " + mayor + ", " + menor);

    }
}
