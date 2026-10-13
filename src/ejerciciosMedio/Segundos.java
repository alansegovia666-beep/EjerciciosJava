package ejerciciosMedio;

import java.util.Scanner;

public class Segundos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce una cantidad de segundos: ");
		int segundos = sc.nextInt();
		
		int minutos = segundos / 60;
		int horas = minutos / 60;
		segundos %= 60;
		minutos %= 60;
		
		System.out.printf("%02d:%02d:%02d", horas, minutos, segundos);
		sc.close();
	}

}
