package es.elorrietaErrekamari.curso.bbdd.pojo;

import java.util.ArrayList;

public class Pais {
	
	private Continente continente=null;
	private ArrayList<Ciudad>ciudad=null;

	private int idPais = 0;
	private String nombre = null;
	private int idContinente = 0;
	
	
	

	public int getIdPais() {
		return idPais;
	}

	public void setIdPais(int id_pais) {
		this.idPais = id_pais;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdContinente() {
		return idContinente;
	}

	public void setIdContinente(int id_continente) {
		this.idContinente = id_continente;
	}

}
