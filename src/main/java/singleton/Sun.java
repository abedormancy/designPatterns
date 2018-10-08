package singleton;

/**
 * Created by abedormancy@gmail.com on 2018/3/10.
 */
public class Sun {

    private volatile static Sun sun;

    private Sun() {}

    public static Sun getInstance() {
        if (sun == null) {
            synchronized (Sun.class) { // Double-Check Locking 双重检查锁定
                if (sun == null) sun = new Sun();
            }
        }
        return sun;
    }
}
