package prototype;

import java.time.LocalDate;

/**
 * Created by abedormancy@gmail.com on 2018/3/11.
 * 原型模式
 * desc：使用原型实例指定创建对象的种类，并且通过克隆这些原型对象创建新的对象
 *
 * 原型模式一般含有 3 个角色
 * 1. Prototype（抽象原型类）
 * 2. ConcretePrototype（具体原型类）
 * 3. Client（客户端类）
 */
public class Client {

    public static void main(String[] args) {
        WeeklyLog last = new WeeklyLog();
        last.setName("abe");
        last.setDate(LocalDate.now().minusWeeks(1));
        last.setContent("不开心，天天加班，头都要秃了。。。");
        WeeklyLog now = last.clone();
        now.setDate(LocalDate.now());
        now.setContent("终于解放了，摸鱼中...:P");
        System.out.println(last);
        System.out.println(now);
    }

}
