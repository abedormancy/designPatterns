package facade;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * Created by abedormancy@gmail.com on 2018/3/15.
 */
public class Faucet {

    public void open() {
        System.out.println("打开水龙头");
    }

    public void close() {
        System.out.println("关闭水龙头");
    }

}
