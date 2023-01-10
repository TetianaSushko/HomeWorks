//Вводится 2 целых числа a и b (a <= b). Необходимо вычислить количество всех чисел кратных 3,
// но не кратных 5 от а до b включительно.
import java.util.Scanner;

class MyProgram1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;

        while (a <= b) {
           if (a%3 == 0 && a%5 !=0){
               c++;
           }
            a++;
        }
        System.out.println(c);
    }
}
