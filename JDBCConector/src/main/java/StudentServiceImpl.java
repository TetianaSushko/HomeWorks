import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class StudentServiceImpl implements StudentService {
    String url = "jdbc:mysql://localhost:3306/student";
    String userName = "root";
    String password = "root";

    Connection connection;

    {
        try {
            connection = DriverManager.getConnection(url, userName, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    Statement statement;

    {
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteStudent(int id) {
        int resultDel = 0;
        try {
            resultDel = statement.executeUpdate("delete from student.students where Student_id = " + id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void insertInto(String name, Integer group, Integer entryYear) {
        int resultInto = 0;
        if (name != null & group != null & entryYear != null) {
            try {
                resultInto = statement.executeUpdate("insert into student.students (Student_name, Student_group, Student_entry_year) values ('" + name + "'," + group + "," + entryYear + ")");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public List<Student> getAll() {
        List<Student> students = new ArrayList<>();
        try {
            ResultSet resultSet = statement.executeQuery("select * from student.students");
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                Integer group = resultSet.getInt(3);
                Integer entryYear = resultSet.getInt(4);

                Student student = new Student();

                student.setId(id);
                student.setName(name);
                student.setGroup(group);
                student.setEntryYear(entryYear);
                students.add(student);
            }
            System.out.println(students);
        } catch (Exception e) {
            System.out.println(e);
        }
        return students;
    }

    @Override
    public List<Student> getByName(String name) {
        List<Student> students = new ArrayList<>();
        try {
            ResultSet resultSet = statement.executeQuery("select * from student.students where Student_name = '" + name + "'");
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String fio = resultSet.getString(2);
                Integer group = resultSet.getInt(3);
                Integer entryYear = resultSet.getInt(4);

                Student student = new Student();

                student.setId(id);
                student.setName(fio);
                student.setGroup(group);
                student.setEntryYear(entryYear);
                students.add(student);
            }
            System.out.println(students);
        } catch (Exception e) {
            System.out.println(e);
        }
        return students;
    }

    @Override
    public List<Student> getByIds(List<Integer> ids) {
        List<Student> students = new ArrayList<>();
        try {
            String result = " ";
            for (int i = 0; i < ids.size(); i++) {
                if (i != ids.size() - 1) {
                    result = result + ids.get(i) + ", ";
                } else {
                    result = result + ids.get(i) + " ";
                }
            }
            ResultSet resultSet = statement.executeQuery("select * from student.students where Student_id in (" + result + ")");

            while (resultSet.next()) {
                int studentId = resultSet.getInt(1);
                String name = resultSet.getString(2);
                Integer group = resultSet.getInt(3);
                Integer entryYear = resultSet.getInt(4);

                Student student = new Student();

                student.setId(studentId);
                student.setName(name);
                student.setGroup(group);
                student.setEntryYear(entryYear);

                students.add(student);
            }
            System.out.println(students);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return students;
    }
}
