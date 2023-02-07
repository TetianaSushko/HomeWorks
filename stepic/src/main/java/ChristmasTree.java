
//Вводятся натуральное число n. Выведите на экран пирамидку, состоящую из n слоёв.
import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        String s = "*";
//        int count = 1;
//        while(count <= n){
//            int j = n - count;
//            while(j >= 0){
//                System.out.print("");
//                j--;
//            }
//            System.out.println(s);
//            s = s + "**";
//            count++;
//        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++)
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
                System.out.print("*");
            System.out.println();
        }
    }

}
