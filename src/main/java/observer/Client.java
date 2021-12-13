package observer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Abe on 10/10/2018.
 * 观察者模式
 * desc：定义了一种一对多的依赖关系，使得当一个对象的状态发生变化时，其相关依赖对象皆得到通知并被自动更新。观察者模式的别名包括发布-订阅
 * （Publish/Subscribe）模式、模型-视图（Model/View）模式、源-监听器（Source/Listener）模式或从属者（Dependents）模式
 * <p>
 * 观察者模式含有 4 个角色
 * 1. Subject（目标/主题）
 * 2. ConcreteSubject（具体目标）
 * 3. Observer（观察者）
 * 4. ConcreteObserver（具体观察者）
 * <p>
 * 观察者模式是使用频率最高的模式之一
 * <p>
 * 例子使用观察者模式简单的模拟了公众号推送信息
 *
 * 适用场景
 * 1. 一个对象改变导致一个或多个其他对象也发生改变
 */
public class Client {

    public static void main(String[] args) {
        // Subject
        PublicAccountSubject accountA = new PublicAccountSubject("公众号A");
        PublicAccountSubject accountB = new PublicAccountSubject("公众号B");
        // Observer
        List<UserObserver> obList = Stream.of("夜斗,犬夜叉,白")
                .map(n -> n.split(","))
                .flatMap(Arrays::stream)
                .map(UserObserver::new)
                .collect(Collectors.toList());

        // 大家都关注了公众号A，只有'白'关注了公众号B
        obList.forEach(accountA::registerObserver);
        accountB.registerObserver(obList.get(2));

        accountA.push("学习还是得死磕啊");
        accountB.push("社交障碍怎么办");
    }
}
