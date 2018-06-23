package ch.adesso.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("helloWorld")
public class RestEndpoint {

    @GET
    public String helloWorld(){
        return "Hello World";
    }
}
