package homework_1.resolve_classwork.jdbc;

import javax.xml.transform.Result;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "GodisTrU4752&@");
        PreparedStatement preparedStatement = connection.prepareStatement("select * from actor");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getInt(1) + " " +resultSet.getString("first_name"));}
        connection.close();
    }
}
