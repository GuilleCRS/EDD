package Proyecto;

public class Vendedor 
{
	private int clave;private String nombre,departamento;private double idv;private double comision;
	


	public Vendedor() {
		
	}
	public Vendedor(int clave, String nombre, String departamento, double idv) {
		this.clave = clave;
		this.nombre = nombre;
		this.departamento = departamento;
		this.idv = idv;
		
	}

	public Vendedor(int clave, String nombre, String departamento) {
		
		this.clave = clave;
		this.nombre = nombre;
		this.departamento = departamento;
	}
	public int getClave() {
		return clave;
	}


	public double getComision() {
		return comision;
	}
	public void setComision(double comision) {
		this.comision = comision;
	}
	public void setClave(int clave) {
		this.clave = clave;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	public double getIdv() {
		return idv;
	}


	public void setIdv(double idv) {
		this.idv = this.idv+idv;
	}
	@Override
	public String toString() {
		return "Vendedor [Clave del empleado: " + clave + ", Nombre: " + nombre + ", Departamento: " + departamento + ", Importe de ventas: " + idv
				+ ", Comision: "+comision +"]";
	}
	
	

}