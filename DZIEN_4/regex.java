import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pat;
        Matcher mat;
        boolean found;

        pat = Pattern.compile("Java");
        mat = pat.matcher("Java");
        found = mat.matches();
        System.out.println("dopasowanie słowa zadanego i sprawdzanego... opcja 1 ->");
        if(found) System.out.println("Pasuje");
        else System.out.println("Nie pasuje");

        System.out.println("__________________________________");
        mat = pat.matcher("Java SE");
        found = mat.matches();
        System.out.println("dopasowanie słowa zadanego i sprawdzanego... opcja 2 ->");
        if(found) System.out.println("Pasuje");
        else System.out.println("Nie pasuje");

        System.out.println("__________________________________");

        pat = Pattern.compile("W+");
        mat = pat.matcher("W WW WWW WWWWWWW WW_WW");
        while (mat.find())
            System.out.println("Dopasowana sekwencja: " + mat.group());

        System.out.println("__________________________________");

        pat = Pattern.compile("e.+d");
        mat = pat.matcher("extend cup end table");
        while (mat.find())
            System.out.println("Dopasowana sekwencja: " + mat.group());

        System.out.println("__________________________________");

        pat = Pattern.compile("e.+?d");
        mat = pat.matcher("extend cup end table");
        while (mat.find())
            System.out.println("Dopasowana sekwencja: " + mat.group());

        System.out.println("__________________________________");

        pat = Pattern.compile("[ ,.!]");
        String strs[] = pat.split("jeden dwa.alfa,beta!teta._");
       for(int i=0;i< strs.length;i++)
           System.out.println("Wyraz: " + strs[i]);

    }
}
