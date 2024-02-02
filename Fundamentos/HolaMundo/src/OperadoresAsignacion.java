public class OperadoresAsignacion {
    public static void main(String[] args) {

        int i = 5;
        int j = i + 4;

        // Operador compuesto de asignación +=.
        i += 2;
        System.out.println("Operador asignación += = " + i);

        // Operador compuesto de asignación -=.
        i -= 2;
        System.out.println("Operador asignación -= = " + i);

        // Operador compuesto de asignación *=.
        i *= 2;
        System.out.println("Operador asignación *= = " + i);

        // Operador compuesto de asignación -/=.
        i /= 2;
        System.out.println("Operador asignación /= = " + i);

        // Para los Strings también podemos usarlo.
        String sqlString = "SELECT * FROM clientes as C";
        sqlString += " where c.nombre = 'Adrian'";
        sqlString += " and c.activo = 1";
        System.out.println("sqlString = " + sqlString);




    }
}
