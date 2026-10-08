package ejerciciosBase;

import java.util.Scanner;

public class AreaCircunferencia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dame el radio: ");
		double r = sc.nextDouble();
		
		System.out.println("El área del círculo es: " + String.format("%.2f" , (Math.PI) * (Math.pow(r, 2))));
		System.out.printf("La longitud de la circunferencia es: %.2f" , ((2) * (Math.PI) * (r)));
		
		sc.close();
	}

}
