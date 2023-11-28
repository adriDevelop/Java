public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b= "b";
        String c = a;
        // Nos permite crear un String de una forma más optimizada y este es mutable.
        StringBuilder sb = new StringBuilder(a);

        long tiempoInicial = System.currentTimeMillis();

        // Si queremos añadir más iteracciones lo unico que debemos hacer es cambiarlas (500).
        for (int i = 0; i < 500; i++){
            // c = c.concat(a.concat(b.concat("\n"))); 500 --> 2ms
            // c = c +a +b +"\n"; // 500 --> 8ms
            sb.append(a).append(b).append("\n"); // 500 --> 1ms
        }

        long tiempoFin = System.currentTimeMillis();

        System.out.println(tiempoFin - tiempoInicial);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}
