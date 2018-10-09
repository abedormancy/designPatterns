package facade;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Created by Abe on 10/9/2018.
 * 子系统类
 */
public class FileWriter {

    public void write(String data, String filename) {
        try {
            // CREATE_NEW 如果文件存在则抛出异常; CREATE 覆盖
            Files.write(Paths.get(filename), data.getBytes(StandardCharsets.ISO_8859_1), StandardOpenOption.CREATE_NEW);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
