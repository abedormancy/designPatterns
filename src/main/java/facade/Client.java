package facade;

/**
 * Created by abedormancy@gmail.com on 2018/3/15.
 */
public class Client {
    /**
     * 外观模式是使用到了一条非常有用的设计原则:
     * 最少知识原则 ( Least Knowledge Principle ) 也称为 迪米特原则 (Law Of Demeter)
     * @param args
     */
    public static void main(String[] args) {
        BoilWaterFacade bw = new BoilWaterFacade();
        bw.begin();
    }
}
