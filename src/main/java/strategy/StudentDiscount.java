package strategy;

/**
 * Created by Abe on 10/9/2018.
 */
public class StudentDiscount implements Discount {

    @Override
    public double caculate(double price) {
        System.out.println("学生票");
        return .8 * price;
    }
}
