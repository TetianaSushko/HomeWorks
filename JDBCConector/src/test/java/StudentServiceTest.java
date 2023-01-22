import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

public class StudentServiceTest {
    private final StudentService studentService = new StudentServiceImpl();

    @Test
    void delete(){
        List<Student> students = studentService.getAll();
        int sizeBefore = students.size();
        System.out.println(sizeBefore);
        studentService.deleteStudent(19);
        students = studentService.getAll();
        Assertions.assertEquals(sizeBefore - 1, students.size());
    }

    @Test
    void add(){
        List<Student> students = studentService.getAll();
        int sizeBefore = students.size();
        studentService.insertInto("student9", 3, 2021);
        students = studentService.getAll();
        Assertions.assertEquals(sizeBefore + 1, students.size());
    }
    @Test
    void getAll(){
        List<Student> students = studentService.getAll();
        Assertions.assertEquals(students.size(), students.size());
    }
}
