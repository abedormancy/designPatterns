package strategy;

/**
 * Created by Abe on 10/9/2018.
 */
public class VipDiscount implements Discount {

    @Override
    public double caculate(double price) {
        System.out.println("vip");
        System.out.println("增加积分~");
        return .5 * price;
    }
}
