package strategy;

/**
 * Created by Abe on 10/9/2018.
 * 策略模式
 * desc：定义一系列算法类，将每一个算法封装起来，并让它们可以相互替换。策略模式让算法独立于使用它的客户而变化，是一种对象行为型模式
 * 策略模式含有 3 个角色
 * 1. Context（环境类）
 * 2. Strategy（抽象策略类）
 * 3. ConcreteStrategy（实际策略类）
 *
 * 示例展示了一个电影票打折方案
 *      1) 学生票 8 折
 *      2) 儿童票每张票减免 10 元（原始票价需要 >= 20 元）
 *      3) Vip 5 折还送积分，积分累计到一定额度可换取奖品
 *
 * 适用场景
 * 1. 系统需要动态的在几种算法中进行抉择，可以考虑将这些算法封装到一个个的具有统一接口的算法类中
 */
public class Client {

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket(28);
        System.out.println("正常票价: " + ticket.getPrice());
        ticket.setDiscount(new StudentDiscount());
        System.out.println("学生票价: " + ticket.getPrice());
        ticket.setDiscount(new ChildrenDiscount());
        System.out.println("儿童票: " + ticket.getPrice());
        ticket.setDiscount(new VipDiscount());
        System.out.println("vip: " + ticket.getPrice());
    }
}
