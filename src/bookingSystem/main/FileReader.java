package bookingSystem.main;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.List;

public class FileReader {

    private static final String FILENAME = "contractors.txt";

    public static List<String> readFile() {
        Path path = Paths.get(FILENAME);
        List<String> lines = null;
        Charset charset = Charset.defaultCharset();
        try {
            lines = Files.readAllLines(path, charset);
        } catch (IOException e) {
            System.out.printf("Could not read file %s successfully.%n", FILENAME);
        }
        return lines;
    }

}
