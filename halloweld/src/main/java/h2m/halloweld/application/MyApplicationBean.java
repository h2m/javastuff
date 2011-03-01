package h2m.halloweld.application;

import org.jboss.weld.environment.se.events.ContainerInitialized;

import javax.enterprise.event.Observes;
import javax.inject.Inject;

/**
 * Created by IntelliJ IDEA.
 * User: h2m
 * Date: 28.02.11
 * Time: 22:43
 * To change this template use File | Settings | File Templates.
 */
public class MyApplicationBean {
    @Inject
    ServiceConsumer serviceConsumer;

    @Inject
    ServiceEventSender serviceEventSender;

    public void startOnWeldStart(@Observes ContainerInitialized event) {
        serviceConsumer.consume("Weld");
        serviceEventSender.consume("Weld");
    }

    public void start() {
        serviceConsumer.consume("ByStartMethod");
        serviceEventSender.consume("ByStartMethod");
    }

}
