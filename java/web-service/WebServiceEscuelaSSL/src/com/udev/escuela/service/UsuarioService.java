package com.udev.escuela.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.udev.escuela.modelo.Usuario;
import com.udev.escuela.modelo.Usuarios;

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
	
	@GET
	@Path("/usuarios")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Usuarios obtieneClientes(){
		Usuarios usuarios = new Usuarios();
		usuarios.getUsuario().add(new Usuario(1, "Gary", "Admin"));
		usuarios.getUsuario().add(new Usuario(2, "Pepe", "Invitado"));
		usuarios.getUsuario().add(new Usuario(3, "Juan", "Invitado"));
		usuarios.getUsuario().add(new Usuario(4, "Carlos", "Invitado"));
		usuarios.getUsuario().add(new Usuario(5, "Maria", "Invitado"));
		return usuarios;
	}
	
}