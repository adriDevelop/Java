public class SentenciaIfElse {
    public static void main(String[] args) {

        float promedio = 4f;
        if (promedio >=9 && promedio <=10){
            System.out.println("Aprobado... perfecto promedio!");
        }else if (promedio >= 7 && promedio < 9){
            System.out.println("Aprobado... Muy buen promedio!");
        }else if (promedio >= 5 && promedio < 7){
            System.out.println("Aprobado... buen promedio, pero debes esforzarte un poco más!");
        }else {
            System.out.println("Suspenso... Tienes que esforzarte más.");
        }
    }
}
