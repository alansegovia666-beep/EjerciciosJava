package ejerciciosBase;

import java.util.Scanner;

public class Extension {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dame un nombre de fichero: ");
		String fichero = sc.nextLine();
		String extension = "";
		
		int posicion = fichero.lastIndexOf(".");
		
		if (posicion == -1) {
			System.out.println("El fichero no tiene extensión");
			System.out.println("Nombre: " + fichero);
		} else {
			System.out.print("Nombre: ");
			for (int i=0; i<posicion; i++) {
				System.out.print(fichero.charAt(i));
			}
			
			System.out.println();
			
			System.out.print("Extensión: ");
			for (int i=posicion+1; i<fichero.length(); i++) {
				extension += fichero.charAt(i);
			}
			
			System.out.println(extension);
		
			if (extension.equals("java")) {
				System.out.print("El fichero es de código Java");
			} else {
				System.out.print("El fichero no es de código Java");
			}
		}
		
		sc.close();
	}

}
