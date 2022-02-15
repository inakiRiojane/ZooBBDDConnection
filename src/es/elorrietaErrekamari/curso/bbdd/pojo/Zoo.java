package es.elorrietaErrekamari.curso.bbdd.pojo;

import java.util.ArrayList;

public class Zoo {

	private Ciudad ciudad = null;
	private ArrayList<Billete> billete = null;

	private int idZoo = 0;
	private String nombre = null;
	private int tamaño = 0;
	private float presupuesto = 0;
	private float pvpEntrada = 0;
	private int idCiudad = 0;

	public float getPvpEntrada() {
		return pvpEntrada;
	}

	public void setPvpEntrada(float pvpEntrada) {
		this.pvpEntrada = pvpEntrada;
	}

	public int getIdCiudad() {
		return idCiudad;
	}

	public void setIdCiudad(int idCiudad) {
		this.idCiudad = idCiudad;
	}

	public int getIdZoo() {
		return idZoo;
	}

	public void setIdZoo(int idZoo) {
		this.idZoo = idZoo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public float getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(float presupuesto) {
		this.presupuesto = presupuesto;
	}

}
