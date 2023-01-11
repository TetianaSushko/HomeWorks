
public class JDBCConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        StudentService studentService = new StudentsServiceImpl();
        studentService.deleteStudent(19);
        studentService.update("alla", null, 11);
        studentService.insertInto("panda", 3);
        studentService.getStudents();
          studentService.getStudentById(8);
    }
}
