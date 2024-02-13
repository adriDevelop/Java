public class EjemploMatricesStringFor {
    public static void main(String[] args) {

        // Cremaos nuestra matriz de Strings.
        String[][] nombres = new String[3][2];

        // Inicializamos los valores de nuestra matriz.
        nombres[0][0] = "Pepe";
        nombres[0][1] = "Pepa";
        nombres[1][0] = "Josefa";
        nombres[1][1] = "Lucas";
        nombres[2][0] = "Paco";
        nombres[2][1] = "Pancha";

        // Vamos a iterar con un for para poder mostrar nuestros datos. Como en el anterior ejercicio usamos un for
        // ahora, vamos a usar un foreach.
        for(String[] fila: nombres){
            for (String columna: fila){
                System.out.print(columna + "\t");
            }
            System.out.println();
        }
    }
}
