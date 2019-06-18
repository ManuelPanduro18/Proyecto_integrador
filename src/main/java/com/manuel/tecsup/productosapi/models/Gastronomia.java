package com.manuel.tecsup.productosapi.models;

public class Gastronomia {
	private Integer id;
	private String tipo;
	private String imagen;
	private String nombre;
	private String descripcion;
	public Gastronomia() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
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
		return "Gastronomia [id=" + id + ", tipo=" + tipo + ", imagen=" + imagen + ", nombre=" + nombre
				+ ", descripcion=" + descripcion + "]";
	}
	
	

}
