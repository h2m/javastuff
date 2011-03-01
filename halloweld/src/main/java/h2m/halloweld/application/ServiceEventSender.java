package h2m.halloweld.application;

import javax.enterprise.event.Event;
import javax.inject.Inject;

/**
 * Created by IntelliJ IDEA.
 * User: h2m
 * Date: 01.03.11
 * Time: 12:49
 * To change this template use File | Settings | File Templates.
 */
public class ServiceEventSender {

    @Inject
    Event<MyEvent> events;

    public void consume(String name) {
        events.fire(new MyEvent(name + " Event is my middle name"));
        System.out.println("Fired event");
    }
}
