import java.util.Arrays;

@Exercise(value = "text budyakiy")
public class AnotationMain {
    public static void main(String[] args) {
        System.out.println("hello");
        var anotation = AnotationMain.class.getDeclaredAnnotations();
        System.out.println(Arrays.toString(anotation));
    }
}
