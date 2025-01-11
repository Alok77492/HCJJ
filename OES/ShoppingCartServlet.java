import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShoppingCartServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        ArrayList<Map<String, Object>> shoppingCart = (ArrayList<Map<String, Object>>) session.getAttribute("shopping_cart");

        if (shoppingCart == null) {
            shoppingCart = new ArrayList<>();
            session.setAttribute("shopping_cart", shoppingCart);
        }

        String action = request.getParameter("action");
        if (action != null && action.equals("delete")) {
            int itemId = Integer.parseInt(request.getParameter("id"));
            for (int i = 0; i < shoppingCart.size(); i++) {
                if ((int) shoppingCart.get(i).get("item_id") == itemId) {
                    shoppingCart.remove(i);
                    response.getWriter().println("<script>alert('Item Removed');</script>");
                    response.getWriter().println("<script>window.location='index.jsp';</script>");
                    break;
                }
            }
        } else if (request.getParameter("add_to_cart") != null) {
            int itemId = Integer.parseInt(request.getParameter("id"));
            boolean itemExists = false;
            for (Map<String, Object> item : shoppingCart) {
                if ((int) item.get("item_id") == itemId) {
                    itemExists = true;
                    response.getWriter().println("<script>alert('Item Added');</script>");
                    break;
                }
            }

            if (!itemExists) {
                Map<String, Object> item = new HashMap<>();
                item.put("item_id", itemId);
                item.put("item_name", request.getParameter("hidden_name"));
                item.put("item_price", Double.parseDouble(request.getParameter("hidden_price")));
                item.put("item_quantity", Integer.parseInt(request.getParameter("quantity")));
                shoppingCart.add(item);
            }
        }
    }
}

