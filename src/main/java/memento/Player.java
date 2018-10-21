package mediator;

/**
 * Created by Abe on 10/21/2018.
 * 玩家类 ( Originator )
 */
public class Player {

    private String name;
    private int hp;
    private int progress;

    public Player(String name, int hp) {
        this.name = name;
        this.hp = hp;
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

    /**
     * 攻略 BOSS
     */
    public void attack(String bossName) {
        progress += 1;
        if (progress > 100) progress = 100;

        StringBuilder sb = new StringBuilder("玩家准备攻击'").append(bossName).append("', ");
        // 扣除血量
        hp -= bossName.length() * 10;
        if (hp > 0) {
            sb.append("经过战斗, 获得胜利。血量剩余: ").append(hp);
        } else {
            sb.append("苦战许久，最终血槽已空，被'").append(bossName).append("'击败");
        }
        System.out.println(sb.toString());
    }

    public void info() {
        System.out.println(hp > 0 ? this.toString() : "胜败乃兵家常事，请大侠重新来过。");
    }

    @Override
    public String toString() {
        return "游戏进度: " + progress + "%, 玩家信息{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }
}
