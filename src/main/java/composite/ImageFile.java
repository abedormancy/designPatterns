package composite;

/**
 * Created by abedormancy@gmail.com on 2018/3/15.
 */
public class ImageFile extends AbstractFile {

    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        System.out.println("unsupported");
    }

    @Override
    public void remove(AbstractFile file) {
        System.out.println("unsupported");
    }

    @Override
    public AbstractFile getChild(int index) {
        System.out.println("unsupported");
        return null;
    }

    @Override
    public void killVirus() {
        System.out.println("对图像文件 '"+name+"' 进行杀毒...");
    }
}
