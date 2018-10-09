package proxy;

/**
 * Created by abedormancy@gmail.com on 2018/3/14.
 * 代理模式
 * desc：给某一个对象提供一个代理，并由代理对象控制对原对象的引用。代理模式是一种对象结构型模式
 * 代理模式与装饰器模式在实现时有些类似，但是代理模式主要是给真实主题类增加一些全新的职责，例如权限控制、缓冲处理等等，而装饰器模式是通过
 * 装饰类为具体构件类增加一些相关的职责
 * 代理模式包含了以下 3 个角色
 * 1. Subject（抽象主题）
 * 2. Proxy（代理主题）
 * 3. RealSubject（真实主题）
 *
 * 远程代理
 * desc：远程代理是一种常用的代理模式，它使得客户端可以访问在远程主机上的对象，远程主机可能具有更好的性能
 * 在 Java 中可以通过 RMI （远程方法调用） 机制来实现远程代理，它能够实现一个 Java 虚拟机中的对象调用另一个 Java 虚拟机中对象的方法。
 * 在 RMI 中，客户端对象可以通过一个桩（ Stub ）对象与远程主机上的业务对象进行通信。远程主机端有一个 Skeleton （骨架）对象来负责与
 * Stub 对象通信，RMI 的基本实现步骤如下
 *      1) 客户端发起请求，将请求转交至 RMI 客户端的 Stub 类
 *      2) Stub 类将请求的接口、方法、参数等信息进行序列化
 *      3) 将序列化后的流使用 Socket 传输至服务器端
 *      4) 服务器端接收到流后将其转发至相应的 Skeleton 类
 *      5) Skeleton 类将请求信息反序列化后调用实际的业务处理类
 *      6) 业务处理类处理完毕后将结果返回给 Skeleton 类
 *      7) Skeleton 类将结果序列化，再次通过 Socket 将流传送给客户端的 Stub
 *      8) Stub 在接收到流后进行反序列化，将反序列化后得到的 Java Object 对象返回给客户端调用者
 *
 * 虚拟代理
 * desc：虚拟代理也是一种常见的代理模式，对于一些占用系统资源较多或加载时间过长的对象，可以给这些对象提供一个虚拟代理。
 *
 * Java 动态代理
 * desc：需要实现 InvocationHandler 接口
 */
public class Client {

    public static void main(String[] args) {
        Searcher searcher = (Searcher) XMLUtil.getBean();
        searcher.doSearch("abe", "mis");
    }
}
