import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner con = new Scanner(System.in);
        int count = 0;
        double sum = 0.0;
        System.out.println("podaj liczby do wyliczenia średniej, jeśli chcesz zakończyć wpisz: gotowe");

        while (con.hasNext()) {
            if(con.hasNextDouble()){
                sum += con.nextDouble();
                count++;
            }
            else{
                String str = con.next();
                if(str.equals("gotowe")) break;
                return;
            }
        }
        con.close();
        System.out.println("Średnia wynosi: " + sum/count);
    }
}
