//Дано целое число, не меньшее 2. Выведите его наименьший натуральный делитель, отличный от 1.

import java.util.Scanner;

class MyProgram5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = 2;
        while (a >= 2) {
            if (a % x == 0) {
                System.out.println(x);
                break;
            } else {
                x++;
            }
        }
    }
}
