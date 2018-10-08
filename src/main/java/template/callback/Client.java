package template.callback;

/**
 * Created by abedormancy@gmail.com on 2018/3/10.
 * 如果子类过多，可以通过结合使用回调来处理这种问题
 */
public class Client {

    public static void main(String[] args) {
        String value = new SimpleObjectTemplate().get("2", obj -> {
            if (obj == null) return "null";

            try {
                int x = Integer.parseInt(String.valueOf(obj));
                return "Integer: " + x;
            } catch (NumberFormatException ex) {
                return "String: " + obj;
            }
        });
        System.out.println(value);
    }
}
