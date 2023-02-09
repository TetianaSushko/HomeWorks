import java.util.Scanner;

//Вводится 2 целых числа a и b (a <= b). Необходимо вычислить произведение всех чисел от а до b включительно
public class Dobutok2chusel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long result = 1;
        for (long i = a; i <= b; i++) {
            result = result * i;
        }
        System.out.println(result);
    }
}
