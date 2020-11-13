package facade;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Abe on 10/9/2018.
 * 子系统类
 */
public class FileReader {

    public String read(String filename) {
        try {
            byte[] bytes = Files.readAllBytes(Paths.get(filename));
            return new String(bytes, StandardCharsets.ISO_8859_1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
