package in.ineuron.jdbcUtil;

import java.sql.*;

public class JDBCConnection {

    private JDBCConnection() {

    }

    public static Connection getJdbcConnection() throws SQLException {
        // resources used in jdbc application
        Connection connection = null;

        // 2. Establish the Connection
        String url = "jdbc:mysql://localhost:3306/enterprisejavabatch";
        String user = "root";
        String password = "12345";

        connection = DriverManager.getConnection(url, user, password);

        if (connection != null)
            return connection;

        return connection;
    }

    public static void closeConnection(ResultSet resultSet, Statement statement, Connection connection)
            throws SQLException {

        // 6. closing the resources used
        if (resultSet != null) {
            resultSet.close();
        }
        if (statement != null) {
            statement.close();

        }
        if (connection != null) {
            connection.close();
        }

    }

}
