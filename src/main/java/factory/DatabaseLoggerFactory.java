package factory;

/**
 * Created by Abe on 10/9/2018.
 * 具体工厂
 */
public class DatabaseLoggerFactory implements LoggerFactory {

    @Override
    public Logger createLogger() {
        // ...
        Logger logger = new DatabaseLogger();
        // ...
        return logger;
    }
}
