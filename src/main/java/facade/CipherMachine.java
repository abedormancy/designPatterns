package facade;

import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * Created by Abe on 10/9/2018.
 * 子系统类
 */
public class CipherMachine {

    private String initVector = "0x00000000001111"; // 16 bytes IV

    private static String[] cache = new String[11];

    static {
        cache[10] = "0000000000";
        for (int i = 9; i >= 0; i--) {
            cache[i] = cache[i + 1].substring(0, cache[i + 1].length() - 1);
        }
    }

    public CipherMachine() {
    }

    public CipherMachine(String initVector) {
        this.initVector = initVector;
    }

    public String encrypt(String key, String value) {
        return encrypt(key, initVector, value);
    }

    public String decrypt(String key, String encrypted) {
        return decrypt(key, initVector, encrypted);
    }

    private static final String encrypt(String key, String initVector, String value) {
        try {
            IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
            SecretKeySpec skeySpec = new SecretKeySpec(toKey(key).getBytes("UTF-8"), "AES");

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);

            byte[] encrypted = cipher.doFinal(value.getBytes());

            String encryptedString = Base64.getEncoder().encodeToString(encrypted);
            return encryptedString;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static final String decrypt(String key, String initVector, String encrypted) {
        try {
            IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
            SecretKeySpec skeySpec = new SecretKeySpec(toKey(key).getBytes("UTF-8"), "AES");

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);

            byte[] original = cipher.doFinal(Base64.getDecoder().decode(encrypted));

            return new String(original);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static final String toKey(String key) {
        int len;
        if (key == null || key.trim().length() == 0 || (len = key.length()) < 6) {
            throw new IllegalArgumentException("dudulu .. >= 6");
        }
        len = 16 - len;
        if (len <= 10) {
            return cache[len] + key;
        } else return key;
    }

    public static void main(String[] args) {
        CipherMachine cipher = new CipherMachine();
        String value = cipher.encrypt("abedormancY", "hello world. 神啊.");
        System.out.println(value);
        value = cipher.decrypt("abedormancY", value);
        System.out.println(value);
    }
}
