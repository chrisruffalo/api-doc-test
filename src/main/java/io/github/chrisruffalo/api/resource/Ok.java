package io.github.chrisruffalo.api.resource;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")
public class Ok {

    @GET
    public String ok(){
        return "ok";
    }

}