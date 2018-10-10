package composite;

/**
 * Created by abedormancy@gmail.com on 2018/3/15.
 * 组合模式
 * desc：将对象组合成树型结构来表现部分-整体的层次关系。组合使得客户一致地使用单个对象和组合对象
 *
 * 组合模式含有 3 个角色
 * 1. Component（抽象构件）
 * 2. Leaf（叶子构件）
 * 3. Composite（容器构件）
 *
 * 本例中展示的是透明组合模式，在安全组合模式，抽象构件不声明任何管理成员对象的方法，而是在容器构件中声明并实现。
 */
public class Client {


    public static void main(String[] args) {
        AbstractFile folder = new Folder("base_folder");

        AbstractFile folder1 = new Folder("image_folder");
        AbstractFile folder2 = new Folder("text_folder");

        AbstractFile img1 = new ImageFile("image1.jpg");
        AbstractFile img2 = new ImageFile("image2.png");

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
