package ejerciciosBase;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int num1 = sc.nextInt();
		System.out.print("Introduce otro número: ");
		int num2 = sc.nextInt();
		
		System.out.println("La suma es: " + (num1 + num2));
		System.out.println("La resta es: " + (num1 - num2));
		System.out.println("El producto es: " + (num1 * num2));
		System.out.println(num1 + " entre " + num2 + " da " + (num1 / num2) + " y sobran " + (num1 % num2));
		
		sc.close();
	}

}
