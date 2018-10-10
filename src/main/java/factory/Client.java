package factory;

/**
 * Created by abedormancy@gmail.com on 2018/3/11.
 * 工厂方法模式
 * desc：定义一个用于创建对象的接口，让子类决定将哪一个类实例化。工厂方法模式让一个类的实例化延迟到其子类。工厂方法模式又称为工厂模式，
 * 是一种类创建型模式
 *
 * 工厂方法模式含有 4 个角色
 * 1. Product（抽象产品）
 * 2. ConcreteProduct（具体产品）
 * 3. Factory（抽象工厂方法）
 * 4. ConcreteFactory（具体工厂）
 *
 * 适用场景
 * 1. 客户端不需要知道具体产品类的类名，只需要对应的的工厂即可
 */
public class Client {

    LoggerFactory factory;

    public Client(LoggerFactory factory) {
        this.factory = factory;
    }

    void doSomething() {
        Logger logger = factory.createLogger();
        logger.writeLog();
    }

    public static void main(String[] args) {
        Client c = new Client(new FileLoggerFactory());
        c.doSomething();
    }
}
