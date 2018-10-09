package decorator;

/**
 * Created by Abe on 10/9/2018.
 * 浓缩（具体构件）
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
