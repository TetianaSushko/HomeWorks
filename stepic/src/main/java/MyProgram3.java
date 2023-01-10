//Последовательность состоит из различных натуральных чисел и завершается числом 0.
// Определите значение максимального элемента в этой последовательности.
//Числа, следующие за числом 0, считывать не нужно.
//Вводится последовательность целых чисел, оканчивающаяся числом 0 (само число 0 в последовательность не входит).
// Гарантируется, что будет введено хотя бы 2 числа.
//2 3 4 5 8 7 4 0

import java.util.Scanner;

class MyProgram3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int max = 0;
        while (a != 0){
           max = Math.max(max, a);
            a = sc.nextInt();
        }
        System.out.println(max);
    }
}