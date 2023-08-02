package in.ineuron.DateOperation;

import in.ineuron.jdbcUtil.JDBCConnection;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DateRetrievalApp {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Name:");
        String name = scanner.nextLine();

        String sqlQuery = "select name,dob from userdata where name=?";
        try {
            connection = JDBCConnection.getJdbcConnection();
            if (connection != null)
                preparedStatement = connection.prepareStatement(sqlQuery);
            if (preparedStatement != null) {
                preparedStatement.setString(1, name);
                resultSet = preparedStatement.executeQuery();

            }
            if (resultSet != null) {
                if (resultSet.next()) {
                    String userName = resultSet.getString(1);
                    Date userDOB = resultSet.getDate(2);
                    // formating the Date according to the locale date format for the local user.
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("DD:MM:YYYY");
                    String date = simpleDateFormat.format(userDOB);
                    System.out.println("Name:" + userName);
                    System.out.println("DOB:" + date);
                } else {
                    System.out.println(" There no such type of Record Exist in the Table:");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                JDBCConnection.closeConnection(resultSet, preparedStatement, connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
