import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Main {
    public static void main(String[] args) {
        if(args.length!=2){
            System.out.println("użycie: Copy żródło cel");
            return;
        }

        try {
            Path source = Path.of(args[0]);
            Path target = Path.of(args[1]);
            Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.out.println("Błąd: " + e);
        } catch (InvalidPathException e){
            System.out.println("Błąd: " + e);
        }
    }
}
