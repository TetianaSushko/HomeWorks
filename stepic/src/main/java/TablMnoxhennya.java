//Напишите программу, которая по заданному с клавиатуры числу n печатает таблицу умножения от 1 до 9.
//Входные данные
//Задано натуральное число n.

import java.util.Scanner;

public class TablMnoxhennya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i< 10; i++){
            int result = i * n;
            System.out.println(n + " * "+ i +" = " +result);
        }
    }
}
