package composite;

/**
 * Created by abedormancy@gmail.com on 2018/3/15.
 * 图片文件 - 充当 Leaf 叶子构件
 */
public class ImageFile extends AbstractFile {

    private final String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("对图像文件 '" + name + "' 进行杀毒...");
    }
}
