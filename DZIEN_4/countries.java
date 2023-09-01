import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale[] loc = Locale.getAvailableLocales();
        System.out.println("Kod języka" + "#" +
                "Kod kraju" + "#" +
                "Kod wariantu" + "#" +
                "Język" + "#" +
                "Kraj" + "#" + "Wariant");
        for(int i=0;i<loc.length;i++){
            String countryCode = loc[i].getCountry();
            String langCode = loc[i].getLanguage();
            String varCode = loc[i].getVariant();

            String kraj = loc[i].getDisplayCountry();
            String jezyk = loc[i].getDisplayLanguage();
            String wariant = loc[i].getDisplayVariant();

            System.out.println(langCode + "#" +
                    countryCode + "#" +
                    varCode + "#" +
                    jezyk + "#" + kraj + "#" + wariant);
        }
    }
}
