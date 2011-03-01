package h2m.halloweld;

import h2m.halloweld.application.MyApplicationBean;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/**
 * Created by IntelliJ IDEA.
 * User: h2m
 * Date: 28.02.11
 * Time: 22:42
 * To change this template use File | Settings | File Templates.
 */
public class Runner {
    public static void main(String[] args) {

        Weld weld = new Weld();
        WeldContainer weldContainer = weld.initialize();


        MyApplicationBean mab = weldContainer.instance().select(MyApplicationBean.class).get();
        mab.start();

        weld.shutdown();

    }
}
