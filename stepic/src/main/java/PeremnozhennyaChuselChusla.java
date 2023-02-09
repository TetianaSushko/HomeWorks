import java.util.Scanner;

//Дано натуральное число. Найдите произведение его цифр.
//Входные данные
//Задано натуральное число n.
public class PeremnozhennyaChuselChusla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 1;
        while (n != 0){
           result = result *(n%10);
            n= n/10;
        }
            System.out.println(result);
        }
    }
