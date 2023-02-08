import java.util.Scanner;
//По данному целому числу a и натуральному n вычислите сумму 1+a+a2+...+an, не используя формулу суммы геометрической прогрессии.
// Время работы программы должно быть пропорционально n.
public class GeometricProgress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int result = 1;
       for (int i = 1; i<=n; i++){
           result = result + (int) Math.pow(a, i);
       }
        System.out.println(result);
    }
}
