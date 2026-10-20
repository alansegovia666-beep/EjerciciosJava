package ejerciciosBase;

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*System.out.print("Dame un número: ");
		int num = sc.nextInt();
		
		for (int i=1; i<=10; i++) {
			System.out.printf("%d * %2d = %d%n", num, i, (num * i));
		}*/
		
		for (int i=1; i<=10; i++) {
			for (int j=1; j<=10; j++) {
				System.out.printf("%2d * %2d = %3d%n", i, j, (i * j));
			}
		}
		
		sc.close();
	}

}
