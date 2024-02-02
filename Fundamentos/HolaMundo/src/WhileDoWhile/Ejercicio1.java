package WhileDoWhile;

public class Ejercicio1 {
    // Calcular en menor de multiples valores.
    public static void main(String[] args) {

        // Creo un array con los valores.
        int[] arrayNum = {1, 0, 3, 4, 5, 6, 7, 8, 9, 22};

        // Ahora, creo variable para almacenar el numero menor.
        int numMenor = arrayNum[0];

        // Recorro el array de numeros para almacenar el menor en la variable anteriormente creada.
        for(int n: arrayNum){
            if (n < numMenor){
                numMenor = n;
                if (numMenor >= 10){
                    System.out.println("El numero menor es mayor o igual que 10");
                }else if (numMenor < 10){
                    System.out.println("El numero menor es menor de 10");
                }
            }
        }

        // Devuelvo el menor.
        System.out.println("numMenor = " + numMenor);
    }
}
