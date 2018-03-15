package singleton;

/**
 * Created by abedormancy@gmail.com on 2018/3/10.
 */
public class Client {

    public static void main(String[] args) {

        try {
            Class.forName("singleton.Earth");
            Class.forName("singleton.Moon");
            Class.forName("singleton.Sun");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("--- main ---");
        System.out.println(Moon.getInstance() == Moon.getInstance());
        System.out.println(Sun.getInstance() == Sun.getInstance());
        System.out.println(Earth.getInstance() == Earth.getInstance());
        System.out.println(Mars.INSTANCE == Mars.INSTANCE);
    }
}
