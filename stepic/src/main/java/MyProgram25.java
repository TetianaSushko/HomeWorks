import java.util.Scanner;
//Дано натуральное число N. Выведите его представление в двоичном виде в обратном порядке.
public class MyProgram25 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println(new StringBuilder(Integer.toBinaryString(in.nextInt())).reverse());
        }
    }
