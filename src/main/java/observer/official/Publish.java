package observer.official;

import java.util.Observable;

/**
 * Created by Abe on 10/11/2018.
 * Subject
 */
public class Publish extends Observable {

    public void publish(String info) {
        System.out.println("发布消息: " + info);
        // 如果需要通知订阅者，需要先 setChanged() 标识发布者对象已改变
        setChanged();
        notifyObservers(info);
    }
}
