package decorator;

/**
 * Created by abedormancy@gmail.com on 2018/3/12.
 * 装饰器模式
 * desc：动态的给一个对象添加一些额外职责。就增加功能来说，装饰器模式比生成子类更为灵活
 * Java IO 中大量的使用了装饰器模式
 *
 * 典型的装饰器模式包含以下 4 个角色
 * 1. Component（抽象构件）
 * 2. ConcreteComponent（具体构件）
 * 3. Decorator（抽象装饰类）
 * 4. ConcreteDecorator（具体装饰类）
 *
 * 适用场景
 * 1. 在不影响其他类的情况下，以动态，透明的方式给单个对象添加职责
 */
public class Client {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage);

        // 深焙咖啡加份牛奶，加两份摩卡
        Beverage beverage1 = new DarkRoast();
        beverage1 = new Milk(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1);

        // 混合加豆浆
        Beverage beverage2 = new Soy(new HouseBlend());
        System.out.println(beverage2);
    }
}
