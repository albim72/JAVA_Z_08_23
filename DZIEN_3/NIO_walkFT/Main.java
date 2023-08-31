import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        String dirname = "xyz";
        System.out.println("Drzewo katalogów rozpoczynające się od: " + dirname + ":\n");

        try{
            Files.walkFileTree(Path.of(dirname),new MyFileVisitor());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
