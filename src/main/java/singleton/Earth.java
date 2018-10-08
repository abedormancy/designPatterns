package singleton;

/**
 * Created by abedormancy@gmail.com on 2018/3/10.
 */
public class Earth {

    private Earth() {}

    public static Earth getInstance() {
        return LazyHolder.earthInstance;
    }

    private static class LazyHolder {

        private static final Earth earthInstance = new Earth();

    }
}
