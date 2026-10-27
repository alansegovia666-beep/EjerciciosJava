package ejerciciosBase;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dame una altura: ");
		int altura = sc.nextInt(); 
		
		for (int i=1; i<=altura; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i=altura; i>=1; i--) {
			for (int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for (int k=altura; k>=i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
