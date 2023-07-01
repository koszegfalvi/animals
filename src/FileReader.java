import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FileReader {
    public static List<String> fileReadHandler(String path) {
        List<String> lines = new ArrayList<>();

        File file = new File(path);

        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                lines.add(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("nem található a fájl");

        }
        System.out.println(lines);
        return lines;
    }
}
