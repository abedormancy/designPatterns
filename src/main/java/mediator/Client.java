package mediator;

/**
 * Created by Abe on 10/11/2018.
 * 中介者模式 / 调停者模式
 * desc：用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显示的互相引用，而且可以独立地改变它们之间的交互
 *
 * 中介者模式有 4 个角色
 * 1. mediator（抽象中介者）
 * 2. ConcreteMediator（具体中介者）
 * 3. Colleague（抽象同事类）
 * 4. ConcreteColleague（具体同事类）
 *
 * 这里演示了一个游戏进度保存的简单示例
 */
public class Client {

    public static void main(String[] args) {
        MementoCaretaker caretaker = new MementoCaretaker();

        // 不会保存进度的笨蛋
        Player player1 = new Player("笨蛋", 100);
        player1.info();
        player1.attack("蚂蚁");
        player1.attack("毛毛虫");
        player1.info();
        player1.attack("吊睛白额大虫");
        player1.info();

        System.out.println("---------- 友情分割线 ----------");

        // 会保存进度的高玩
        Player player2 = new Player("高手", 100);
        player2.info();
        player2.attack("蚂蚁");
        caretaker.save(1, player2);
        player2.attack("毛毛虫");
        caretaker.save(1, player2);
        player2.attack("吊睛白额大虫");
        player2.info();
        caretaker.restore(1, player2); // 有存档，不怕挂~
        player2.info();
        player2.setHp(100); // 打不过，嗑药啊
        player2.info();
        player2.attack("吊睛白额大虫");
        player2.info();
    }
}
