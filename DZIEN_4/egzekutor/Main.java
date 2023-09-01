import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        CountDownLatch cd1 = new CountDownLatch(5);
        CountDownLatch cd12 = new CountDownLatch(5);
        CountDownLatch cd13 = new CountDownLatch(5);
        CountDownLatch cd14 = new CountDownLatch(5);
        ExecutorService es = Executors.newFixedThreadPool(2);

        System.out.println("Startujemy...");
        es.execute(new MyThread("A",cd1));
        es.execute(new MyThread("B",cd12));
        es.execute(new MyThread("C",cd13));
        es.execute(new MyThread("D",cd14));

        try{
            cd1.await();
            cd12.await();
            cd13.await();
            cd14.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        es.shutdown();
        System.out.println("Kończymy...");

    }
}
