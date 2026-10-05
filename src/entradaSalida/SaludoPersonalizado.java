package entradaSalida;

import java.util.Scanner;

public class SaludoPersonalizado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nombre;
		
		System.out.println("Hola, cómo te llamas?");
		nombre = sc.nextLine();
		System.out.print("Encantado de conocerte " + nombre);
		sc.close();
		
	}

}
