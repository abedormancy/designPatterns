package decorator;

/**
 * Created by Abe on 10/9/2018.
 * 深焙（具体构件）
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
