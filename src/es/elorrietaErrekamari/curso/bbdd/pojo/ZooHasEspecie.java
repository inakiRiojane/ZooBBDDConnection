package es.elorrietaErrekamari.curso.bbdd.pojo;

import java.util.ArrayList;
import java.util.Date;

public class ZooHasEspecie {
	
	private int id=0;
	private String sexo=null;
	private Date añoNacimiento=null;
	private int id_Zoo=0;
	private int id_Especie=0;
	
	private ArrayList<Zoo>zoo=null;
	private ArrayList<Especie> especie = null;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getAñoNacimiento() {
		return añoNacimiento;
	}

	public void setAñoNacimiento(Date añoNacimiento) {
		this.añoNacimiento = añoNacimiento;
	}

	public int getId_Zoo() {
		return id_Zoo;
	}

	public void setId_Zoo(int id_Zoo) {
		this.id_Zoo = id_Zoo;
	}

	public int getId_Especie() {
		return id_Especie;
	}

	public void setId_Especie(int id_Especie) {
		this.id_Especie = id_Especie;
	}
}

