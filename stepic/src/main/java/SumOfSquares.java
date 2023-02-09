import java.util.Scanner;

//Напишите программу, которая находит сумму квадратов натуральных чисел от 1 до n, где n вводится с клавиатуры.
public class SumOfSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        for (int i = 0; i<=n; i++){
            result = n * (1 + n) * (2 * n + 1)/ 6;
        }
        System.out.println(result);
    }
}
