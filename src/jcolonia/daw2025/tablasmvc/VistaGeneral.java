package jcolonia.daw2025.tablasmvc;

import java.util.Scanner;

/**
 * Clase de utilidad para mostrar información y recibir datos del usuario
 * en consola. 
 * Permite mostrar mensajes de texto, títulos, avisos, pedir números o
 * confirmaciones, y realizar pausas. 
 * Se puede considerar como la "vista general" de la aplicación de consola.
 */
public class VistaGeneral {

    /** Scanner para leer datos de entrada del usuario */
    private static Scanner scEntrada = new Scanner(System.in);

    /**
     * Muestra un mensaje de texto normal en consola.
     *
     * @param texto Texto que se desea mostrar
     */
    public static void mostrarTexto(String texto) {
        System.out.println(texto);
    }

    /**
     * Muestra un mensaje de aviso en rojo.
     *
     * @param texto Texto del aviso que se desea mostrar
     */
    public static void mostrarAviso(String texto) {
        System.out.println("\u001B[31mAVISO: " + texto + "\u001B[0m");
    }

    /**
     * Muestra un título principal en consola (formato grande).
     *
     * @param texto Texto del título principal
     */
    public static void mostrarTitulo1(String texto) {
        System.out.println("\n=== " + texto.toUpperCase() + " ===");
    }

    /**
     * Muestra un subtítulo en consola (formato más pequeño).
     *
     * @param texto Texto del subtítulo
     */
    public static void mostrarTitulo2(String texto) {
        System.out.println("\n-- " + texto + " --");
    }

    /**
     * Solicita al usuario que introduzca un número entero.
     *
     * @param texto Mensaje que se mostrará para pedir el número
     * @return Número entero introducido por el usuario
     */
    public static int pedirNúmero(String texto) {
        System.out.print(texto + ": ");
        return scEntrada.nextInt();
    }

    /**
     * Pausa la ejecución del programa hasta que el usuario pulse ENTER.
     *
     * @param texto Mensaje que se mostrará para indicar la pausa
     */
    public static void pausa(String texto) {
        System.out.println(texto);
        scEntrada.nextLine(); // limpiar buffer
        scEntrada.nextLine(); // espera ENTER
    }

    /**
     * Solicita al usuario una respuesta de sí o no.
     *
     * @param texto Mensaje que se mostrará al usuario
     * @return true si el usuario responde "s" o "si" (case insensitive), false en otro caso
     */
    public static boolean pedirInformación(String texto) {
        System.out.print(texto + " (s/n): ");
        String respuesta = scEntrada.next().toLowerCase();
        return respuesta.equals("s") || respuesta.equals("si");
    }

    /**
     * Devuelve el Scanner de entrada para poder usarlo directamente
     * si se necesita lectura más avanzada.
     *
     * @return Scanner que lee desde la entrada estándar
     */
    public static Scanner getScEntrada() {
        return scEntrada;
    }
}