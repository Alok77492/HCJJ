import java.sql.*;

public class Register {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/yourdatabase";
        String dbUser = "yourusername";
        String dbPassword = "yourpassword";

        Connection connection = null;
        PreparedStatement stmt = null;

        String username = "";
        String password = "";
        String confirmPassword = "";
        String number = "";

        try {
            // Connect to the database
            connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

            // Username validation
            if (username.isEmpty()) {
                System.out.println("Please enter a username.");
            } else {
                String sql = "SELECT id FROM user WHERE username = ?";
                stmt = connection.prepareStatement(sql);
                stmt.setString(1, username);
                ResultSet resultSet = stmt.executeQuery();

                if (resultSet.next()) {
                    System.out.println("This username is already taken.");
                } else {
                    username = username.trim();
                }
                resultSet.close();
                stmt.close();
            }

            // Password validation
            if (password.isEmpty()) {
                System.out.println("Please enter a password.");
            } else if (password.length() < 6) {
                System.out.println("Password must have at least 6 characters.");
            } else {
                password = password.trim();
            }

            // Confirm password validation
            if (confirmPassword.isEmpty()) {
                System.out.println("Please confirm password.");
            } else {
                confirmPassword = confirmPassword.trim();
                if (!password.equals(confirmPassword)) {
                    System.out.println("Password did not match.");
                }
            }

            // Number validation
            if (number.isEmpty()) {
                System.out.println("Please enter a number.");
            } else if (number.length() < 10) {
                System.out.println("Number must have 10 characters.");
            } else {
                number = number.trim();
            }

            // Insert user into the database
            if (!username.isEmpty() && !password.isEmpty() && password.equals(confirmPassword) && !number.isEmpty()) {
                String sql = "INSERT INTO user (username, password, number) VALUES (?, ?, ?)";
                stmt = connection.prepareStatement(sql);
                stmt.setString(1, username);
                stmt.setString(2, password); // Hash the password in real application
                stmt.setString(3, number);

                int rows = stmt.executeUpdate();

                if (rows > 0) {
                    System.out.println("User registered successfully.");
                } else {
                    System.out.println("Something went wrong. Please try again later.");
                }
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
