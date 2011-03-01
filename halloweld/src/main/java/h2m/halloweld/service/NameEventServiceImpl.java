package h2m.halloweld.service;

import h2m.halloweld.application.MyEvent;

import javax.enterprise.event.Observes;
import javax.inject.Inject;
import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: h2m
 * Date: 28.02.11
 * Time: 22:25
 * To change this template use File | Settings | File Templates.
 */
public class NameEventServiceImpl  {
    @Inject
    Logger logger;

    public void sayMyName(@Observes MyEvent event) {
        String name = event.getName();
        logger.info("My event name is " + name);
        System.out.println("My event name is " + name);
    }
}
