import java.util.List;

public interface StudentService {
    void deleteStudent(int id);
    void insertInto(String name, Integer group, Integer entryYear);
     List <Student> getAll();
     List<Student> getByName(String name);
     List<Student> getByIds(List<Integer> ids);
}
