import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {

        Semaphore sem = new Semaphore(1);
        new Thread(new IncThread("A",sem)).start();
        new Thread(new DecThread("B",sem)).start();
    }
}
