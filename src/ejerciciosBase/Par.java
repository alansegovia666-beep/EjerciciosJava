package ejerciciosBase;

import java.util.Scanner;

public class Par {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dame un número: ");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.print("El número " + num + " es par");
		} else {
			System.out.print("El número " + num + " es impar");
		}
		
		sc.close();
	}

}
