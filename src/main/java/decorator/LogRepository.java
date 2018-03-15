package decorator;

import java.util.Date;

/**
 * Created by abedormancy@gmail.com on 2018/3/12.
 */
public class LogRepository<T> implements GenericRepository<T> {

    private GenericRepository repository;

    public LogRepository(GenericRepository repository) {
        this.repository = repository;
    }


    @Override
    public void save(T o) {
        System.out.println("[save log] " + new Date());
        repository.save(o);
    }

    @Override
    public void update(T o) {
        System.out.println("[update log] " + new Date());
        repository.update(o);
    }
}
