package singleton;

/**
 * Created by abedormancy@gmail.com on 2018/3/10.
 */
public class Moon {

    private static Moon moon = new Moon();

    private Moon() {}

    public static Moon getInstance() {
        return moon;
    }
}
