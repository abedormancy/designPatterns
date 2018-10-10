package adapter.object;

/**
 * Created by abedormancy@gmail.com on 2018/3/15.
 * 电源适配器 充当 Adapter 角色
 */
public class Adapter implements Voltage {

    private Socket socket;

    // Adaptee 可以通过客户端指定，也可以直接在 Adapter 中指定
    public Adapter(Socket socket) {
        this.socket = socket;
    }

    @Override
    public int output() {
        int v = socket.output220V();
        // 模拟将插座的 220V 转换成 5V，此方法是适配器模式的核心
        return v / 44;
    }
}
