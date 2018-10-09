package decorator;

/**
 * Created by Abe on 10/9/2018.
 * 综合（具体构件）
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
