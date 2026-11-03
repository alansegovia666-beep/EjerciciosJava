package ejerciciosBase;

import java.util.Scanner;

public class Mayuscula {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dame una frase: ");
		String frase = sc.nextLine();
		
		for (int i=frase.length()-1; i>=0; i--) {
			System.out.print(frase.toUpperCase().charAt(i));
		}
		
		sc.close();
	}

}
