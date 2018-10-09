package decorator;

/**
 * Created by Abe on 10/9/2018.
 * 调料（抽象装饰类）
 */
public abstract class CondimentDecorator extends Beverage {

    // 所有的调料必须实现 getDescription()
    public abstract String getDescription();
}
