import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        String variable = 7 == 5 ? "Si es verdadero": "No es verdadero";
        System.out.println("variable = " + variable);

        // Vamos a agregar unas notas para practicar más con el operador ternario.
        String estado = "Aprobado";
        double promedio = 0.0;
        double matematicas = 0.0;
        double geografia = 0.0;
        double lengua = 0.0;

        Scanner sc = new Scanner(System.in);

        // Pedimos los datos al cliente.
        System.out.println("Ingresa nota matemáticas:");
        matematicas = sc.nextDouble();
        System.out.println("Ingresa nota geografía:");
        geografia = sc.nextDouble();
        System.out.println("Ingresa nota lengua:");
        lengua = sc.nextDouble();

        // Calculamos el promedio.
        promedio = (matematicas + geografia + lengua) / 3;

        // Obtenemos el estado.
        estado = promedio >= 5.00? "Aprobado": "Suspenso";
        System.out.println("estado = ".concat(estado).concat(" con un resultado de ").concat(String.valueOf(promedio)));
    }
}
