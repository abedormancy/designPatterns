package memento;

/**
 * Created by Abe on 10/21/2018.
 * 玩家备忘录类 ( Memento )
 */
public class PlayerMemento {

    private String name;
    private int hp;
    private int progress;

    public PlayerMemento(String name, int hp, int progress) {
        this.name = name;
        this.hp = hp;
        this.progress = progress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }
}
