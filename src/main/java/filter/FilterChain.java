package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>Description:</b><br>
 *
 * @author Abe
 * @version 1.0
 * <br><b>Date:</b> 2021/7/11 0:56
 */
public class FilterChain {

    //规则过滤器列表，实现Filter接口的过滤器将真正执行对事件的处理
    private final List<BodyFilter> filters = new ArrayList<>(8);

    //向责任链中加入过滤器（多个）
    public void addFilters(List<BodyFilter> filters) {
        this.filters.addAll(filters);
    }

    //处理事件（alarm）从FilterChain中获取过滤器，进行处理，处理完成之后过滤器会再调用该方法，
    //继续执行下一个filter.这就需要在每个Filter接口的实现类中最后一句需要回调FilterChain的doFilter方法。
    public String doFilter(String body) {
        return doFilter(body, 0);
    }

    public String doFilter(String body, int index) {
        if (index == filters.size()) {
            return body;
        }
        return filters.get(index).filter(body, this, index + 1);
    }
}
