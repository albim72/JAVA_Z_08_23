// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      StringBuilder str01 = new StringBuilder();
      str01.append("szkolenie z zakresu porogramowania w języku Java");
        System.out.println("Informacja: " + str01);

        StringBuilder znaki = new StringBuilder("AADDVVVBGDGJREDFGHKJH");
        System.out.println("Znaki: " + znaki);
        StringBuilder wart = new StringBuilder(1255);
        System.out.println(wart);
        System.out.println(wart.capacity());

        StringBuilder str02 = new StringBuilder(str01.toString());
        System.out.println("drugi tekst: " + str02);
        StringBuilder str03 = str01.reverse();
        System.out.println(str03);
        System.out.println(str01);

        StringBuilder str04 = new StringBuilder(str01.reverse());
        System.out.println(str04);
        System.out.println(str01);

    }
}
