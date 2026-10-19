package ejerciciosAvanzado;

import java.util.Scanner;
import java.util.Random;

public class PiedraPapelTijera {
	
	public static final int PIEDRA = 1;
	public static final int PAPEL = 2;
	public static final int TIJERA = 3;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Elige:");
		System.out.println("1 - Piedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tijera");
		int usuario = sc.nextInt();
		
		int ordenador = rand.nextInt(3) + 1;
		
		if (ordenador == PIEDRA) {
			System.out.println("El ordenador ha elegido Piedra");
		} else if (ordenador == PAPEL) {
			System.out.println("El ordenador ha elegido Papel");
		} else {
			System.out.println("El ordenador ha elegido Tijera");
		}
		
		if ((usuario == PIEDRA && ordenador == TIJERA) || (usuario == PAPEL && ordenador == PIEDRA) || (usuario == TIJERA && ordenador == PAPEL)) {
			System.out.println("Has ganado");
		} else if (usuario == ordenador) {
			System.out.println("Empate");
		} else {
			System.out.println("Has perdido");
		}
		
		sc.close();
	}

}
