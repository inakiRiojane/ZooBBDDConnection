package es.elorrietaErrekamari.curso.bbdd.pojo;

public class Especie {

	private Familia familia = null;

	private String nombreVulgar = null;
	private String nombreCientifico = null;
	private boolean extincion = false;
	private String animal = null;
	private int idFamilia=0;

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}



	public String getNombreVulgar() {
		return nombreVulgar;
	}

	public void setNombreVulgar(String nombreVulgar) {
		this.nombreVulgar = nombreVulgar;
	}

	public String getNombreCientifico() {
		return nombreCientifico;
	}

	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}

	public boolean isExtincion() {
		return extincion;
	}

	public void setExtincion(boolean extincion) {
		this.extincion = extincion;
	}

	public int getIdFamilia() {
		return idFamilia;
	}

	public void setIdFamilia(int idFamilia) {
		this.idFamilia = idFamilia;
	}

}
