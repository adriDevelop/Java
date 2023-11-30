import java.util.Scanner;

public class ActividadObtenerNombreLargoTresPersonas {
    public static void main(String[] args) {

        // Creamos nuestra clase Scanner para que el cliente pueda itroducir datos.
        Scanner sc = new Scanner(System.in);
        int[] longitudNombres = new int[3];
        String[] nombres = new String[3];
        String nombreLargo = "";
        int bandera = 0;

        // Mediante un bucle for vamos a agregar al array.
        for (int i = 0; i < longitudNombres.length; i++){
            System.out.println("Introduce nombre ".concat(String.valueOf((i)).concat(":")));
            nombres[i] = sc.nextLine();
            bandera = (nombres[i].toCharArray().length > bandera)? nombres[i].toCharArray().length : bandera;
            nombreLargo = (nombres[i].toCharArray().length == bandera)? nombres[i] : nombreLargo;
        }

        // Mostramos el nombre y el número de caracteres que tiene.
        System.out.println("El nombre mas largo es ".concat(nombreLargo).concat(" largo tiene ").concat(String.valueOf(bandera)));

    }
}
