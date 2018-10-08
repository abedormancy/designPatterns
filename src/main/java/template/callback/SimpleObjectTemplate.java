package template.callback;

/**
 * Created by abedormancy@gmail.com on 2018/3/10.
 */
public class SimpleObjectTemplate {

    public <T> T get(Object obj, ObjectHandler<T> handler) {
        return handler.handler(obj);
    }
}
