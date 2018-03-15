package composite;

/**
 * Created by abedormancy@gmail.com on 2018/3/15.
 */
public abstract class AbstractFile {

    public abstract void add(AbstractFile file);
    public abstract void remove(AbstractFile file);
    public abstract AbstractFile getChild(int index);
    public abstract void killVirus();

}
