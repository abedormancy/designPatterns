package strategy;

import java.math.BigDecimal;

/**
 * Created by Abe on 10/9/2018.
 */
public class StudentDiscount implements Discount {

    @Override
    public double calculate(double price) {
        System.out.println("学生票");
        return BigDecimal.valueOf(price).multiply(new BigDecimal("0.8")).doubleValue();
    }
}
