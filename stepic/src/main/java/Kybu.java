import java.util.Scanner;

//Создайте массив, в котором будут храниться кубы чисел от 1 до 1000.
// Затем вводятся 2 числа из этого диапазона. Используя данные из массива найдите их кубы.
public class Kybu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int resultA = 0;
        int resultB = 0;
        int[] cub = new int[1000];
            resultA = a*a*a;
            resultB = b*b*b;
        System.out.println(resultA);
        System.out.println(resultB);
     }
}
