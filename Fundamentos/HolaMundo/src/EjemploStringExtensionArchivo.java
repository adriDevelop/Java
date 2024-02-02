public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {

        String archivo = "alguna_imagen.jpg";
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(archivo.lastIndexOf('.')) = " + archivo.substring(archivo.lastIndexOf('.')));

    }
}
