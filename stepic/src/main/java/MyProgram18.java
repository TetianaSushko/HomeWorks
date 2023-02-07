//Вводятся натуральное число n. Выведите на экран лесенку, состоящую из n ступенек.
// Каждая i-ая ступенька состоит из i звёздочек.
//ЯЛИНКА

import java.util.Scanner;

public class MyProgram18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        String star = "*";
        while (count < n){
            System.out.println(star);
            count++;
           star = star + "*";
        }
    }
}
