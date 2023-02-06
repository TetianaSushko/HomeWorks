import java.util.Scanner;

//Вводятся два целых числа k (1 <= k <= 10) и n (0 <= n <= 100). Выведите на экран построчно все числа кратные k от 1 до n включительно.
public class MyProgram14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int result = k;
        while (result <= n){
            if (result % k == 0){
                System.out.println(result);
                result = result + k;
            }
        }
    }
}
