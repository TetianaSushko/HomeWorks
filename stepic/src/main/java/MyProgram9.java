//Последовательность состоит из натуральных чисел и завершается числом 0.
// Определите, сколько элементов этой последовательности больше предыдущего элемента.
// Гарантируется ввод хотя бы двух ненулевых чисел.
//Числа, следующие за числом 0, считывать не нужно.
import java.util.Scanner;

class MyProgram9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n != 0) {
            int chuslo = n;
            n = sc.nextInt();
            if (chuslo < n) {
                count++;
            }
        }
        System.out.println(count);
    }
}

