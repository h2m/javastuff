package h2m.halloweld;

import h2m.halloweld.application.MyApplicationBean;
import h2m.halloweld.application.MyEvent;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/**
 * Created by IntelliJ IDEA.
 * User: mhaebich
 * Date: 28.02.11
 * Time: 22:42
 * To change this template use File | Settings | File Templates.
 */
public class Runner {
    public static void main(String[] args) {

        Weld weld = new Weld();
        WeldContainer weldContainer = weld.initialize();
        MyEvent horst = new MyEvent("Horst");

        boolean byEvent = false;
        if (byEvent) {
            weldContainer.event().select(MyEvent.class).fire(horst);
        } else {
            MyApplicationBean mab = weldContainer.instance().select(MyApplicationBean.class).get();
            mab.start(horst);
        }
        weld.shutdown();

    }
}
