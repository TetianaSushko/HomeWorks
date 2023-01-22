import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        StudentService studentService = new StudentServiceImpl();
        List<Integer> ids = new ArrayList<>();
        ids.add(5);
        ids.add(10);
        ids.add(11);

        studentService.deleteStudent(26);
        studentService.insertInto("student7", 2, 2022);
        studentService.getAll();
        studentService.getByName("student5");
        studentService.getByIds(ids);
    }
}
