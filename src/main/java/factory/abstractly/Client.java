package factory.abstractly;

/**
 * Created by Abe on 10/9/2018.
 * 抽象工厂方法
 * desc：提供一个创建一系列相关或相互依赖对象的接口，而无须指定它们具体的类。抽象工厂模式又称为 Kit 模式
 * 在抽象工厂模式中，每一个具体工厂都提供了多个工厂方法用于产生多种不同类型的产品，这些产品构成了一个产品族
 */
public class Client {

    public static void main(String[] args) {
        SkinFactory factory = new SummerSkinFactory();
        Button button = factory.createButton();
        ComboBox comboBox = factory.createComboBox();
        TextField textField = factory.createTextField();
        button.display();
        comboBox.show();
        textField.type();
    }
}
