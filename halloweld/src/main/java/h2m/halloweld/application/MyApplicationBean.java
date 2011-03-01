package h2m.halloweld.application;

import org.jboss.weld.environment.se.events.ContainerInitialized;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

/**
 * Created by IntelliJ IDEA.
 * User: mhaebich
 * Date: 28.02.11
 * Time: 22:43
 * To change this template use File | Settings | File Templates.
 */
public class MyApplicationBean {
    @Inject
    ServiceConsumer serviceConsumer;

    public void startOnWeldStart(@Observes ContainerInitialized event) {
        serviceConsumer.consume("Weld");
    }

    public void start(@Observes MyEvent event) {
        serviceConsumer.consume(event.getName());
    }

}
