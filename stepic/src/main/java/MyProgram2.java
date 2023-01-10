//Пользователь с клавиатуры вводит действительные числа до 0.
// Необходимо вычислить их среднее арифметическое. Гарантируется, что он введёт хотя бы одно ненулевое число.

import java.util.Scanner;

class MyProgram2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nums = sc.nextDouble();
        int amountOfNumbers = 0;
        double sum = 0;
        while (nums != 0) {
            amountOfNumbers++;
            sum = sum + nums;
            nums = sc.nextDouble();
        }
        System.out.println("Среднее арифметическое " + sum/amountOfNumbers);
    }
}
