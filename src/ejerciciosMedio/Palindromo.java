package ejerciciosMedio;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabraReves = "";
		
		System.out.print("Dame una palabra: ");
		String palabra = sc.nextLine();
		
		for (int i=palabra.length()-1; i>=0; i--) {
			palabraReves += palabra.charAt(i);
		}
		
		if (palabra.equals(palabraReves)) {
			System.out.println("La palabra es un palíndromo");
		} else {
			System.out.println("La palabra no es un palíndromo");
		}
		
		String fraseSimple = "";
		String fraseReves = "";
		
		System.out.print("Dame una frase: ");
		String frase = sc.nextLine();
		
		for (int i=0; i<frase.length(); i++) {
			if (frase.charAt(i) != ' ') {
				fraseSimple += frase.toLowerCase().charAt(i);
			}
		}
		
		for (int i=frase.length()-1; i>=0; i--) {
			if (frase.charAt(i) != ' ') {
				fraseReves += frase.toLowerCase().charAt(i);
			}
		}
		
		if (fraseSimple.equals(fraseReves)) {
			System.out.print("La frase es un palíndromo");
		} else {
			System.out.print("La frase no es un palíndromo");
		}
		
		sc.close();
	}

}
