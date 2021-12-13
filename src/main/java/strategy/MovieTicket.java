package strategy;

/**
 * Created by Abe on 10/9/2018.
 * Context
 */
public class MovieTicket {

    private final double price;
    private Discount discount;

    public MovieTicket(double price) {
        this.price = price;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public double getPrice() {
        if (discount == null) {
            return price;
        }
        // 调用折扣类的折扣计算方法
        return discount.calculate(price);
    }
}
