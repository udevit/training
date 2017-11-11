package com.udev.escuela.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "usuario"
})
@XmlRootElement(name = "UsuarioList")
public class Usuarios {
	@XmlElement(name = "Usuario")
	private List<Usuario> usuario;

	public List<Usuario> getUsuario() {
		if(usuario == null)
			usuario = new ArrayList<>();
		return usuario;
	}

	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}
}
