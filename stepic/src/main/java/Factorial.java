import java.util.Scanner;

//Вводится натуральное число n. Вычислите n! ("эн-факториал") – произведение всех натуральных чисел от 1 до n
public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++){
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
