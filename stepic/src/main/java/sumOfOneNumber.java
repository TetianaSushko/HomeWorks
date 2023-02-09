import java.util.Scanner;

//Напишите программу, которая находит сумму натуральных чисел от 1 до n, где n вводится с клавиатуры.
public class sumOfOneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i<= n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

