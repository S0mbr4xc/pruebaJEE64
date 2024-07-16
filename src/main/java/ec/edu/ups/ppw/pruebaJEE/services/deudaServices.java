package ec.edu.ups.ppw.pruebaJEE.services;

import java.util.List;

import ec.edu.ups.ppw.pruebaJEE.bussines.gestionDeudas;

import ec.edu.ups.ppw.pruebaJEE.model.deuda;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/deuda")
public class deudaServices {
	@Inject
	private gestionDeudas gd;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{{cliente}}")
	public List<deuda> list(@PathParam("cliente") String cliente){
		return gd.getAll(cliente);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<deuda> list(){
		return gd.getAlll();
	}
}
