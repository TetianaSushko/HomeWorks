import java.util.Scanner;

public class QuadraticRoot {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();

        double root1, root2;

        double determinant = b * b - 4 * a * c;
        double sqrt = Math.sqrt(determinant);

        if (determinant > 0) {
            root1 = (-b + sqrt) / (2 * a);
            root2 = (-b - sqrt) / (2 * a);
            System.out.printf("root1 is %.2f and root2 is %.2f", root1, root2);
        } else if (determinant == 0) {
            root1 = -b / (2 * a);
            System.out.format("root1 = root2 is %.2f;", root1);
        } else {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-determinant) / (2 * a);
            System.out.format("root1 is %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 is %.2f-%.2fi", real, imaginary);
        }
    }
}
