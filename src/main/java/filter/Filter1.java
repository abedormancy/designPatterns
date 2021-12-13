package filter;

public class Filter1 implements BodyFilter {

    @Override
    public String filter(String body, FilterChain chain, int index) {
        // 注意回调FilterChain的doFilter方法，让FilterChain继续执行下一个Filter
        return chain.doFilter(body + "filter1", index);
    }
}