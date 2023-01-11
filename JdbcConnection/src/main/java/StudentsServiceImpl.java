import java.sql.*;

public class StudentsServiceImpl implements StudentService {
    String url = "jdbc:mysql://localhost:3306/jdbcdemo";
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
    }

    @Override
    public void deleteStudent(int id) {
        int resultDel = 0;
        try {
            resultDel = statement.executeUpdate("delete from students where idstudents = " + id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println(resultDel);
    }

    @Override
    public void insertInto(String name, Integer age) {
        int resultInto = 0;
        if (name != null & age !=null) {
            try {
                resultInto = statement.executeUpdate("insert into students (students_name, age) values ('" + name + "'," + age + ")");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            System.out.println(resultInto);
        }
    }

    @Override
    public void update(String name, Integer age, int id) {
        int resultUp = 0;
        if (name != null & age != null) {
            try {
                resultUp = statement.executeUpdate("update students set students_name = '" + name + "', age = " + age + " where idstudents = " + id);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            System.out.println(resultUp);
        }
        if (age == null){
            try {
                resultUp = statement.executeUpdate("update students set students_name = '" + name + "' where idstudents = " + id);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            System.out.println(resultUp);
        }if (name == null) {
            try {
                resultUp = statement.executeUpdate("update students set age = " + age + " where idstudents = " + id);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            System.out.println(resultUp);
        }
    }


    @Override
    public void getStudentById(int id) {
            try {
                ResultSet resultInto = statement.executeQuery("select students_name from students where idstudents = " + id);
                while (resultInto.next()){
                    String result = resultInto.getString(1);
                    System.out.println(result);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
    }

    @Override
    public void getStudents() {
        try {
            ResultSet resultSet = statement.executeQuery("select * from students");
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                Integer age = resultSet.getInt(3);
                System.out.println(id + " " + name + " " +age);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
