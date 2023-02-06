import java.util.Scanner;

//Программа запрашивает два числа: n и x.
// Необходимо составить программу, которая будет прибавлять число x само к себе до тех пор, пока сумма не станет больше либо равна n.
// Выведите полученную сумму.
public class MyProgram17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int i = x;
        while (n > i) {
            i = i + x;
        }
        System.out.println(i);
    }
}
