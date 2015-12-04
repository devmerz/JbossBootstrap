/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jboss.as.quickstarts.rshelloworld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author devmerz
 */

@Path("/modulo")
public class ElmerService {
    
    @GET
    @Path("/{param}")
    public Response getName(@PathParam("param")String msg){
        return Response.status(200).entity(msg+" :D").build();
    }
}
