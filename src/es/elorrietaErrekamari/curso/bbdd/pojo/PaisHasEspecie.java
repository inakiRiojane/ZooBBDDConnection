package es.elorrietaErrekamari.curso.bbdd.pojo;

import java.util.ArrayList;

public class PaisHasEspecie {

	private int idPais = 0;
	private int idEspecie = 0;
	
	private ArrayList<Pais>pais=null;
	private ArrayList<Especie>especie=null;

	public int getIdPais() {
		return idPais;
	}

	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}

	public int getIdEspecie() {
		return idEspecie;
	}

	public void setIdEspecie(int idEspecie) {
		this.idEspecie = idEspecie;
	}

}
