package adapter.clz;

/**
 * Created by abedormancy@gmail.com on 2018/3/15.
 */
public class Client {
    public static void main(String[] args) {
        Target t = new Adapter();
        t.request();
    }
}
