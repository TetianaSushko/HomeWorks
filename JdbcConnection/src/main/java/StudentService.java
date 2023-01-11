import java.util.List;

interface StudentService {
    void deleteStudent(int id);
    void insertInto(String name, Integer age);
    void update(String name, Integer age, int id);
    void getStudentById(int id);
    void getStudents();

}
