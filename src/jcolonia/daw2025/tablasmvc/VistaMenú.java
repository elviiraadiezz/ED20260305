package jcolonia.daw2025.tablasmvc;

import java.util.Scanner;

public class VistaMenú {

	private String titulo;
	private String[] opciones;
	private Scanner scEntrada;

	public VistaMenú(String titulo, String[] opciones) {
		this.titulo = titulo;
		this.opciones = opciones;
		scEntrada = new Scanner(System.in);
	}

	public void mostrarTitulo() {
		System.out.println("\n=== " + titulo + " ===");
	}

	public void mostrarOpciones() {

		mostrarTitulo();

		for (int i = 0; i < opciones.length; i++) {
			System.out.println((i + 1) + ". " + opciones[i]);
		}

		System.out.println("0. Salir");
	}

	public int pedirOpción() {
		System.out.print("Elija una opción: ");
		return scEntrada.nextInt();
	}

	public void mostrarTexto(String texto) {
		System.out.println(texto);
	}
}