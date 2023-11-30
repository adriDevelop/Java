import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        // Cremos los 3 String y declaramos el uso de Scanner.
        Scanner sc = new Scanner(System.in);
        String nombreFamiliar, nombreFamiliar2, nombreFamiliar3;
        char[] nombreCaracteres;

        // Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero
        // convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona.
        System.out.println("Introduce nombre familiar 1:");
        nombreFamiliar = sc.nextLine();
        System.out.println("Introduce nombre familiar 2:");
        nombreFamiliar2 = sc.nextLine();
        System.out.println("Introduce nombre familiar 3:");
        nombreFamiliar3 = sc.nextLine();

        // Concatenamos como dice el ejercicio.
        nombreCaracteres = nombreFamiliar.toCharArray();

        for (int i = 0; i < nombreCaracteres.length; i++){
            String letra2 = String.valueOf((char) nombreCaracteres[1]).toUpperCase();
            String letraPenultima = nombreFamiliar.substring(nombreFamiliar.length()-2);
            nombreFamiliar = letra2 + "." + letraPenultima;
        }
        nombreCaracteres = nombreFamiliar2.toCharArray();
        for (int i = 0; i < nombreCaracteres.length; i++){
            String letra2 = String.valueOf((char) nombreCaracteres[1]).toUpperCase();
            String letraPenultima = nombreFamiliar2.substring(nombreFamiliar2.length()-2);
            nombreFamiliar2 = letra2 + "." + letraPenultima;
        }
        nombreCaracteres = nombreFamiliar3.toCharArray();
        for (int i = 0; i < nombreCaracteres.length; i++){
            String letra2 = String.valueOf((char) nombreCaracteres[1]).toUpperCase();
            String letraPenultima = nombreFamiliar3.substring(nombreFamiliar3.length()-2);
            nombreFamiliar3 = letra2 + "." + letraPenultima;
        }

        // Mostramos en una única línea.
        System.out.println(nombreFamiliar.concat("_").concat(nombreFamiliar2).concat("_").concat(nombreFamiliar3));

    }
}
