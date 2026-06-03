import java.sql.*;

public class StudentDAO {

    private Connection con;

    public StudentDAO() throws Exception {
        con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/school",
            "root",
            "password"
        );
    }

    public void insertStudent(String name,int age,String course)
            throws Exception {

        String sql =
            "INSERT INTO students(name,age,course) VALUES(?,?,?)";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1,name);
        ps.setInt(2,age);
        ps.setString(3,course);

        ps.executeUpdate();

        System.out.println("Inserted");
    }

    public void updateStudent(int id,String course)
            throws Exception {

        String sql =
            "UPDATE students SET course=? WHERE id=?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1,course);
        ps.setInt(2,id);

        ps.executeUpdate();

        System.out.println("Updated");
    }
}
