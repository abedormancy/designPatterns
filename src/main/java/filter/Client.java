package filter;

import java.util.Arrays;

/**
 * <b>Description:</b><br>
 * 功能链
 *
 * @author Abe
 * @version 1.0
 * <br><b>Date:</b> 2021/7/11 0:53
 */
public class Client {

    public static void main(String[] args) {
        FilterChain chain = new FilterChain();
        chain.addFilters(Arrays.asList(new Filter1(), new Filter2()));

        final String value = chain.doFilter("hello world");
        System.out.println(value);

    }
}
