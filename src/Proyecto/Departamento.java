package Proyecto;

public class Departamento {
	private int claved;private String nom;private double comision;
	public Departamento()
	{
	}
	public Departamento(int claved, String nom, double comision) {
		this.claved = claved;
		this.nom = nom;
		this.comision = comision;
	}


	public int getClaved() {
		return claved;
	}


	public void setClaved(int claved) {
		this.claved = claved;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public double getComision() {
		return comision;
	}


	public void setComision(double comision) {
		this.comision = comision;
	}
	@Override
	public String toString() {
		return "Departamento [Clave de departamento=" + claved + ", Nombre=" + nom + ", Porcentaje de Comision=" + comision + "]";
	}
	
	

}
