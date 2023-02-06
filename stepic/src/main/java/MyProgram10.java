//Последовательность состоит из различных натуральных чисел и завершается числом 0.
// Определите значение второго по величине элемента в этой последовательности.
//Числа, следующие за числом 0, считывать не нужно.
//Входные данные
// Вводится последовательность целых чисел, оканчивающаяся числом 0 (само число 0 в последовательность не входит).
// Гарантируется, что будет введено хотя бы 2 числа.
import java.util.Scanner;

class MyProgram10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int max = input;
        int res = 0;
        while (input != 0) {
            input = sc.nextInt();
            if (input > max) {
                res = max;
                max = input;
            }
            if (input > res & input < max) {
                res = input;
            }
        }
        System.out.println(res);
    }
}