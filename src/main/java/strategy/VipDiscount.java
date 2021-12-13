package strategy;

import java.math.BigDecimal;

/**
 * Created by Abe on 10/9/2018.
 */
public class VipDiscount implements Discount {

    @Override
    public double calculate(double price) {
        System.out.println("vip");
        System.out.println("增加积分~");
        return BigDecimal.valueOf(price).multiply(new BigDecimal("0.5")).doubleValue();
    }
}
