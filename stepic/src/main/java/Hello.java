import java.util.Scanner;

//Напишите программу, которая выводит на экран слово "Привет" (без кавычек) 10 раз.
public class Hello {
    public static void main(String[] args) {
        String n = "Привет";
        int result = 1;
        while (result <= 10){
            System.out.println(n);
            result++;
        }
    }
}
