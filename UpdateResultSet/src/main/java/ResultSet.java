import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSet {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbcdemo";
        String userName = "root";
        String password = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();
//транзакції, тобто цілісні операції, 1на команда не виконується-інші теж не будуть. якщо всі виконуються, то тру
            //connection.setAutoCommit(false);

            Statement statement1 = connection.createStatement( java.sql.ResultSet.TYPE_SCROLL_SENSITIVE, java.sql.ResultSet.CONCUR_UPDATABLE);
            java.sql.ResultSet resultSet = statement1.executeQuery("select * from students");
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1));
                System.out.println(resultSet.getString(2));
            }
            //у ост записі змінили ім.я на new value;
            resultSet.last();
            resultSet.updateString(2, "new value");
            resultSet.updateRow();

            // додали одну строчку і додали туди ім.я inserted row;
            resultSet.moveToInsertRow();
            resultSet.updateString(2, "inserted row");
            resultSet.updateInt(3, 78);
            resultSet.insertRow();

            //deleting row;
//            resultSet.absolute(20);
//            resultSet.deleteRow();

            // тільки після виклику, всі команди виконаються
            //connection.commit();
            // відкат назад, тільки для insert/ update операцій
            //connection.rollback();

            resultSet.beforeFirst();
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1));
                System.out.println(resultSet.getString(2));
            }
            statement1.close();

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
