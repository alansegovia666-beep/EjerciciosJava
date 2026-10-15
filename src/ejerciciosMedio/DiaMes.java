package ejerciciosMedio;

import java.util.Scanner;

public class DiaMes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean bisiesto = false;
		
		System.out.print("Introduce un mes: ");
		int mes = sc.nextInt();
		System.out.print("Introduce un año: ");
		int anio = sc.nextInt();
		
		if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) bisiesto = true;
		
		switch (mes) {
			case 1, 3, 5, 7, 8, 10, 12: 
				System.out.println("El mes " + mes + " tiene 31 días");
				break;
			case 4, 6, 9, 11: 
				System.out.println("El mes " + mes + " tiene 30 días");
				break;
			case 2: 
				if (bisiesto) {
					System.out.println("El mes " + mes + " tiene 29 días");
				} else {
					System.out.println("El mes " + mes + " tiene 28 días");
				}
				break;
			default:
				System.out.println("El mes " + mes + " no es válido");
		}
		
		sc.close();
	}

}
