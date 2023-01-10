//Вводятся целые числа a и b. Гарантируется, что a не превосходит b.
//Выведите все четные числа от a до b (включительно).

import java.util.Scanner;

class MyProgram4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        while (a <= b) {
           if (a%2 == 0){
               System.out.println(a);
            }
            a++;
        }
    }
}