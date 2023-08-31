
public class Main {
    public static void main(String[] args) {
        Thread t  = Thread.currentThread();
        System.out.println("Aktualny wątek: " + t);

        t.setName("mój wątek");
        System.out.println("Aktualny wątek po zmianie nazwy: " + t);
        try {
            for(int n=5;n>0;n--){
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Przerwanie wątku głownego");
        }
    }
}
