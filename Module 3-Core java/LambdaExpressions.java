import java.util.*;

public class LambdaExpressions {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("John");
        names.add("Alice");
        names.add("David");

        Collections.sort(names, (a, b) -> a.compareTo(b));

        System.out.println("Sorted List:");
        names.forEach(System.out::println);
    }
}
