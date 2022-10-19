import java.util.Scanner;

public class ArithmeticMeanOfTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first number");
        Double number1 = scanner.nextDouble();

        System.out.println("Input second number");
        Double number2 = scanner.nextDouble();

        System.out.println("The average of this numbers: " + (number1 + number2)/2);
    }
}
