package observer.official;

/**
 * Created by Abe on 10/11/2018.
 * <p>
 * 对于观察者模式，其实 Java 已经为我们提供了已有的接口和类
 */
public class Client {

    public static void main(String[] args) {
        Publish pub= new Publish();

        Subscribe sub1 = new Subscribe("a", pub);
        Subscribe sub2 = new Subscribe("b", pub);

        pub.publish("hello world.");
    }
}
