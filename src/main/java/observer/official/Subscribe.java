package observer.official;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Abe on 10/11/2018.
 */
public class Subscribe implements Observer {

    private final String name;

    public Subscribe(String name, Observable o) {
        this.name = name;
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + " 收到通知: " + arg);
    }
}
