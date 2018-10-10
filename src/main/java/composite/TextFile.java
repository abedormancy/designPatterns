package composite;

/**
 * Created by abedormancy@gmail.com on 2018/3/15.
 * 文本文件 - 充当 Leaf 叶子构件
 */
public class TextFile extends AbstractFile {

    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("对文本文件 '" + name + "' 进行杀毒...");
    }
}
