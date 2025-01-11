public import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionManagementServlet")
public class SessionManagementServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);  // false means don't create if it doesn't exist
        if (session == null || session.getAttribute("loggedin") == null || !(boolean) session.getAttribute("loggedin")) {
            response.sendRedirect("index.jsp");
            return;
        }
        
        // Database connection
        String jdbcURL = "jdbc:mysql://localhost:3306/book";
        String dbUser = "root";
        String dbPassword = "";
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // rest of your logic here
        
        // Example of closing the connection
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
 {
    
}
