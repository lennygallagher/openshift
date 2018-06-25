package ch.adesso.boundary;

import ch.adesso.control.Entity;
import ch.adesso.control.EntityDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("helloworld")
public class RestEndpoint {
    private Logger logger = LogManager.getLogger(RestEndpoint.class);

    @Inject
    EntityDao entityDao;

    @GET
    public String helloWorld(){
        logger.debug("Calling helloWorld endpoint");

        Entity entity = new Entity();
        entity.setName("name");

        entityDao.save(entity);

        return "Hello World";
    }
}
