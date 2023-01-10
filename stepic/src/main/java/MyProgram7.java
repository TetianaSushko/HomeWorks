//В первый день спортсмен пробежал x километров, а затем он каждый день увеличивал пробег на 10% от предыдущего значения.
// По данному числу y определите номер дня, на который пробег спортсмена составит не менее y километров.
// =Входные данные
//Программа получает на вход действительные числа x и y
//=Выходные данные
//Программа должна вывести одно натуральное число.

import java.util.Scanner;

class MyProgram7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Double x = sc.nextDouble();
        Double y = sc.nextDouble();
        int day = 1;
        while (x < y) {
            x = x * 1.1;
            day++;
        }
        System.out.println(day);
    }
}
