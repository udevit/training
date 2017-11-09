package com.udev.escuela.service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.udev.escuela.modelo.Usuario;

public class RestClient {

	public static void main(String[] args) {
		
		Client client = ClientBuilder.newClient();
		
		WebTarget webTarget = client.target("http://localhost:8080/" 
			+ "WebServiceEscuela/rest/UsuarioService/usuarios/1");
		
		Invocation.Builder invocationBuilder 
		  = webTarget.request(MediaType.APPLICATION_JSON);
		
		Usuario usuario = invocationBuilder.get(Usuario.class);
		
		Usuario entity = new Usuario(2, "Maria", "Invitado");
		Response response = invocationBuilder.post(
			Entity.entity(entity, MediaType.APPLICATION_JSON));
		
		System.out.println(usuario);
		System.out.println(response);
		
	}

}
