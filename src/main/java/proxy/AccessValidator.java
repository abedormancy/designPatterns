package proxy;

/**
 * Created by abedormancy@gmail.com on 2018/3/14.
 */
public class AccessValidator {

    boolean validate(String userId) {
        System.out.println("validate user " + userId);
        boolean flag = "abe".equalsIgnoreCase(userId);
        if (flag) {
            System.out.println("pass");
        } else {
            System.out.println("no pass");
        }
        return flag;
    }
}
