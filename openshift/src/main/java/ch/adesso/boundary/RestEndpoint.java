package ch.adesso.boundary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("helloworld")
public class RestEndpoint {
    static final Logger LOG = LoggerFactory.getLogger(RestEndpoint.class);

    @GET
    public String helloWorld(){
        LOG.debug("Calling helloWorld endpoint");
        return "Hello World";
    }
}
