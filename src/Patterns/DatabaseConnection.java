import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Singleton class for managing database connections.
 */
public enum DatabaseConnection {
    INSTANCE;

    private Connection connection;

    DatabaseConnection() {
        initializeConnection();
    }

    private void initializeConnection() {
        String dbUrl = "jdbc:mysql://localhost:3306/mydatabase";
        String user = "username";
        String password = "password";
        try {
            connection = DriverManager.getConnection(dbUrl, user, password);
        } catch (SQLException e) {
            System.err.println("Failed to establish database connection: " + e.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void executeQuery(String query) {
        if (connection != null) {
            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(query)) {

                processResultSet(resultSet);
            } catch (SQLException e) {
                System.err.println("Query execution failed: " + e.getMessage());
            }
        } else {
            System.err.println("No database connection available.");
        }
    }

    private void processResultSet(ResultSet resultSet) throws SQLException {
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();

        while (resultSet.next()) {
            String row = IntStream.range(1, columnCount + 1)
                    .mapToObj(i -> {
                        try {
                            return resultSet.getString(i);
                        } catch (SQLException ex) {
                            return "N/A";
                        }
                    })
                    .collect(Collectors.joining(", "));
            System.out.println(row);
        }
    }

    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Database connection closed.");
            } catch (SQLException e) {
                System.err.println("Error closing the database connection: " + e.getMessage());
            } finally {
                connection = null;
            }
        }
    }
}