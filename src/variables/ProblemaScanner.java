package variables;

import java.util.Scanner;

public class ProblemaScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un nombre: ");
		String nombre1 = sc.nextLine();

		System.out.println("Introduce una edad: ");
		int edad1 = sc.nextInt();
		
		System.out.println("Te llamas " + nombre1 + " y tienes " + edad1 + " años");
		
		sc.nextLine();
		
		System.out.println("Introduce un nombre: ");
		String nombre2 = sc.nextLine();

		System.out.println("Introduce una edad: ");
		int edad2 = sc.nextInt();
		
		System.out.println("Te llamas " + nombre2 + " y tienes " + edad2 + " años");
		
		sc.close();
	}

}
