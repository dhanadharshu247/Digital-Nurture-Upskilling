import java.util.concurrent.*;

public class ExecutorDemo {

    public static void main(String[] args)
            throws Exception {

        ExecutorService service =
            Executors.newFixedThreadPool(3);

        Callable task1 =
            () -> 10;

        Callable task2 =
            () -> 20;

        Future f1 =
            service.submit(task1);

        Future f2 =
            service.submit(task2);

        System.out.println(f1.get());
        System.out.println(f2.get());

        service.shutdown();
    }
}
