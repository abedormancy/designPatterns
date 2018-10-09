package decorator;

/**
 * Created by Abe on 10/9/2018.
 * 饮料：抽象构件
 */
public abstract class Beverage {

    String description = "unknown";

    public String getDescription() {
        return description;
    }

    /**
     *
     * @return  返回饮料的单价
     */
    public abstract double cost();

    @Override
    public String toString() {
        return getDescription() + " $" + cost();
    }
}
