package com.manuel.tecsup.productosapi.models;

public class Historia {
	private Integer id;
	private String imagen;
	private String nombre;
	private String descripcion;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
		return "Historia [id=" + id + ", imagen=" + imagen + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ "]";
	}
	
	

}
