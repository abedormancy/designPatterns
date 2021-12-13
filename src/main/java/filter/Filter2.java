package filter;

public class Filter2 implements BodyFilter {

    @Override
    public String filter(String body, FilterChain chain, int index) {
        return chain.doFilter(body + "filter2", index);
    }

}