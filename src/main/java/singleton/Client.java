package singleton;

/**
 * Created by abedormancy@gmail.com on 2018/3/10.
 * 简单的说，单例模式希望对象只有一个实例，但没有控制对象实例化的全局对象
 *
 * 示例提供了 4 种正确的单例模式使用方法
 * 1. Moon 最简单常见的单例实现方法
 * 2. Sun 通过双检锁实现延迟加载
 * 3. Earth 通过静态内部类实现延迟加载
 * 4. Mars 通过枚举类实现（如果需要序列化，强烈推荐此种方法）
 */
public class Client {

    public static void main(String[] args) {
        System.out.println(Moon.getInstance() == Moon.getInstance());
        System.out.println(Sun.getInstance() == Sun.getInstance());
        System.out.println(Earth.getInstance() == Earth.getInstance());
        System.out.println(Mars.INSTANCE == Mars.INSTANCE);
    }
}
