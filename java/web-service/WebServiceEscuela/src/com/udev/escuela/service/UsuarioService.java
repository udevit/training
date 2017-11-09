package com.udev.escuela.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.udev.escuela.modelo.Usuario;

@Path("UsuarioService")
public class UsuarioService {
	
	@GET
	@Path("/usuarios/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response obtieneCliente(@PathParam("id") int id){
		if(id == 1){
			return Response.ok(new Usuario(2, "Gary", "Admin")).build();
		}
		return Response.status(Status.NOT_FOUND).build();
	}
	
}


