public import java.sql.*;

public class Login {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/yourdatabase";
        String dbUser = "yourusername";
        String dbPassword = "yourpassword";

        Connection connection = null;
        PreparedStatement stmt = null;

        String username = "";
        String password = "";
        String username_err = "";
        String password_err = "";

        try {
            // Connect to the database
            connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

            // Validate username
            if (username.isEmpty()) {
                username_err = "Please enter username.";
                System.out.println(username_err);
            } else {
                username = username.trim();
            }

            // Validate password
            if (password.isEmpty()) {
                password_err = "Please enter your password.";
                System.out.println(password_err);
            } else {
                password = password.trim();
            }

            // If no errors, proceed to check username and password
            if (username_err.isEmpty() && password_err.isEmpty()) {
                String sql = "SELECT id, username, password FROM user WHERE username = ?";
                stmt = connection.prepareStatement(sql);
                stmt.setString(1, username);
                ResultSet resultSet = stmt.executeQuery();

                if (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String hashed_password = resultSet.getString("password");

                    // Verify password (In a real application, ensure proper password hashing)
                    if (password.equals(hashed_password)) {
                        // Password is correct, start session
                        // Note: Java session management would be handled differently
                        System.out.println("Login successful!");
                        // Redirect to welcome page (In a real application, handle redirection)
                    } else {
                        password_err = "The password you entered was not valid.";
                        System.out.println(password_err);
                    }
                } else {
                    username_err = "No account found with that username.";
                    System.out.println(username_err);
                }
                resultSet.close();
                stmt.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close connection
            try {
                if (stmt != null) stmt.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
 {
    
}
