package proxy;

/**
 * Created by abedormancy@gmail.com on 2018/3/14.
 */
public class Client {

    public static void main(String[] args) {
        Searcher searcher = (Searcher) XMLUtil.getBean();
        searcher.doSearch("abe", "mis");
    }
}
