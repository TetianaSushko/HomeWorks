import java.util.Scanner;

//Пользователь вводит натуральные числа по одному на каждой строке.
// Когда ему надоедает, то он вводит 0. Найти количество введенных чисел (0 не считается)
public class MyProgram15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = 0;

        while (a != 0) {
            a = scanner.nextInt();
            sum++;
        }
        System.out.println(sum);
    }
}