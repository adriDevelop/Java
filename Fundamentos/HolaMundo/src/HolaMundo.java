// Mi clase en Java.
public class HolaMundo {
    public static void main(String[] args) {
        String saludar = "Hola mundo desde Java";
        System.out.println(saludar);
        // Haciendo uso de soutv.
        System.out.println("saludar.toLowerCase() = " + saludar.toLowerCase());
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());
        // Creamos nuevas variable.
        int numero = 10;
        boolean valor = true;
        if (valor){
            System.out.println("numero = " + numero);
        }
        // Asignamos tipo de dato implícitamente dado por el valor.
        var numero3 = 15;

        if ( numero > 10 ){
            saludar = "Adrian";
        }

        System.out.println("saludar = " + saludar);
    }
}