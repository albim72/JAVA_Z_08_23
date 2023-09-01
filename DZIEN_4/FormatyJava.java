import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Main {
    public static void show(double n1, Double n2, BigDecimal n3,String format){
        DecimalFormat df = new DecimalFormat(format);
        System.out.println("Format: " + format);
        System.out.println("Liczba: " + n1 + " -> wygląda tak: " + df.format(n1));
        System.out.println("Liczba: " + n2 + " -> wygląda tak: " + df.format(n2));
        System.out.println("Liczba: " + n3 + " -> wygląda tak: " + df.format(n3));
    }

    public static void main(String[] args) {
        double num1 = 1.35635;
        Double num2 = 45352.35635;
        BigDecimal num3 = new BigDecimal("100.43534545");

        show(num1,num2,num3,"#.##");
        show(num1,num2,num3,"#.## %");
        show(num1,num2,num3,"#.0000");
        show(num1,num2,num3,"#.00 ");
        show(num1,num2,num3,"#.00  ");
        show(num1,num2,num3,"[000.0]");

    }
}
