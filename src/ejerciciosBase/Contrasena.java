package ejerciciosBase;

import java.util.Scanner;

public class Contrasena {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dame una contraseña: ");
		String contraseña = sc.nextLine();
		
		if (contraseña.length() >= 8) {
			System.out.print("La contraseña tiene al menos 8 caracteres");
		} else {
			System.out.print("La contraseña tiene " + (8 - contraseña.length()) + " caracteres");
		}
		
		sc.close();
	}

}
