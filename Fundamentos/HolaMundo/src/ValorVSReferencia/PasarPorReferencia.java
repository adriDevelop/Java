package ValorVSReferencia;

public class PasarPorReferencia {
    public static void main(String[] args) {

        int[] i = {10, 11, 12};

        System.out.println("i iniciamos el main");

        // Mostramos los valores que tiene.
        for(int a: i){
            System.out.println("a = " + a);
        }

        // LLamamos al metodo que va a cambiar los valores.
        test(i);
        // Mostramos los valores que tiene.
        for(int a: i){
            System.out.println("a = " + a);
        }
    }

    public static void test(int[] i){
        System.out.println("iniciamos el metodo test.");

        for(int a = 0; a < i.length; a++){
            i[a] += 50;
        }

        System.out.println("finaliza con el metodo test");
    }
}
