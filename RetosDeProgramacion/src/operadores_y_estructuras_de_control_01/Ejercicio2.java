package operadores_y_estructuras_de_control_01;

public class Ejercicio2 {
    public static void main(String[] args) {

        for(int i = 10; i <= 50; i++){
            if(i%2 == 0 && i != 16 && i%3 != 0)
                System.out.println("i = " + i);
        }
    }
}
