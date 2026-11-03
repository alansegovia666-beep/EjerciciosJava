package ejerciciosBase;

import java.util.Scanner;

public class Vertical {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dame una palabra: ");
		String palabra = sc.nextLine();
		
		for (int i=0; i<palabra.length(); i++) {
			System.out.println(palabra.charAt(i));
		}
		
		System.out.println();
		
		for (int i=palabra.length()-1; i>=0; i--) {
			System.out.println(palabra.charAt(i));
		}
		
		sc.close();
	}

}
