
public class Main {
    public static void main(String[] args) {
        ThreadJoining t1 = new ThreadJoining();
        ThreadJoining t2 = new ThreadJoining();
        ThreadJoining t3 = new ThreadJoining();
        ThreadJoining t4 = new ThreadJoining();
        ThreadJoining t5 = new ThreadJoining();

        t1.start();

        try{
            t1.join();
            System.out.println("Aktualny wątek( z main): " + Thread.currentThread().getName());

        }catch (InterruptedException e){
            System.out.println("błąd: " + e);
        }

        t2.start();
        try{
            System.out.println("Aktualny wątek( z main): " + Thread.currentThread().getName());
            t2.join();
        }catch (InterruptedException e){
            System.out.println("błąd: " + e);
        }

        t3.start();
        try{
            System.out.println("Aktualny wątek( z main): " + Thread.currentThread().getName());
            t3.join();
        }catch (InterruptedException e){
            System.out.println("błąd: " + e);
        }

        t4.start();
        t5.start();
    }
}
