package h2m.halloweld.application;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Singleton;
import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: h2m
 * Date: 28.02.11
 * Time: 23:20
 * To change this template use File | Settings | File Templates.
 */
public class LoggerFactory {

    @Produces
    Logger createLogger(InjectionPoint injectionPoint) {
        return Logger.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
    }
}
