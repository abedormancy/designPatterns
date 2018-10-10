package adapter.object;

/**
 * Created by Abe on 10/10/2018.
 * 插座，充当 Adaptee （适配者），也就是被适配的对象
 */
public class Socket {

    public int output220V() {
        return 220;
    }
}
