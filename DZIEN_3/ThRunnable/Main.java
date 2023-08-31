
public class Main {
    public static void main(String[] args) {
        NewThread nt = new NewThread();

        nt.t.start();
        try{
            for(int i=5;i>0;i--){
                System.out.println("Wątek główny: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("wyjście z wątku głównego...");
    }
}
