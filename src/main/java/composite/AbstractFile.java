package composite;

/**
 * Created by abedormancy@gmail.com on 2018/3/15.
 * 抽象文件夹 - 充当 Component 构件
 */
public abstract class AbstractFile {

    public void add(AbstractFile file) {
        throw new UnsupportedOperationException();
    }

    public void remove(AbstractFile file) {
        throw new UnsupportedOperationException();
    }

    public AbstractFile getChild(int index) {
        throw new UnsupportedOperationException();
    }

    public abstract void killVirus();

}
