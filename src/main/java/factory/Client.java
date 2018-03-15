package factory;

/**
 * Created by abedormancy@gmail.com on 2018/3/11.
 */
public class Client {

    private Factory factory;

    public Client(Factory factory) {
        this.factory = factory;
    }

    public void doSomething() {
        Product product = factory.createProduct();
        // to do something ...
    }

    public static void main(String[] args) {
        Client client = new Client(new ConcreteFactory());
        client.doSomething();
    }
}
