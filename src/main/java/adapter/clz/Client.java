package adapter.clz;

/**
 * Created by abedormancy@gmail.com on 2018/3/15.
 * 适配器模式 [类适配器模式]
 * desc：将一个接口转换成客户希望的另一个接口，使接口不兼容的那些类可以一起工作，其别名为包装器（Wrapper）
 * note：上述接口指的是广义的接口，它可以表示一个方法或者方法的集合
 * 这个示例展示了一个普通情况下给小灯泡通电的类适配器例子
 * 类适配器通过继承实现，一般也较少使用
 *
 * 适配器一般含有 3 个角色
 * 1.Target（目标抽象类）
 * 2.Adapter（适配器类）
 * 3.Adaptee（适配者类）
 *
 * 适用场景
 * 1. 当系统需要使用一些现有的类，而这些类的接口不符合系统的需求时
 */
public class Client {

    public static void main(String[] args) {
        TinyBulb bulb = new TinyBulb();
        bulb.lighting(new Adapter());

        // 假设不通过 5V 电源适配器，直接连接在 220V 的插座上
        // 为了方便演示如果没有适配器的情况，直接将插座实现了电压接口
        bulb.lighting(new Socket());
    }
}
