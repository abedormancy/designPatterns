package factory.simple;

/**
 * Created by Abe on 10/9/2018.
 * 简单工厂也称静态工厂，客户端通过工厂类来创建一个产品类的实例，而无须直接使用 new 关键字来创建对象
 * 含有 3 个角色
 * 1. Factory（工厂角色）
 * 2. Fruit（抽象产品角色）
 * 3. ConcreteProduct（具体产品角色）
 * 有时候为了简化，工厂角色中的静态工厂方法会直接放入抽象产品角色中，而无须工厂角色
 */
public class Client {

    public static void main(String[] args) {
        Fruit f = FruitFactory.getFruit("Apple");
        f.type();
        f = FruitFactory.getFruit("Orange");
        f.type();

        // class not found.
        f = FruitFactory.getFruit("Watermelon");
        f.type();
    }
}
