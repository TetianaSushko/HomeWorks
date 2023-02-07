import java.util.Scanner;

//Задача на поиск минимума и максимума. Пользователь вводит натуральное число n, затем n целых чисел.
// Необходимо определить и вывести на экран минимальное и максимальное из них.
public class MyProgram23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int max = a, min = a;
        for (int i = 2; i <= n; i++) {
            a = sc.nextInt();
            if (a > max)
                max = a;
            if (a < min)
                min = a;
        }
        System.out.print(min + "\n" + max);
    }
}
