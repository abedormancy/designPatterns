package factory;

/**
 * Created by Abe on 10/9/2018.
 * 文件日志记录器：具体产品
 */
public class FileLogger implements Logger {

    @Override
    public void writeLog() {
        System.out.println("file log");
    }
}
