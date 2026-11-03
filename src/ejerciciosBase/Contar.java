package ejerciciosBase;

import java.util.Scanner;

public class Contar {
	
	public static int contar(String s, char c) {
		int cont = 0;
		
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i) == c) {
				cont++;
			}
		}
		
		return cont;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dame una frase: ");
		String frase = sc.nextLine();
		System.out.print("Dame un carácter: ");
		char caracter = sc.nextLine().charAt(0);
		
		System.out.print("El caracter aparece " + contar(frase, caracter) + " veces");
		
		sc.close();
	}

}
