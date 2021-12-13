package memento;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Abe on 10/21/2018.
 * 玩家备忘录管理类 ( caretaker )
 */
public class MementoCaretaker {

    private final Map<Integer, PlayerMemento> mementoList = new HashMap<>();

    public void save(int index, Player player) {
        if (player.getHp() < 1) {
            throw new RuntimeException("都挂了，还保存个球啊!");
        }
        String info = (mementoList.get(index) == null ? "保存" : "覆盖") + "了存档 " + index;
        PlayerMemento memento = new PlayerMemento(player.getName(), player.getHp(), player.getProgress());
        mementoList.put(index, memento);
        System.out.println(info);
    }

    public void restore(int index, Player player) {
        PlayerMemento memento = mementoList.get(index);
        player.setName(memento.getName());
        player.setHp(memento.getHp());
        player.setProgress(memento.getProgress());
        System.out.println("恢复了存档 " + index);
    }
}
