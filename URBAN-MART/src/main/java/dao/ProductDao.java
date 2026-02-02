package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Cart;
import model.Product;

public class ProductDao {

    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;
    private String query;

    public ProductDao(Connection con) {
        this.con = con;
    }

    // ================= GET ALL PRODUCTS =================
    public List<Product> getAllProducts() {
        List<Product> list = new ArrayList<>();
        try {
            query = "SELECT * FROM products";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();

            while (rs.next()) {
                Product row = new Product();
                row.setId(rs.getInt("id"));
                row.setName(rs.getString("name"));
                row.setCategory(rs.getString("category"));
                row.setPrice(rs.getDouble("price"));
                row.setImage(rs.getString("image"));
                list.add(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    // ================= GET SINGLE PRODUCT =================
    public Product getSingleProduct(int id) {
        Product row = null;
        try {
            query = "SELECT * FROM products WHERE id=?";
            pst = con.prepareStatement(query);
            pst.setInt(1, id);
            rs = pst.executeQuery();

            if (rs.next()) {
                row = new Product();
                row.setId(rs.getInt("id"));
                row.setName(rs.getString("name"));
                row.setCategory(rs.getString("category"));
                row.setPrice(rs.getDouble("price"));
                row.setImage(rs.getString("image"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return row;
    }

    // ================= TOTAL CART PRICE =================
    public double getTotalCartPrice(ArrayList<Cart> cartList) {
        double sum = 0;
        try {
            for (Cart item : cartList) {
                query = "SELECT price FROM products WHERE id=?";
                pst = con.prepareStatement(query);
                pst.setInt(1, item.getId());
                rs = pst.executeQuery();

                if (rs.next()) {
                    sum += rs.getDouble("price") * item.getQuantity();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sum;
    }

    // ================= CART PRODUCTS =================
    public List<Cart> getCartProducts(ArrayList<Cart> cartList) {
        List<Cart> list = new ArrayList<>();
        try {
            for (Cart item : cartList) {
                query = "SELECT * FROM products WHERE id=?";
                pst = con.prepareStatement(query);
                pst.setInt(1, item.getId());
                rs = pst.executeQuery();

                if (rs.next()) {
                    Cart row = new Cart();
                    row.setId(rs.getInt("id"));
                    row.setName(rs.getString("name"));
                    row.setCategory(rs.getString("category"));
                    row.setPrice(rs.getDouble("price") * item.getQuantity());
                    row.setQuantity(item.getQuantity());
                    list.add(row);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
