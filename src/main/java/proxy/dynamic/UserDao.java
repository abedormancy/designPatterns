package proxy.dynamic;

/**
 * Created by Abe on 10/9/2018.
 * 真是主题角色
 */
public class UserDao implements IUserDao {

    @Override
    public boolean userExists(String userId) {
        if (userId == null || userId.trim().length() != 1) {
            System.out.println("not found user [id=" + userId + "]");
            return false;
        } else {
            System.out.println(":) user " + userId );
            return true;
        }
    }
}
