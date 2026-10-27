package ejerciciosMedio;

import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean esPrimo = true;
		int vueltas = 0;
		
		System.out.print("Dame un número: ");
		int num = sc.nextInt();
	
		if (num <= 1) {
			esPrimo = false;
		} else if (num == 2) {
			esPrimo = true;
		} else if (num % 2 == 0) {
			esPrimo = false;
		} else {
			int cont = 3;
			double raiz = Math.sqrt(num);
			while (cont <= raiz && esPrimo) {
				if (num % cont == 0) {
					esPrimo = false;
				} 
				cont += 2;
				vueltas++;
			}
		}
		
		if (esPrimo) {
			System.out.print(num + " es primo, ha dado " + vueltas + " vueltas");
		} else {
			System.out.print(num + " no es primo, ha dado " + vueltas + " vueltas");
		}
		
		sc.close();
	}

}
