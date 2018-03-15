package facade;

/**
 * Created by abedormancy@gmail.com on 2018/3/15.
 */
public class BoilWaterFacade {

    // sub systems
    private Faucet faucet = new Faucet();
    private Kettle kettle = new Kettle();


    public void begin() {
        faucet.open();
        kettle.fill();
        faucet.close();
        //....
        System.out.println("把水烧开 :)");
    }
}
