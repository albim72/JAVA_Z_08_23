import java.util.concurrent.Semaphore;

public class IncThread implements Runnable{
    String name;
    Semaphore sem;

    public IncThread(String name, Semaphore sem) {
        this.name = name;
        this.sem = sem;
    }

    @Override
    public void run() {
        System.out.println("Uruchamiam: " + name);
        try{
            System.out.println(name + " czeka na pozwolenie.");
            sem.acquire();
            System.out.println(name + " uzyskał pozwolenie.");
            //dostęp do zasobów udostępnionych
            for(int i=0;i<5;i++){
                Shared.count++;
                System.out.println(name + ": " + Shared.count);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name + " zwalnia pozwolenie na dostęp.");
        sem.release();
    }
}
