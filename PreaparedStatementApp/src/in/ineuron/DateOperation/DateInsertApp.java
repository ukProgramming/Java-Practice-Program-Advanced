package in.ineuron.DateOperation;

import in.ineuron.jdbcUtil.JDBCConnection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DateInsertApp {
    public static void main(String[] args) throws ParseException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Name:");
        String name = scanner.nextLine();
        System.out.println("Enter the DOB:(DD:MM:YYYY):");
        String dob = scanner.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd:mm:yyyy");
        java.util.Date uDate = sdf.parse(dob);

        long time = uDate.getTime();
        java.sql.Date date = new Date(time);

        System.out.println("Enter Date String is:" + dob);
        System.out.println("Util Date is:" + uDate);
        System.out.println("SQL Date:" + date);

        String sqlQuery = "insert into userdata(`name`,dob) values(?,?)";
        try {
            connection = JDBCConnection.getJdbcConnection();
            if (connection != null)
                preparedStatement = connection.prepareStatement(sqlQuery);

            if (preparedStatement != null) {
                preparedStatement.setString(1, name);
                preparedStatement.setDate(2, date);
                int rowAffected = preparedStatement.executeUpdate();
                System.out.println("No of Row Updated:" + rowAffected);
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                JDBCConnection.closeConnection(null, preparedStatement, connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }
}
