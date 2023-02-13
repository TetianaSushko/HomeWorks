import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentServiceImpl();

        studentService.addStudent(new Student("alla", 2020, 2));
        studentService.getByName("alla");
        studentService.getAll();
        List<Integer> ids = new ArrayList<>();
        ids.add(5);
        ids.add(7);
        studentService.getByIds(ids);
    }
}
