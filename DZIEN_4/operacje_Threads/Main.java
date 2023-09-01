
public class Main {
    public static void main(String[] args) {

        NewThread ob1 = new NewThread("Pierwszy");
        NewThread ob2 = new NewThread("Drugi");

        ob1.t.start();
        ob2.t.start();

        try{
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Zawieszenie wątku Pierwszy");
            Thread.sleep(1000);
            ob1.mysresume();
            System.out.println("Wznowienie wątku Pierwszy");

            ob2.mysuspend();
            System.out.println("Zawieszenie wątku Drugi");
            Thread.sleep(1000);
            ob2.mysresume();
            System.out.println("Wznowienie wątku Drugi");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try{
            System.out.println("Oczekiwanie na zkończenie wątków.");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Koniec wątku głównego...");

    }
}
