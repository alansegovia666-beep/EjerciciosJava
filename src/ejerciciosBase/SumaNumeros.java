package ejerciciosBase;

import java.util.Scanner;

public class SumaNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int suma = 0;
		int cont = 0;
		
		System.out.print("Introduce un entero positivo: ");
		int num = sc.nextInt();
		
		for (int i=1;i<=num; i++) {
			suma += i;
		}
		
		/*while (cont <= num) {
			suma += cont;
			cont++;
		}*/
		
		/*do {
			suma += cont;
			cont++;
		} while (cont <= num);*/
		
		System.out.print("La suma de todos los números es " + suma);
		
		sc.close();
	}

}
