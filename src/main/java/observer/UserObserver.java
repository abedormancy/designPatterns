package observer;

/**
 * Created by Abe on 10/10/2018.
 * 用户 具体观察者
 * <p>
 * 在一些复杂情况下具体观察者类的 update 方法在执行时需要使用到具体目标类中的状态（属性），因为它们之间还会存在关联或依赖关系
 */
public class UserObserver implements Observer {

    String name;

    public UserObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String info) {
        System.out.println("用户[" + name + "] 收到 '" + info + "'");
    }
}
