
//Вводятся два целых числа a и b (a <= b). Выведите на экран все числа от a до b включительно.
import java.util.Scanner;
public class MyProgram12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        while (a <= b){
            System.out.println(a);
           a++;
        }
    }
}
