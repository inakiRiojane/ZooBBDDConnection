package es.elorrietaErrekamari.curso.bbdd.pojo;

import java.util.ArrayList;

public class Familia {

	private ArrayList<Especie> especie = null;
	private int idFamilia = 0;
	private String nombre = null;

	public int getIdFamilia() {
		return idFamilia;
	}

	public void setIdFamilia(int idFamilia) {
		this.idFamilia = idFamilia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
