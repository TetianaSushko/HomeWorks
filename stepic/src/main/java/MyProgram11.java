//Вводится число натуральное число n. Выведите на экран построчно все числа от 1 до n.

import java.util.Scanner;
public class MyProgram11 {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
//це буде з кінця на початок 6->1
//            while (n != 1){
//                n= n-1;
//                System.out.println(n);
//            }
            //з початку у кінець 1->6
            int a = 1;
            while (a <= n){
                System.out.println(a);
                a++;
            }
        }
    }
