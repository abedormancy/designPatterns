package adapter.object;

/**
 * Created by abedormancy@gmail.com on 2018/3/15.
 * 适配器模式 [类适配器模式]
 * desc：将一个接口转换成客户希望的另一个接口，使接口不兼容的那些类可以一起工作，其别名为包装器（Wrapper）
 * note：上述接口指的是广义的接口，它可以表示一个方法或者方法的集合
 * 这个示例展示了一个普通情况下给小灯泡通电的对象适配器例子
 * 这个例子与类适配器差不多，只是通过持有 Adaptee 代替继承
 *
 * 适配器一般含有 3 个角色
 * 1.Target（目标抽象类）
 * 2.Adapter（适配器类）
 * 3.Adaptee（适配者类）
 */
public class Client {

    public static void main(String[] args) {
        TinyBulb bulb = new TinyBulb();
        bulb.lighting(new Adapter(new Socket()));
    }
}
