import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int flag = 0;

        System.out.println("Introduce un número:");
        int num1 = sc.nextInt();

        System.out.println("Introduce un segundo número:");
        int num2 = sc.nextInt();

        System.out.println("Introduce un tercer número:");
        int num3 = sc.nextInt();

        System.out.println("Introduce un cuarto número:");
        int num4 = sc.nextInt();

        flag = (num1 > num2)? num1 : num2;
        flag = (flag > num3)? flag: num3;
        flag = (flag > num4)? flag: num4;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("Número mayor = " + flag);

    }
}
