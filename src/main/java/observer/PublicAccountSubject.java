package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Abe on 10/10/2018.
 * 公众号 具体目标
 */
public class PublicAccountSubject implements Subject {

    List<Observer> list = new ArrayList<>();
    // 公众号
    String accountName;
    // 推送的文章标题
    String title;

    public PublicAccountSubject(String name) {
        accountName = name;
    }

    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObserver() {
        list.forEach(ob -> ob.update(title));
    }

    /**
     * 推送的文章标题
     *
     * @param title 文章标题
     */
    public void push(String title) {
        this.title = title;
        System.out.println(accountName + " 推送了文章 ----> '" + title + "'");
        notifyObserver();
    }
}
