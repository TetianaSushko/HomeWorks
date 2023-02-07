import java.util.Scanner;

//Вводится 2 целых числа a и b (a <= b). Необходимо вычислить сумму всех чисел от а до b включительно.
public class MyProgram21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++){
           sum = sum +i;
            }
        System.out.println(sum);
        }
    }
