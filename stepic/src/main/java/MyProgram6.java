//По данному натуральному n вычислите сумму 1^2+ 2^2+...+n^2(вычисляет сумму квадратов чисел от 1 до N)

import java.util.Scanner;

class MyProgram6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = n * (n + 1) * (2 * n + 1) / 6;
        System.out.println( result );
    }
}
