package ejerciciosMedio;

import java.util.Scanner;

public class Divisores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		int suma = 0;
		
		System.out.print("Dame un número: ");
		int num = sc.nextInt();
		
		System.out.printf("Divisores de %d: %n", num);
		
		for (int i=1; i<num; i++) {
			if (num % i == 0) {
				System.out.printf("%d ", i);
				suma += i;
				cont++;
			} 
		}
		
		System.out.printf("%d ", num);
		cont++;
		
		if (num == suma) {
			System.out.printf("%n%d es un número perfecto", num);
		} else {
			System.out.printf("%n%d no es un número perfecto", num);
		}
		
		System.out.printf("%n%d tiene %d divisores.%n", num, cont);
		
		sc.close();
	}

}
