package adapter.object;

/**
 * Created by abedormancy@gmail.com on 2018/3/15.
 */
public class Adapter extends Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    void request() {
        adaptee.specificRequest();
    }
}
