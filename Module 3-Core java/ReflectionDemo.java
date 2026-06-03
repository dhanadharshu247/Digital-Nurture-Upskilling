import java.lang.reflect.*;

class Sample {

    public void greet() {
        System.out.println("Hello");
    }
}

public class ReflectionDemo {

    public static void main(String[] args)
            throws Exception {

        Class c =
            Class.forName("Sample");

        Method[] methods =
            c.getDeclaredMethods();

        for(Method m : methods) {
            System.out.println(m.getName());
        }

        Object obj =
            c.getDeclaredConstructor()
             .newInstance();

        Method method =
            c.getMethod("greet");

        method.invoke(obj);
    }
}
