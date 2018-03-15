package decorator;

/**
 * Created by abedormancy@gmail.com on 2018/3/12.
 */
public class GenericRepositoryHibernate<T> implements GenericRepository<T> {

    @Override
    public void save(T o) {
        System.out.println("save " + o);
    }

    @Override
    public void update(T o) {
        System.out.println("update " + o);
    }
}
