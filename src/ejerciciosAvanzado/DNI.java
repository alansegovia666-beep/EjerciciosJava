package ejerciciosAvanzado;

import java.util.Scanner;

public class DNI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dame un DNI: ");
		int dni = sc.nextInt();
		
		if (dni >= 0 && dni <= 99999999) {
			String cadena = "TRWAGMYFPDXBNJZSQVHLCKE";
			char letra = cadena.charAt(dni % 23);
			System.out.print(letra);
		}
		
		sc.close();
	}

}
