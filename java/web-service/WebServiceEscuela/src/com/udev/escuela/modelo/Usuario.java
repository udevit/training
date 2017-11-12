package com.udev.escuela.modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nombre",
    "role",
    "id"
})
@XmlRootElement(name = "Usuario")
public class Usuario {

	@XmlElement(name="noControl")
    private int id;
    @XmlElement(name="nombre")
    private String nombre;
    @XmlElement(name="puesto")
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
