package proxy;

/**
 * Created by abedormancy@gmail.com on 2018/3/14.
 */
public class RealSearcher implements Searcher {
    @Override
    public String doSearch(String userId, String keyword) {
        System.out.println("user " + userId + " used keyword '"+keyword+"' searching...");
        return "result >> " + keyword;
    }
}
