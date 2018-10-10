package adapter.object;

/**
 * Created by Abe on 10/10/2018.
 */
public class TinyBulb {

    /**
     * 小灯泡通电状态，假设 3V 发光，10V 极限
     *
     * @param voltage 电压接口
     */
    void lighting(Voltage voltage) {
        int v = voltage.output();
        if (v < 3) {
            System.out.println("小灯泡好像亮不起来~");
        } else if (v >= 3 && v <= 10) {
            System.out.println("小灯泡亮起来啦!");
        } else {
            // 真实事件，小时候 220V 直接怼上去，爆炸跳闸，好在没炸到眼睛.. - -
            System.out.println("boom!!，小灯泡爆炸了!!!!");
        }
    }
}
