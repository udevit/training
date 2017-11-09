package com.udev.escuela.modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "nombre",
    "role",
})
@XmlRootElement(name = "Usuario")
public class Usuario {

	@XmlElement(required = true)
    private int id;
    @XmlElement(required = true)
    private String nombre;
    @XmlElement(required = true)
    private String role;
    
    public Usuario(){
    	
    }
    
    public Usuario(int id, String nombre, String role){
    	this.id = id;
    	this.nombre = nombre;
    	this.role = role;
    }

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}
