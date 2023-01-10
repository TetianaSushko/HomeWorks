//Последовательность состоит из различных натуральных чисел и завершается числом 0.
// Определите значение второго по величине элемента в этой последовательности.
//Числа, следующие за числом 0, считывать не нужно.
//Входные данные
// Вводится последовательность целых чисел, оканчивающаяся числом 0 (само число 0 в последовательность не входит).
// Гарантируется, что будет введено хотя бы 2 числа.

import java.io.PrintStream;
import java.util.Scanner;

class MyProgram10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int max = 0;
        int prev = 0;
        while (a != 0){
            max = Math.max(max, a);
            a = sc.nextInt();
            if (prev < max){
                System.out.println(a);
            }
        }
    }
}