package filter;

/**
 * <b>Description:</b><br>
 *
 * @author Abe
 * @version 1.0
 * <br><b>Date:</b> 2021/7/11 0:55
 */
@FunctionalInterface
public interface BodyFilter {

    String filter(String body, FilterChain chain, int index);

}
