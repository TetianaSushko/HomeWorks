import java.util.Scanner;

//Пользователь вводит с клавиатуры натуральное число n.
// Затем вводит n целых чисел. Необходимо найти и вывести на экран их сумму.
import java.util.Scanner;

class MyProgram19{
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++){
            int x = in.nextInt();
            sum+=x;
        }
        System.out.println(sum);
    }
}
