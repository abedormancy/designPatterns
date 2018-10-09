package template;

/**
 * Created by abedormancy@gmail.com on 2018/3/10.
 * 抽象类
 */
public abstract class HappyPeople {

    public void celebrateSpringFestival() {
        subscribeTicket();
        travel();
        celebrate();
    }

    protected final void subscribeTicket() {
        System.out.println("buy ticket.");
    }

    protected abstract void travel();

    protected final void celebrate() {
        System.out.println("happy New Year!");
    }
}
