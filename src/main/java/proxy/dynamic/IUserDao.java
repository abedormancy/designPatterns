package proxy.dynamic;

/**
 * Created by Abe on 10/9/2018.
 * 抽象主题角色
 */
public interface IUserDao {

    boolean findUserById(String userId);

}
