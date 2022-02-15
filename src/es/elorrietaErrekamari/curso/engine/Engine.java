package es.elorrietaErrekamari.curso.engine;

import es.elorrietaErrekamari.curso.bbdd.gestores.GestorCliente;
import es.elorrietaErrekamari.curso.bbdd.pojo.Cliente;
import es.elorrietaErrekamari.curso.menu.Menu;

public class Engine {

	private Menu menu = null;
	private GestorCliente gestorCliente=null;
	
	public Engine() {
		
		gestorCliente=new GestorCliente();
		menu = new Menu();

	}

	public void doStartEngine() {
		int menuOption = 0;

		do {
			menuOption = menu.opcionMenuInicialCliente();
			ejecutaropcionMenuInicialCliente(menuOption);
		} while (menuOption != 3);
	}

	private void ejecutaropcionMenuInicialCliente(int menuOption) {

		switch (menuOption) {

		case 1:

			registrarCliente();

		case 2:
//gh4ogi4//
		case 3:
			

		}

	}

	private void registrarCliente() {

		Cliente cliente = new Cliente();
		cliente = menu.insertarDatos();
		validarDatos(cliente);

		gestorCliente.insertarCliente(cliente);

	}

	private void validarDatos(Cliente cliente) {

	}

}
