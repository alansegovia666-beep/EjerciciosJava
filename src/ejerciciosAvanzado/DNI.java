package ejerciciosAvanzado;

import java.util.Scanner;

public class DNI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dame un DNI: ");
		String dni = sc.nextLine().toUpperCase();
		
		String numDni = dni.substring(0, dni.length()-1);
		char letraIntroducida = dni.charAt(dni.length()-1);
		
		if (numDni.length() <= 8 && numDni.charAt(0) != '-') {
			int num = Integer.parseInt(numDni);
			String cadena = "TRWAGMYFPDXBNJZSQVHLCKE";
			char letraCalculada = cadena.charAt(num % 23);
			if (letraCalculada == letraIntroducida) {
				System.out.println("El DNI es correcto");
			} else {
				System.out.println("El DNI no es correcto");
			}
		} else {
			System.out.println("El número del DNI no es válido");
		}
		
		sc.close();
	}

}
