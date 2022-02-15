package es.elorrietaErrekamari.curso.bbdd.gestores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import es.elorrietaErrekamari.curso.bbdd.pojo.Cliente;
import reto2.bbdd.utils.DBUtils;

public class GestorCliente {
	
	public void insertarCliente(Cliente clienteRegistrado) {
		
		Connection connection = null;
		Statement statement = null;
		
		
		Class.forName(Utils.DRIVER);
		connection = DriverManager.getConnection(Utils.URL, Utils.USER, Dtils.PASS);
		statement = connection.createStatement();
		
		
		
		
		
	}
	
	
	

}
