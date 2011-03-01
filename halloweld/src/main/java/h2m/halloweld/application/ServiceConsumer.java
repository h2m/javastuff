package h2m.halloweld.application;

import h2m.halloweld.service.NameService;
import h2m.halloweld.service.NameServiceImpl;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by IntelliJ IDEA.
 * User: mhaebich
 * Date: 28.02.11
 * Time: 23:04
 * To change this template use File | Settings | File Templates.
 */
@Singleton
public class ServiceConsumer {

    @Inject
    NameService nameService;

    public void consume(String name) {
        nameService.sayMyName(name);
    }
}
