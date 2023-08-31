
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Callme target = new Callme();
        Caller ob1 = new Caller("Witaj",target);
        Caller ob2 = new Caller("Zynchronizowany",target);
        Caller ob3 = new Caller("Tekście",target);

        //uruchomienie wątków
        ob1.t.start();
        //ob1.t.join();
        ob2.t.start();
        //ob2.t.join();
        ob3.t.start();
        //ob3.t.join();

        try{
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
