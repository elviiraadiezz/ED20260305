package jcolonia.daw2025.tablasmvc;

import java.util.Scanner;

public class VistaGeneral {

	private static Scanner scEntrada = new Scanner(System.in);

	public static void mostrarTexto(String texto) {
		System.out.println(texto);
	}

	public static void mostrarAviso(String texto) {
		System.out.println("AVISO: " + texto);
	}

	public static void mostrarTitulo1(String texto) {
		System.out.println("\n=== " + texto + " ===");
	}

	public static void mostrarTitulo2(String texto) {
		System.out.println("\n-- " + texto + " --");
	}

	public static int pedirNúmero(String texto) {
		System.out.print(texto + ": ");
		return scEntrada.nextInt();
	}

	public static void pausa(String texto) {
		System.out.println(texto);
		scEntrada.nextLine();
		scEntrada.nextLine();
	}

	public static boolean pedirInformación(String texto) {
		System.out.print(texto + " (s/n): ");
		String respuesta = scEntrada.next().toLowerCase();
		return respuesta.equals("s");
	}

	public static Scanner getScEntrada() {
		return scEntrada;
	}
}