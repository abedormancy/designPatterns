package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abedormancy@gmail.com on 2018/3/15.
 * 文件夹类 - 充当 Composite 容器构件
 */
public class Folder extends AbstractFile {

    private final String name;
    private final List<AbstractFile> fileList = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        fileList.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    @Override
    public AbstractFile getChild(int index) {
        return fileList.get(index);
    }

    @Override
    public void killVirus() {
        System.out.println("对文件夹 '" + name + "' 进行扫描 >>");
        for (AbstractFile file : fileList) {
            file.killVirus();
        }
    }
}
