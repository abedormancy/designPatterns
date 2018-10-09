package factory.simple;

/**
 * Created by Abe on 10/9/2018.
 * 具体产品类
 */
public class Orange implements Fruit {

    @Override
    public void type() {
        System.out.println("an orange ~");
    }
}
