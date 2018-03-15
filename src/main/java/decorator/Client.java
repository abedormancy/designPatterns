package decorator;

/**
 * Created by abedormancy@gmail.com on 2018/3/12.
 */
public class Client {

    public static void main(String[] args) {
        GenericRepository<String> repository = new GenericRepositoryHibernate<>();
        repository.save("hello world!");

        repository = new LogRepository<>(repository);
        repository.save("just wanna ...");
    }
}
