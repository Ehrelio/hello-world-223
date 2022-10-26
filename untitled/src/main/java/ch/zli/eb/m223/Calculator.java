package ch.zli.eb.m223;

import javax.enterprise.inject.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/calculator")
public class Calculator {
    
    @GET()
    @Path("/add/{number1}/{number2}")
    public String add(@PathParam("number1") int number1, @PathParam("number2") int number2){
        int result = number1 + number2;
        return result + "";
    }

}
