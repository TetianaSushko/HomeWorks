import java.util.Scanner;

//Пользователь вводит слова до тех пор, пока не введёт "СТОП".
// Необходимо выяснить, было ли среди введённых слов слово "Куб". Если да, то выведите "YES", если нет, то  "NO".
public class MyProgram22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean is_cube = false;
        for (String s = sc.next(); true ; s = sc.next()) {
            if (s.equalsIgnoreCase("СТОП"))
                break;
            if (s.equalsIgnoreCase("Куб"))
                is_cube = true;
        }
        if (is_cube)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}
