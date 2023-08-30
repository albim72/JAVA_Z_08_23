import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        StringTokenizer sq1 = new StringTokenizer("Jacek Agata Jan Olga Tomek Benek Jan Jacek Inga");
        StringTokenizer sq2 = new StringTokenizer("Jacek Agata Janusz Olga Tomek Benek Janina Jacek Inka");

        while (sq1.hasMoreTokens())
            System.out.println(sq1.nextToken());

        System.out.println("_________________________________________________");

        while (sq2.hasMoreTokens())
            System.out.println(sq2.nextToken());

        System.out.println("_________________________________________________");

        String delim = ", ";
        String imie = "Jacek, Agata, Janusz, Olga, Tomek, Benek, Janina, Jacek, Inka";

        StringTokenizer podzielimie = new StringTokenizer(imie,delim);
        int count = podzielimie.countTokens();
        System.out.println("Liczba imion: " + count + "\n");

        System.out.println("_________________________________________________");

        for(int i=1;i<=3;i++){
            System.out.println("token [" + i + "]: " + podzielimie.nextToken());
        }

        System.out.println("_________________________________________________");

        while (podzielimie.hasMoreTokens())
            System.out.println(podzielimie.nextToken());
    }
}
