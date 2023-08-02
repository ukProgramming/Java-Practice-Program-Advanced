package in.ineuron.dynamicinput;


import in.ineuron.jdbcUtil.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertApp {
    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;
        Scanner s1 = new Scanner(System.in);


        System.out.println("Enter the Employee ID:");
        int eid = s1.nextInt();
//        System.out.println("Enter the Employee Name:");
//        String ename = s1.next();
//        System.out.println("Enter the Employee Salary.");
//        String esal = s1.next();

        // String sqlQuery="insert into emptab(`eid`,`ename`,`esal`) values(?,?,?)";

        String sqlQuery = "select eid,ename,esal from emptab where eid=?";

        try {
            connection = JDBCConnection.getJdbcConnection();
            if (connection != null)
                System.out.println(connection);
            pstmt = connection.prepareStatement(sqlQuery);

            if (pstmt != null)
//                    pstmt.setInt(1,eid);
//                pstmt.setString(2,ename);
//                pstmt.setString(3,esal);
                //                  int rowCount= pstmt.executeUpdate();
//            System.out.println("No of Rows Updated:"+rowCount);
                pstmt.setInt(1, eid);
            resultSet = pstmt.executeQuery();
            if (resultSet != null) {
                if (resultSet.next()) {
                    System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getDouble(3));
                } else {
                    System.out.println("Record is Not Available for the Given Employee ID:" + eid);
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCConnection.closeConnection(null, pstmt, connection);
            s1.close();
        }
    }
}
