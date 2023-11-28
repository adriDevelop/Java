public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Adrián";

        System.out.println("nombre.length() " + nombre.length());
        System.out.println("nombre.toUpperCase() " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Adrián\") " + nombre.equals("Adrián"));
        System.out.println("nombre.equals(\"adrián\") " + nombre.equals("adrián"));
        System.out.println("nombre.equalsIgnoreCase(\"nombre\") " + nombre.equalsIgnoreCase("adrián"));
        System.out.println("nombrecompareTo(\"Adrián\") " + nombre.compareTo("Adrián"));
        System.out.println("nombre.compareTo(\"Andrea\") = " + nombre.compareTo("Andrea"));
        System.out.println("nombre.charAt() = " + nombre.charAt(0));
        System.out.println("nombre.charAt() = " + nombre.charAt(1));
        System.out.println("nombre.charAt() = " + nombre.charAt(5));

        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1));
        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4));
        
        String trabalenguas = "Trabalenguas";
        System.out.println("trabalenguas.replace('a', '.') = " + trabalenguas.replace('a', '.'));
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.indexOf('T') = " + trabalenguas.lastIndexOf('T'));
        System.out.println("trabalenguas.contains(\"T\") = " + trabalenguas.contains("T"));
        System.out.println("trabalenguas.startsWith(\"Traba\") = " + trabalenguas.startsWith("Traba"));
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));
        System.out.println("  trabalenguas ");
        System.out.println("  trabalenguas ".trim());


    }
}
