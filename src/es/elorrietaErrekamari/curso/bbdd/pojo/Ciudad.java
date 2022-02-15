package es.elorrietaErrekamari.curso.bbdd.pojo;

import java.util.ArrayList;

public class Ciudad {
	
	private Pais pais=null;

	private int idCiudad = 0;
	private String nombre = null;
	private int id_pais=0;
	
	private ArrayList<Zoo>zoo=null;
	

	public ArrayList<Zoo> getZoo() {
		return zoo;
	}

	public void setZoo(ArrayList<Zoo> zoo) {
		this.zoo = zoo;
	}

	public int getId_pais() {
		return id_pais;
	}

	public void setId_pais(int id_pais) {
		this.id_pais = id_pais;
	}

	public int getIdCiudad() {
		return idCiudad;
	}

	public void setIdCiudad(int id_ciudad) {
		this.idCiudad = id_ciudad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
