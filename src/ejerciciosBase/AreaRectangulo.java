package ejerciciosBase;

import java.util.Scanner;

public class AreaRectangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce la base: ");
		double b = sc.nextDouble();
		System.out.print("Introduce la altura: ");
		double h = sc.nextDouble();
		
		System.out.println("El área del rectángulo es: " + (b * h));
		System.out.println("El perímetro del rectángulo es: " + ((2 * b) + (2 * h)));
		
		sc.close();
	}

}
