import java.util.Scanner;

public class FactorialWithDoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorial = scanner.nextInt();
        int i = 1;
        int fact = 1;
        do {
            fact = fact * i;
            i++;
        }
        while (i <= factorial) ; {
            System.out.println (fact);
        }
    }
}
