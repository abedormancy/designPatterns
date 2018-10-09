package factory.abstractly;

/**
 * Created by Abe on 10/9/2018.
 */
public class SpringTextField implements TextField {

    @Override
    public void type() {
        System.out.println("显示浅绿色文本框");
    }
}
