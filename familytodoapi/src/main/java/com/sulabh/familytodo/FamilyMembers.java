package com.sulabh.familytodo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;


@Path("familymembers")
public class FamilyMembers {

    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response  getIt() {
        List<String> mylist = new ArrayList<>();
        mylist.add("one");
        mylist.add("two");
        mylist.add("three");

        return Response.ok(mylist, MediaType.APPLICATION_JSON).build();
    }
}
