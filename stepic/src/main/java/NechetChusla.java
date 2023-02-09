import java.util.Scanner;

//Составьте программу, которая в одну строку через пробел выводит все нечетные цифры.
public class NechetChusla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i += 2){
            System.out.print(i);
        }
    }
}