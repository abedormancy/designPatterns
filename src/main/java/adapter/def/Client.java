package adapter.def;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by abedormancy@gmail.com on 2018/3/15.
 * 单接口适配器模式 [接口适配器模式或缺省适配器模式]
 * desc：当只实现一个接口的某一个方法时，可设计一个抽象类实现该接口，并为接口中每个方法提供一个默认实现（空方法），那么该抽象类的子类可
 * 以选择性的覆盖父类中的某些方法类实现需求，它适用于不想使用一个接口中的所有方法的情况
 *
 * 具体例子直接看 WindowListener,WindowAdapter
 * 缺省适配器一般含有 3 个角色
 * 1.ServiceInterface（适配者接口）
 * 2.AbstractServiceClass（缺省适配器类）
 * 3.ConcreteServiceClass（具体业务类）
 */
public class Client {

    public static void main(String[] args) {
        JFrame window = new JFrame("一个窗口");
        window.setBounds(200, 200, 400, 200);
        window.setVisible(true);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // 如果直接实现 WindowListener ...
        window.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("监听个 opend 事件咋出现这么多我不想监听的方法呢...");
            }

            @Override
            public void windowClosing(WindowEvent e) {
            }

            @Override
            public void windowClosed(WindowEvent e) {
            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });

        // 通过缺省适配器模式，可以通过继承此适配器模式只覆盖我们需要重写的方法即可!
        window.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("我只想监听 opened 事件...");
            }
        });
    }
}
