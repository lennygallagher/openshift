package ch.adesso.boundary.livenessprobe;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("livenessprobe")
public class LivenessProbe {
    private final Logger LOGGER= LogManager.getLogger(LivenessProbe.class);

    @GET
    public String livenessprobe(){
        LOGGER.debug("Calling Livenessprobe");
        return "Application alive";
    }
}
