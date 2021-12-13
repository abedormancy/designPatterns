package strategy;

/**
 * Created by Abe on 10/9/2018.
 * 折扣类：抽象策略类
 */
public interface Discount {

    double calculate(double price);
}
