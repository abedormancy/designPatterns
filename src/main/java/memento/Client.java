package memento;

/**
 * Created by Abe on 10/21/2018.
 * 备忘录模式
 * desc：在不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，这样可以在以后将对象恢复到原先保存的状态
 *
 * 备忘录模式含有 3 个角色
 * 1. Originator（原发器）
 * 2. Memento（备忘录）
 * 3. Caretaker（负责人）
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
