package decorator;

/**
 * Created by abedormancy@gmail.com on 2018/3/12.
 */
public interface GenericRepository<T> {

    void save(T o);

    void update(T o);

}
