package strategy;

/**
 * Created by Abe on 10/9/2018.
 */
public class ChildrenDiscount implements Discount {

    @Override
    public double calculate(double price) {
        System.out.println("儿童票");
        if (price >= 20) {
            price -= 10;
        }
        return price;
    }
}
