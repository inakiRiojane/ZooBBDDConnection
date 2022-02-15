package es.elorrietaErrekamari.curso.bbdd.pojo;

import java.util.Date;

public class Billete {

	private int idBillete = 0;
	private Date fecha = null;
	private int idZoo = 0;

	private Zoo zoo = null;
	private Cliente cliente=null;
	
	public int getIdBillete() {
		return idBillete;
	}

	public void setIdBillete(int idBillete) {
		this.idBillete = idBillete;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getIdZoo() {
		return idZoo;
	}

	public void setIdZoo(int idZoo) {
		this.idZoo = idZoo;
	}

}
