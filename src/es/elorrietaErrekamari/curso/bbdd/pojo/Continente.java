package es.elorrietaErrekamari.curso.bbdd.pojo;

import java.util.ArrayList;

public class Continente {

	private int idContinente = 0;
	private String nombre = null;
	
	private ArrayList<Pais>pais=null;

	public ArrayList<Pais> getPais() {
		return pais;
	}

	public void setPais(ArrayList<Pais> pais) {
		this.pais = pais;
	}

	public int getIdContinente() {
		return idContinente;
	}

	public void setIdContinente(int idContinente) {
		this.idContinente = idContinente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
