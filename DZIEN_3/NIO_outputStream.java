import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {

        try(OutputStream fout =
                new BufferedOutputStream(
                        Files.newOutputStream(Path.of("testowy.txt"))
                )){
            for(int i=0;i<26;i++)
                fout.write((byte) ('A' + i));

        } catch (IOException e) {
            System.out.println("Błąd: " + e);
        } catch (InvalidPathException e){
            System.out.println("Błąd: " + e);
        }
    }
}
