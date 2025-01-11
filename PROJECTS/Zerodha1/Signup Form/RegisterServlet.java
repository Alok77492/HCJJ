import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_management", "root", "password");
            PreparedStatement pst = con.prepareStatement("INSERT INTO users (username, password) VALUES (?, ?)");
            pst.setString(1, username);
            pst.setString(2, password);
            int row = pst.executeUpdate();
            
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            if (row > 0) {
                out.println("<h3>Registration successful! <a href='login.html'>Login</a></h3>");
            } else {
                out.println("<h3>Registration failed!</h3>");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
