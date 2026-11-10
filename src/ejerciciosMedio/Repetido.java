package ejerciciosMedio;

import java.util.Scanner;

public class Repetido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dame una cadena: ");
		String cadena = sc.nextLine();
		boolean caracter = false;
		
		for (int i=0; i<cadena.length(); i++) {
			if (cadena.indexOf(cadena.charAt(i)) < i && !caracter) {
				System.out.print(cadena.charAt(i) + " (posición " + i + ")");
				caracter = true;
			} 
		}
		
		if (!caracter) {
			System.out.print("No se repite ningún carácter");
		}
		
		sc.close();
	}

}
