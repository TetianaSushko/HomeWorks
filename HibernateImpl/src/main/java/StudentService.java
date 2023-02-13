import java.util.List;

public interface StudentService {
    boolean addStudent(Student student);
    List<Student> getAll();
    List<Student> getByName(String name);
    List<Student> getByIds(List<Integer> ids);
}
