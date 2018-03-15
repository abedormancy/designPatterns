package template.callback;

/**
 * Created by abedormancy@gmail.com on 2018/3/10.
 */
public class Client {

    public static void main(String[] args) {
        SimpleObjectTemplate template = new SimpleObjectTemplate();
        String value = template.get("2", new ObjectHandler<String>() {
            @Override
            public String handler(Object obj) {
                if (obj == null) return "";

                try {
                    int x = Integer.parseInt(String.valueOf(obj));
                    return "Integer: " + x;
                } catch (NumberFormatException ex) {
                    return "String: " + obj;
                }
            }
        });
        System.out.println(value);
    }
}
