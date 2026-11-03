package ejerciciosBase;

import java.util.Scanner;

public class Circulo {
	
	public static double area(double r) {
		double area = 0;
		
		area = Math.PI * Math.pow(r, 2);
		
		return area;
	}
	
	public static double longitud(double r) {
		double longitud = 0;
		
		longitud = 2 * Math.PI * r;
		
		return longitud;
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
