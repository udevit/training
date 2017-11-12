package com.udev.escuela.service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import com.udev.escuela.modelo.Usuario;

public class RestClient {

	static {
	    //for localhost testing only
	    javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(
	    new javax.net.ssl.HostnameVerifier(){

	        public boolean verify(String hostname,
	                javax.net.ssl.SSLSession sslSession) {
	            if (hostname.equals("localhost")) {
	                return true;
	            }
	            return false;
	        }
	    });
	}
	
	public static void main(String[] args) {
		
		Client client = ClientBuilder.newClient();
		
		WebTarget webTarget = client.target("https://localhost:8443/" 
			+ "WebServiceEscuelaSSL/rest/UsuarioService/usuarios/1");
			
		Invocation.Builder invocationBuilder 
		  = webTarget.request(MediaType.APPLICATION_JSON);
		
		Usuario usuario = invocationBuilder.get(Usuario.class);
		
		System.out.println(usuario);
		
	}

}
