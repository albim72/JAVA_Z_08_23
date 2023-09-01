import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class Main {
    static public void raport(){
        Locale defloc = Locale.getDefault();
        System.out.println("Domyślna lokalizacja: "  + defloc);
        DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
        NumberFormat nf = NumberFormat.getInstance();
        System.out.println(df.format(new Date()));
        System.out.println(nf.format(12457.34));
        System.out.println("_______________________________________");
    }

    public static void main(String[] args) {
       raport();
       Locale.setDefault(new Locale("en"));
       raport();
    }
}
