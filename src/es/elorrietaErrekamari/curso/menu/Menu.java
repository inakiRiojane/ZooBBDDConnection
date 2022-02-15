package es.elorrietaErrekamari.curso.menu;

import java.util.Scanner;

import es.elorrietaErrekamari.curso.bbdd.gestores.GestorCliente;
import es.elorrietaErrekamari.curso.bbdd.pojo.Cliente;

public class Menu {

	private GestorCliente gestor = null;
	private Scanner teclado = null;

	public Menu() {

		teclado = new Scanner(System.in);
		gestor = new GestorCliente();
	}

	private void showMenuInicialAdmin() {

		System.out.println("---- MENU ----");
		System.out.println("---- 1 - GESTION CLIENTES ");
		System.out.println("---- 2 -GESTION ZOOS");
		System.out.println("---- 2 -GESTION ESPECIE");
		System.out.println("---- 3 - SALIR ");
		System.out.println("--------------");
		System.out.println("");
	}

	private void showMenuInicialCliente() {

		System.out.println("---- MENU ----");
		System.out.println("---- 1 - REGISTRO DE CLIENTE ");
		System.out.println("---- 2 - COMPRA DE BILLETES PARA EL ZOO ");
		System.out.println("---- 3 - SALIR ");
		System.out.println("--------------");
		System.out.println("");
	}

	public int opcionMenuInicialCliente() {
		int ret = 0;

		do {

			try {
				showMenuInicialCliente();
				System.out.print("Elija una opcion: ");
				ret = teclado.nextInt();

				if (ret < 1 || ret > 3) {
					System.out.println("");
					System.out.println("Esa opcion no existe");
					System.out.println("");
				}

			} catch (Exception e) {
				System.out.println("");
				System.out.println("Escoja una opcion valida");
				System.out.println("");
				teclado.nextLine();
				ret = -1;
			}

		} while ((ret < 1) || (ret > 3));

		return ret;
	}

	public Cliente insertarDatos() {

		Cliente cliente = new Cliente();

		System.out.println("DNI: ");
		cliente.setDNI(leerOperandoText());
		System.out.println("NOMBRE: ");
		cliente.setNombre(teclado.nextLine());
		System.out.println("APELLIDO UNO: ");
		cliente.setApellidoUno(teclado.nextLine());
		System.out.println("APELLIDO DOS: ");
		cliente.setApellidoDos(teclado.nextLine());
		System.out.println("CONTRASEÑA: ");
		cliente.setContraseña(teclado.nextLine());

		
		return cliente;
	}

	private String leerOperandoText() {
		String ret = null;
		try {
			ret = teclado.nextLine();
		} catch (Exception e) {

			System.out.println("Error");
		}
		return ret;

	}

}
