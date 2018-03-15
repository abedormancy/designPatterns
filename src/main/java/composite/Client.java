package composite;

/**
 * Created by abedormancy@gmail.com on 2018/3/15.
 */
public class Client {

    /**
     * 组合模式分为 透明组合模式 和 安全组合模式，本例中展示的是透明组合模式
     * @param args
     */
    public static void main(String[] args) {
        AbstractFile folder = new Folder("父文件夹");

        AbstractFile folder1 = new Folder("图像文件夹");
        AbstractFile folder2 = new Folder("文本文件夹");

        AbstractFile img1 = new ImageFile("图片1");
        AbstractFile img2 = new ImageFile("图片2");

        AbstractFile txt1 = new TextFile("readme1.txt");
        AbstractFile txt2 = new TextFile("readme2.txt");

        folder1.add(img1);
        folder1.add(img2);
        folder2.add(txt1);
        folder2.add(txt2);
        folder.add(folder1);
        folder.add(folder2);

        folder.killVirus();

    }
}
