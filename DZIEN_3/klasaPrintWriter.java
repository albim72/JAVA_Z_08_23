import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out,true);
        pw.println("to jest tekst wysłany przez PW");
        int i =-99;
        pw.println(i);
        double d = 4.66e-9;
        pw.println(d);
    }
}
