package prototype;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

/**
 * Created by abedormancy@gmail.com on 2018/3/11.
 * 周报 ， 具体原型类 ， 抽象原型类为 Object
 */
public class WeeklyLog implements Cloneable {

    private String name;
    private LocalDate date;
    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public WeeklyLog clone() {
        try {
            return (WeeklyLog) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "----------------------------\n" +
                "日期: " + date.getMonthValue() + "月第" + date.get(ChronoField.ALIGNED_WEEK_OF_MONTH) + "周\n" +
                "姓名: " + name + "\n" +
                "内容: " + content + "\n" +
                "----------------------------\n";
    }
}
