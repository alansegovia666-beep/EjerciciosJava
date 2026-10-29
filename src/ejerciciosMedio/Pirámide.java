package ejerciciosMedio;

import java.util.Scanner;

public class Pirámide {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce una altura: ");
		int altura = sc.nextInt();
		
		for (int i=altura*2; i>=1; i-=2) {
			for (int j=1; j<i; j+=2) {
				System.out.print(" ");
			}
			for (int k=altura*2; k>=i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
