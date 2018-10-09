package proxy;

/**
 * Created by abedormancy@gmail.com on 2018/3/14.
 * Subject 抽象主题角色
 */
public interface Searcher {
    String doSearch(String userId, String keyword);
}
