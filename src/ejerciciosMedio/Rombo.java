package ejerciciosMedio;

import java.util.Scanner;

public class Rombo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un número de filas: ");
		int filas = sc.nextInt();
		int filasTotales = filas * 2;
		
		for (int i=filasTotales; i>=1; i-=2) {
			for (int j=1; j<i; j+=2) {
				System.out.print(" ");
			}
			for (int k=filasTotales; k>=i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i=3; i<=filasTotales; i+=2) {
			for (int j=1; j<=i; j+=2) {
				System.out.print(" ");
			}
			for (int k=filasTotales; k>i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
