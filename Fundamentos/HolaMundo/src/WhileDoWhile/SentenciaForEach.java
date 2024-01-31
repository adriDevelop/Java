package WhileDoWhile;

public class SentenciaForEach {
    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 9, 14, 18};
        // Vamos a recorrer un array mediante un for-each.
        for(int num: numeros){
            System.out.println(num);
        }
        
        String[] nombres = {"Adrian", "Andrea", "Mario"};
        for(String nom: nombres){
            System.out.println("nom = " + nom);
        }
    }

}
