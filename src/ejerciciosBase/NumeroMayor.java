package ejerciciosBase;

import java.util.Scanner;

public class NumeroMayor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe un número: ");
		int num1 = sc.nextInt();
		System.out.print("Escribe otro número: ");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println("El mayor es " + num1);
		} else if (num1 < num2){
			System.out.println("El mayor es " + num2);
		} else {
			System.out.println("Son iguales");
		}
		
		sc.close();
	}

}
