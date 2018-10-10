package adapter.clz;

/**
 * Created by abedormancy@gmail.com on 2018/3/15.
 * 电源适配器 充当 Adapter 角色
 */
public class Adapter extends Socket implements Voltage {

    @Override
    public int output() {
        int v = super.output();
        // 模拟将插座的 220V 转换成 5V
        return v / 44;
    }
}
