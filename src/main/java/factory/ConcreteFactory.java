package factory;

/**
 * Created by abedormancy@gmail.com on 2018/3/11.
 */
public class ConcreteFactory implements Factory {

    @Override
    public Product createProduct() {
        return new ConcreteProduct();
    }
}
