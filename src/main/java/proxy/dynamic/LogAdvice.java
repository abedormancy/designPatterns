package proxy.dynamic;

/**
 * Created by Abe on 10/9/2018.
 */
public class LogAdvice implements IAdvice {

    @Override
    public void before() {
        System.out.println("log before");
    }

    @Override
    public void after() {
        System.out.println("log after");
    }
}
