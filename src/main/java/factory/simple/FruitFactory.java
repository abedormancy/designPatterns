package factory.simple;

/**
 * Created by Abe on 10/9/2018.
 * 工厂类
 */
public class FruitFactory {

    /**
     * 静态工厂方法，可以使用反射生成类实例，否则每次新增产品都需要修改此类
     * @param fruitName
     * @return
     */
    public static Fruit getFruit(String fruitName) {
        try {
            Class<?> className = Class.forName("factory.simple." + fruitName);
            return (Fruit) className.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
