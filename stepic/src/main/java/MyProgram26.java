import java.util.Scanner;

//Последовательность состоит из натуральных чисел и завершается числом 0.
// Всего вводится не более 10000 чисел (не считая завершающего числа 0).
// Определите, сколько элементов этой последовательности равны ее наибольшему элементу.
//Числа, следующие за числом 0, считывать не нужно.
public class MyProgram26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int count = 0;
        int n;
        while ((n = scanner.nextInt()) != 0){
            if (n > max) {
                max = n;
                count = 1;
            } else if (n == max) {
                count++;
            }
        }
        System.out.println(count);
    }
}