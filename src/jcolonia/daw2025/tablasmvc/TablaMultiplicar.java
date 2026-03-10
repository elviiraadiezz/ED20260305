package jcolonia.daw2025.tablasmvc;

import java.util.List;

public class TablaMultiplicar { 
	private int numero;
	
	TablaMultiplicar (int numero){	
		this.numero = numero;
	}
	
	public String toString() {
		StringBuffer sbTextoTabla;
		String lineaProducto;
		int producto;
		
		
		sbTextoTabla=new StringBuffer();
		
		for(int i=1;i<=10; i++) {
			producto=numero*i;
			lineaProducto=String.format("%2d × %2d = %3d",numero,i,producto);
			sbTextoTabla.append(lineaProducto);
			sbTextoTabla.append('\n');
		}
		return sbTextoTabla.toString();
	}
	
	public static void main(String[] args) {
		
		TablaMultiplicar tablaDelSiete;
		tablaDelSiete = new TablaMultiplicar(7);
		System.out.print(tablaDelSiete.toString());
	}
		
}

