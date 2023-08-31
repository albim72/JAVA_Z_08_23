import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;

        //sprawdzenie czy podano nazwę pliku
        if(args.length != 1){
            System.out.println("Sposób użycia: Klasa nazwa pliku");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Nie można otworzyć pliku..");
            return;
        }

        try {
            do{
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            }while (i != -1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try{
            fin.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
