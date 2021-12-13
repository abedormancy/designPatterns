package proxy.dynamic;

/**
 * Created by Abe on 10/9/2018.
 * 动态代理示例
 */
public class Client {

    public static void main(String[] args) {
        IUserDao dao = new UserDao();
        dao.userExists("1");
        System.out.println("-----------------------");
        SimpleProxy proxy = new SimpleProxy();
        dao = (IUserDao) proxy.bind(dao, new LogAdvice());
        dao.userExists("1");
    }
}
