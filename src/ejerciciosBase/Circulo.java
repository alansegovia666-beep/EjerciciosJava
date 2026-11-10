package ejerciciosBase;

import java.util.Scanner;

public class Circulo {
	
	public static double area(double r) {
		return Math.PI * Math.pow(r, 2);
	}
	
	public static double longitud(double r) {
		return 2 * Math.PI * r;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dame el radio: ");
		double r = sc.nextDouble();
		
		System.out.printf("El área del círculo es: %.2f", area(r));
		System.out.printf("\nLa longitud de la circunferencia es: %.2f", longitud(r));
		
		sc.close();
	}

}
