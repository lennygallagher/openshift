package ch.adesso.boundary;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("helloworld")
public class RestEndpoint {
    static final Logger LOGGER= LogManager.getLogger(RestEndpoint.class);

    @GET
    public String helloWorld(){
        LOGGER.debug("Calling helloWorld endpoint");
        return "Hello World";
    }
}
