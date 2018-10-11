package observer;

/**
 * Created by Abe on 10/10/2018.
 * 目标
 */
public interface Subject {
    /**
     * 添加观察者
     *
     * @param observer 观察者
     */
    void registerObserver(Observer observer);

    /**
     * 删除观察者
     *
     * @param observer 观察者
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObserver();
}
