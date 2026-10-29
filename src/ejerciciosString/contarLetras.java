package ejerciciosString;

import java.util.Scanner;

public class contarLetras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		
		System.out.print("Introduce una palabra: ");
		String palabra = sc.nextLine();
		
		for (int i=0; i<palabra.length(); i++) {
			if (palabra.charAt(i) == 't') {
				cont++;
			}
		}
		
		System.out.println("Hay un total de " + cont + " letras t");
		
		sc.close();
	}

}
