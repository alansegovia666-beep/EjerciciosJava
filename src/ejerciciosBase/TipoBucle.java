package ejerciciosBase;

import java.util.Scanner;

public class TipoBucle {

	public static void main(String[] args) {
		for (int i=5; i>0; i--) {
			System.out.println(i);
		}
		
		int i = 5;
		
		while (i > 0) {
			System.out.println(i);
			i--;
		}
		
		do {
			System.out.println(i);
			i--;
		} while (i > 0);
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while (n < 0) {
			n = sc.nextInt();
		}
		
		int n;
		
		do {
			n = sc.nextInt();
		} while (n < 0);
		
		for (int i=n; i<0; i++) {
			n = sc.nextInt();
		}
		
		int i = 1;
		
		do {
			System.out.println(i * i);
			i++;
		} while (i <= 10);
		
		while (i <= 10) {
			System.out.println(i * i);
			i++;
		}
		
		for (int j=1; j<=10; j++) {
			System.out.println(j * j);
		}
	}

}
