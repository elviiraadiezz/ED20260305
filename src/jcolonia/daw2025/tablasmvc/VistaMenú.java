package jcolonia.daw2025.tablasmvc;

import java.util.Scanner;

/**
 * Clase que representa un menú de opciones en consola con colores.
 * Permite mostrar un título, una lista de opciones y pedir la selección del usuario.
 * Los colores se añaden mediante códigos ANSI para mejorar la interfaz.
 */
public class VistaMenú {

    /** Título del menú */
    private String titulo;

    /** Lista de opciones del menú */
    private String[] opciones;

    /** Scanner para leer la entrada del usuario */
    private Scanner scEntrada;

    /**
     * Constructor de la clase VistaMenú.
     *
     * @param titulo  Título que se mostrará en la parte superior del menú
     * @param opciones Array con las opciones que el menú ofrecerá al usuario
     */
    public VistaMenú(String titulo, String[] opciones) {
        this.titulo = titulo;
        this.opciones = opciones;
        scEntrada = new Scanner(System.in);
    }

    /**
     * Muestra el título del menú en azul.
     */
    public void mostrarTitulo() {
        System.out.println("\u001B[34m=== " + titulo + " ===\u001B[0m");
    }

    /**
     * Muestra todas las opciones disponibles del menú numeradas en verde.
     * Añade automáticamente la opción "0. Salir".
     */
    public void mostrarOpciones() {
        mostrarTitulo();
        for (int i = 0; i < opciones.length; i++) {
            System.out.println("\u001B[32m" + (i + 1) + ". " + opciones[i] + "\u001B[0m");
        }
        System.out.println("\u001B[32m0. Salir\u001B[0m");
    }

    /**
     * Solicita al usuario que introduzca una opción y devuelve el número elegido.
     *
     * @return Entero correspondiente a la opción seleccionada por el usuario
     */
    public int pedirOpción() {
        System.out.print("\u001B[34mElija una opción: \u001B[0m");
        return scEntrada.nextInt();
    }

    /**
     * Muestra un mensaje de texto simple en la consola.
     *
     * @param texto Texto que se desea mostrar
     */
    public void mostrarTexto(String texto) {
        System.out.println(texto);
    }

    /**
     * Muestra un mensaje de aviso en rojo.
     *
     * @param texto Texto del aviso que se desea mostrar
     */
    public void mostrarAviso(String texto) {
        System.out.println("\u001B[31mAVISO: " + texto + "\u001B[0m");
    }
}