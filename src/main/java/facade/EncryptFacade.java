package facade;

import javax.crypto.Cipher;

/**
 * Created by Abe on 10/9/2018.
 * 外观类
 */
public class EncryptFacade {

    // 维持对其他系统的引用
    private FileReader reader;
    private CipherMachine cipher;
    private FileWriter writer;

    private String key;

    public EncryptFacade(String key) {
        reader = new FileReader();
        cipher = new CipherMachine();
        writer = new FileWriter();
        this.key = key;
    }

    public void fileEncrypt(String plainSrc, String encryptDest) {
        String plainText = reader.read(plainSrc);
        String data = cipher.encrypt(key, plainText);
        writer.write(data, encryptDest);
    }

    public void fileDecrypt(String encryptSrc, String decryptDest) {
        String encryptText = reader.read(encryptSrc);
        String originData = cipher.decrypt(key, encryptText);
        writer.write(originData, decryptDest);
    }
}
