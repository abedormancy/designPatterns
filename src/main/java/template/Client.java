package template;

/**
 * Created by abedormancy@gmail.com on 2018/3/10.
 *
 * 定义了在一个操作中的一个算法框架，把一些步骤推迟到子类去实现。
 * 模板方法模式让子类不需要改变算法结构而重新定义特定算法的步骤。
 */
public class Client {

    public static void main(String[] args) {
        HappyPeople p1 = new PassengerByAir();
        HappyPeople p2 = new PassengerByTrain();
        p1.celebrateSpringFestival();
        p2.celebrateSpringFestival();
    }
}
