package factory;

/**
 * Created by Abe on 10/9/2018.
 * 数据库日志记录器：具体产品
 */
public class DatabaseLogger implements Logger {

    @Override
    public void writeLog() {
        System.out.println("db log");
    }
}
