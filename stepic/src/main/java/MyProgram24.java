import java.util.Scanner;

//Пользователь вводит целые числа до тех пор, пока не введёт слово "СТОП" (гарантируется, что других слов не будет).
// Найдите произведение ненулевых чисел. Если же такое произведение найти не удалось, то выведите на экран "Не найдено".
//Для того, чтобы превратить String в другой тип данных используйте конструкцию подобную этой:
//String s = "45";
//int n = Integer.parseInt(s); //в переменной n окажется число 45
public class MyProgram24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "СТОП";
        int x = 1;
        while (true) {
            if (s.equalsIgnoreCase("стоп")) {
                break;
            }
            int n = Integer.parseInt(s);
            if (n != 0) {
                x *= n;
            }
        }
        if (x != 1) {
            System.out.println(x);
        } else {
            System.out.println("Не найдено");
        }
    }
}
