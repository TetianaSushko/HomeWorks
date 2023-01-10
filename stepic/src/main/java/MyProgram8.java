//Дано натуральное число N. Напишите програму, вычисляющую сумму цифр числа N.
import java.util.Scanner;

class MyProgram8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        while(n != 0){
            sum = sum + (n % 10);
            n = n/10;
        }
        System.out.println(sum);
    }
}