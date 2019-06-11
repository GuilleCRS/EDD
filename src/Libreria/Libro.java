package Libreria;


public class Libro 
{
	int existencia; 
	String nombre,descripcion,autor,editorial;
	public Libro(int existencia, String nombre, String descripcion, String autor, String editorial) {
		this.existencia = existencia;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.autor = autor;
		this.editorial = editorial;
		
	}
	public Libro() {
		
	}
	
	public int getExistencia() {
		return existencia;
	}
	public void setExistencia(int existencia) {
		this.existencia = existencia;
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
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	@Override
	public String toString() {
		return " Nombre=" + nombre + ", Descripcion="+ descripcion + 
				", Autor=" + autor + ", Editorial=" + editorial +", Existencia=" + existencia
				+"]";
	}
	
	
	

}
