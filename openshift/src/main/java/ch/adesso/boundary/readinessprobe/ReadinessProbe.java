package ch.adesso.boundary.readinessprobe;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("readinessprobe")
public class ReadinessProbe {
    private final Logger LOGGER= LogManager.getLogger(ReadinessProbe.class);

    @GET
    public String readinessprobe(){
        LOGGER.debug("Calling Readinessprobe");
        return "Application Ready";
    }
}
