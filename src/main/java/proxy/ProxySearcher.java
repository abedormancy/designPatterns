package proxy;

/**
 * Created by abedormancy@gmail.com on 2018/3/14.
 * Proxy 代理主题角色
 */
public class ProxySearcher implements Searcher {

    private Searcher searcher = new RealSearcher();
    private AccessValidator validator;
    private Logger logger;

    @Override
    public String doSearch(String userId, String keyword) {
        boolean flag = validate(userId);
        if (flag) {
            String result = searcher.doSearch(userId, keyword);
            log(userId);
            return result;
        } else return null;
    }

    public boolean validate(String userId) {
        validator = new AccessValidator();
        return validator.validate(userId);
    }

    public void log(String userId) {
        logger = new Logger();
        logger.log(userId);
    }
}
