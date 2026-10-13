package ejerciciosMedio;

import java.util.Scanner;

public class Hucha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Monedas de 2€: ");
		int monedas2 = sc.nextInt();
		
		System.out.print("Monedas de 1€: ");
		int monedas1 = sc.nextInt();
		
		System.out.print("Monedas de 50 cent: ");
		int monedas50 = sc.nextInt();
		
		System.out.print("Monedas de 20 cent: ");
		int monedas20 = sc.nextInt();
		
		System.out.print("Monedas de 10 cent: ");
		int monedas10 = sc.nextInt();

		int centimos = monedas2 * 200 + monedas1 * 100 + monedas50 * 50 + monedas20 * 20 + monedas10 * 10;
		int euros = centimos / 100;
		centimos %= 100;
		
		System.out.print("Total: " + euros + " euros y " + centimos + " céntimos");
		sc.close();
	}

}
