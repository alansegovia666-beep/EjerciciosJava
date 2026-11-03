package ejerciciosBase;

import java.util.Scanner;

public class Iniciales {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dame un nombre: ");
		String nombre = sc.nextLine();
		System.out.print("Dame un apellido: ");
		String apellido = sc.nextLine();
		
		System.out.println(nombre.toUpperCase().charAt(0) + "." + apellido.toUpperCase().charAt(0));
		
		System.out.print("Dame un nombre completo: ");
		String completo = sc.nextLine();
		
		System.out.print(completo.toUpperCase().charAt(0));
		
		for (int i=0; i<completo.length(); i++) {
			if (completo.charAt(i) == ' ') {
				System.out.print("." + completo.toUpperCase().charAt(i + 1));
			}
		}
		
		sc.close();
	}

}
