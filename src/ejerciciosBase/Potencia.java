package ejerciciosBase;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double potencia = 1;
		
		System.out.print("Dame una base: ");
		int base = sc.nextInt();
		
		System.out.print("Dame un exponente: ");
		int exponente = sc.nextInt();
		
		if (exponente >= 0) {
			for (int i=1; i<=exponente; i++) {
				potencia *= base;
			}
		} else {
			for (int i=-1; i>=exponente; i--) {
				potencia *= base;
			}
			potencia = 1 / potencia;
		}
		
		System.out.printf("La potencia es: %.4f%n", potencia);
		
		sc.close();
	}

}
