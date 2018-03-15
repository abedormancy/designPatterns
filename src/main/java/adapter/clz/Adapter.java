package adapter.clz;

/**
 * Created by abedormancy@gmail.com on 2018/3/15.
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        specificRequest();
    }
}
