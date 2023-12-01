import java.util.Scanner;

public class SentenciaSwitchCaseNombreDelMes {
    public static void main(String[] args) {

        // Pasamos el número del mes y le damos el nombre del mes.
        Scanner sc = new Scanner(System.in);
        System.out.println("Pasame el número del mes. (MM)");
        int numMes = sc.nextInt();

        // Mostramos el nombre del mes dependiendo del número del mes.
        switch(numMes){
                case 1:
                System.out.println("Nombre mes: Enero");
                break;
                case 2:
                System.out.println("Nombre mes: Febrero");
                break;
                case 3:
                System.out.println("Nombre mes: Marzo");
                break;
                case 4:
                System.out.println("Nombre mes: Abril");
                break;
                case 5:
                System.out.println("Nombre mes: Mayo");
                break;
                case 6:
                System.out.println("Nombre mes: Junio");
                break;
                case 7:
                System.out.println("Nombre mes: Julio");
                break;
                case 8:
                System.out.println("Nombre mes: Agosto");
                break;
                case 9:
                System.out.println("Nombre mes: Septiembte");
                break;
                case 10:
                System.out.println("Nombre mes: Octubre");
                break;
                case 11:
                System.out.println("Nombre mes: Noviembre");
                break;
                case 12:
                System.out.println("Nombre mes: Diciembre");
                break;
        }
    }
}
