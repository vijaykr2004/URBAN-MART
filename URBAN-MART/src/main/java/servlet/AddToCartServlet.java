package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Cart;
@SuppressWarnings({ "serial", "unused" })
@WebServlet("/add-to-cart")
public class AddToCartServlet extends HttpServlet {

    @SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        HttpSession session = request.getSession();
        ArrayList<Cart> cartList =
                (ArrayList<Cart>) session.getAttribute("cart-list");

        if (cartList == null) {
            cartList = new ArrayList<>();
        }

        boolean exist = false;
        for (Cart c : cartList) {
            if (c.getId() == id) {
                exist = true;
                break;
            }
        }

        if (!exist) {
            Cart c = new Cart();
            c.setId(id);
            c.setQuantity(1);
            cartList.add(c);
        }

        session.setAttribute("cart-list", cartList);

        response.sendRedirect(request.getContextPath() + "/index.jsp");

    }
}

