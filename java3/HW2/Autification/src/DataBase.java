import java.sql.*;
import java.util.ArrayList;

public class DataBase {
    private static ArrayList<String> al = new ArrayList<>();
    static Connection conn = null;
    static Statement stmt = null;

    public static ArrayList<String> dbInitlogin() {

        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:users.db");
            stmt = conn.createStatement();

            conn.setAutoCommit(false);

            String sqlRead = "SELECT * FROM main";
            ResultSet rs = stmt.executeQuery(sqlRead);

            while (rs.next()) {
            al.add(rs.getString("login"));
            }
            return al;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();

            } catch (SQLException e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public static ArrayList<String> dbInitPassword() {

        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:users.db");
            stmt = conn.createStatement();

            conn.setAutoCommit(false);

            String sqlRead = "SELECT * FROM main";
            ResultSet rs = stmt.executeQuery(sqlRead);

            while (rs.next()) {
            al.add(rs.getString("password"));
            }
            return al;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();

            } catch (SQLException e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }
}
