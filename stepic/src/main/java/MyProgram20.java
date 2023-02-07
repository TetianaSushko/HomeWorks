import java.util.Scanner;

//Пользователь вводит с клавиатуры натуральное число n. Затем вводит n целых чисел.
// Необходимо найти и вывести на экран количество чётных.
public class MyProgram20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++){
            int x = in.nextInt();
            if (x%2 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}