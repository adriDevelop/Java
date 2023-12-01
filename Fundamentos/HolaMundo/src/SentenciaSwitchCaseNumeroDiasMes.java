import java.util.Scanner;

public class SentenciaSwitchCaseNumeroDiasMes {
    public static void main(String[] args) {

        // Declaramos clase Scanner para que usuario cliente introduzca los datos.
        Scanner sc = new Scanner(System.in);

        // Variables de las que haremos uso.
        System.out.println("Introduzca el nombre del mes del que quiere saber los dias.");
        String nombreMes = sc.nextLine().toLowerCase();
        System.out.println("Y el numero del año para saber los dias. (YYYY)");
        int anio = sc.nextInt();

        // Calculo de los dias del mes.
        int numDiasMes = 0;

        // Sentencia switch-case.
        switch(nombreMes){
            case "enero":
                numDiasMes = 30;
                System.out.println("El mes es Enero y tiene ".concat(String.valueOf(numDiasMes)));
            case "febrero":
                // Calculo dias año bisiesto.
                if (anio % 400 == 0 || (anio % 4 == 0) && !(anio % 100 == 0)){
                    numDiasMes = 29;
                    System.out.println("El mes es Febrero y tiene ".concat(String.valueOf(numDiasMes)));
                    break;
                } else {
                    numDiasMes = 28;
                    System.out.println("El mes es Febrero y tiene ".concat(String.valueOf(numDiasMes)));
                    break;
                }
            case "marzo":
                numDiasMes = 31;
                System.out.println("El mes es Marzo y tiene ".concat(String.valueOf(numDiasMes)));
                break;
            case "abril":
                numDiasMes = 30;
                System.out.println("El mes es Abril y tiene ".concat(String.valueOf(numDiasMes)));
                break;
            case "mayo":
                numDiasMes = 31;
                System.out.println("El mes es Mayo y tiene ".concat(String.valueOf(numDiasMes)));
                break;
            case "junio":
                numDiasMes = 30;
                System.out.println("El mes es Junio y tiene ".concat(String.valueOf(numDiasMes)));
                break;
            case "julio":
                numDiasMes = 31;
                System.out.println("El mes es Julio y tiene ".concat(String.valueOf(numDiasMes)));
                break;
            case "agosto":
                numDiasMes = 31;
                System.out.println("El mes es Agosto y tiene ".concat(String.valueOf(numDiasMes)));
                break;
            case "septiembte":
                numDiasMes = 30;
                System.out.println("El mes es Septiembre y tiene ".concat(String.valueOf(numDiasMes)));
                break;
            case "octubre":
                numDiasMes = 31;
                System.out.println("El mes es Octubre y tiene ".concat(String.valueOf(numDiasMes)));
                break;
            case "noviembre":
                numDiasMes = 30;
                System.out.println("El mes es Noviembre y tiene ".concat(String.valueOf(numDiasMes)));
                break;
            case "diciembre":
                numDiasMes = 31;
                System.out.println("El mes es Diciembre y tiene ".concat(String.valueOf(numDiasMes)));
                break;
            default:
                System.out.println("Mes no válido.");
        }
    }
}
