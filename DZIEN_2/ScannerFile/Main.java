import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        FileWriter fout = new FileWriter("test.txt");
        fout.write("2 3,7 12 18,56 9 111 0,45 5 gotowe");
        fout.close();

        FileReader fin = new FileReader("test.txt");

        Scanner con = new Scanner(fin);
        int count = 0;
        double sum = 0.0;
        //System.out.println("podaj liczby do wyliczenia średniej, jeśli chcesz zakończyć wpisz: gotowe");

        while (con.hasNext()) {
            if(con.hasNextDouble()){
                sum += con.nextDouble();
                count++;
            }
            else{
                String str = con.next();
                if(str.equals("gotowe")) break;
                else {
                    System.out.println("Błąd formatu pliku");
                    return;
                }

            }
        }
        con.close();
        System.out.println("Średnia wynosi: " + sum/count);
    }
}
