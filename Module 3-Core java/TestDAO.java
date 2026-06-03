public class TestDAO {
    public static void main(String[] args) throws Exception {

        StudentDAO dao = new StudentDAO();

        dao.insertStudent("Anu",22,"Spring");

        dao.updateStudent(1,"Advanced Java");
    }
}
