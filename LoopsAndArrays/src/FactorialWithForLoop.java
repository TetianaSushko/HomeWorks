import java.util.Scanner;

public class FactorialWithForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorial = scanner.nextInt();
        int fact = 1;
        for (int i = 1; i <= factorial; i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
