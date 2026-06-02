import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "John");
        students.put(102, "Alice");
        students.put(103, "David");

        int id = 102;

        System.out.println("Student Name: " + students.get(id));
    }
}