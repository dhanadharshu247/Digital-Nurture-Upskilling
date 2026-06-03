import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("John");
        students.add("Alice");
        students.add("David");

        System.out.println("Student Names:");

        for (String name : students) {
            System.out.println(name);
        }
    }
}
