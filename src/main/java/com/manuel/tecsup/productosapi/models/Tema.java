package com.manuel.tecsup.productosapi.models;


public class Tema{
	private Integer idtema;
	private String imagen;
	private String nombre;
	private String descripcion;
	public Tema() {
		super();
	}
	public Integer getIdtema() {
		return idtema;
	}
	public void setIdtema(Integer idtema) {
		this.idtema = idtema;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Tema [idtema=" + idtema + ", imagen=" + imagen + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ "]";
	}
	
	
	
	
}
