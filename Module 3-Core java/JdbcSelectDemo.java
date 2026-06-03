import java.sql.*;

public class JdbcSelectDemo {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/school";
            String user = "root";
            String password = "password";

            Connection con = DriverManager.getConnection(url, user, password);

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            while(rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getInt("age") + " " +
                    rs.getString("course")
                );
            }

            con.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}