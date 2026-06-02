import java.util.List;

record Person(String name, int age) {}

public class PersonRecord {
    public static void main(String[] args) {

        List<Person> persons = List.of(
                new Person("John", 25),
                new Person("Alice", 18),
                new Person("David", 30)
        );

        persons.stream()
                .filter(p -> p.age() >= 20)
                .forEach(System.out::println);
    }
}