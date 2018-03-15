package template;

/**
 * Created by abedormancy@gmail.com on 2018/3/10.
 */
public class Client {

    public static void main(String[] args) {
        HappyPeople p1 = new PassengerByAir();
        HappyPeople p2 = new PassengerByTrain();
        p1.celebrateSpringFestival();
        p2.celebrateSpringFestival();
    }
}
