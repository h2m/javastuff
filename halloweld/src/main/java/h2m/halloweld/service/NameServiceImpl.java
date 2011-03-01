package h2m.halloweld.service;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: h2m
 * Date: 28.02.11
 * Time: 22:25
 * To change this template use File | Settings | File Templates.
 */
public class NameServiceImpl implements NameService {
    @Inject
    Logger logger;

    public void sayMyName(String name) {
        logger.info("My name is " + name);
        System.out.println("My name is " + name);
    }
}
