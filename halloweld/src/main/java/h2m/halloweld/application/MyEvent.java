package h2m.halloweld.application;

/**
 * Created by IntelliJ IDEA.
 * User: mhaebich
 * Date: 01.03.11
 * Time: 00:23
 * To change this template use File | Settings | File Templates.
 */
public class MyEvent {
    private String name;

    public MyEvent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
