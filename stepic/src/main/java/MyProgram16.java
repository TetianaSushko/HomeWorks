import java.util.Scanner;

//Пользователь вводит натуральные числа по одному на каждой строке.
// Когда ему надоедает, то он вводит 0. Найти сумму введенных чисел (0 не считается)
public class MyProgram16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = a;
        while (a != 0) {
            a = scanner.nextInt();
            sum = sum + a ;
        }
        System.out.println(sum);
    }
}