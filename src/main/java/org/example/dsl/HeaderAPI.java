package org.example.dsl;



import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;


/*@Path(value="/")*/
public interface HeaderAPI {

	@GET
	@Consumes("application/json")
	@Produces("application/json")
	// @Path(value="/{Branchcode}/{Date}")
	/*
	 * @PathParam is a parameter annotation which allows you to map variable URI
	 * path fragments into your method call.
	 * 
	 * It allows to embed variable identification within the URIs of resources
	 */
	public Response headerAPI(@QueryParam ("id") String id);

}