package facade;

/**
 * Created by abedormancy@gmail.com on 2018/3/15.
 * 外观模式
 * desc：外部与一个子系统的通信通过一个统一的外观角色进行，为子系统中的一组接口提供一个一致的入口，外观模式定义了一个高层接口。外观模式
 * 又称为门面模式，它是一种对象结构型模式
 * 外观模式是使用到了一条非常有用的设计原则:
 * 最少知识原则 ( Least Knowledge Principle ) 也称为 迪米特法则 (Law Of Demeter)
 *
 * 外观模式含有 2 个角色
 * 1. Facade（外观角色）
 * 2. SubSystem（子系统角色）
 *
 * 适用场景
 * 1. 当要为访问一系列复杂的子系统提供一个简单入口时
 */
public class Client {

    public static void main(String[] args) {
        EncryptFacade encrypt = new EncryptFacade("abedormancY");
        encrypt.fileEncrypt("r:/1.txt", "r:/2.txt");
        encrypt.fileDecrypt("r:/2.txt", "r:/3.txt");
    }
}
