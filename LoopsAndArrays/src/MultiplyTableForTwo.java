import java.util.Scanner;

public class MultiplyTableForTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        Integer number = scanner.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println("The result of multiply" +" " + i + " * " + number +" " + "is:"  + "" + ( i * number));
        }
    }
}
