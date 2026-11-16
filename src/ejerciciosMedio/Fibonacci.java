package ejerciciosMedio;

import java.util.Scanner;

public class Fibonacci {
	
	public static void mostrarTerminos (int termino) {
		int ultimo = 1;
		int penultimo = 0;
		int siguiente = 0;
		
		System.out.print(penultimo + ", " + ultimo + ", ");
		
		for (int i = 3; i <= termino; i++) {
			siguiente = ultimo + penultimo;
			penultimo = ultimo;
			ultimo = siguiente;
			System.out.print(siguiente + ", ");
		}
	}
	
	public static long devolverTermino (int num) {
		long ultimo = 1;
		long penultimo = 0;
		long siguiente = 0;
		
		for (int i = 3; i <= num; i++) {
			siguiente = ultimo + penultimo;
			penultimo = ultimo;
			ultimo = siguiente;
		}
		
		return siguiente;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un término: ");
		int termino = sc.nextInt();
		
		mostrarTerminos(termino);
		
		System.out.println();
		
		System.out.println(devolverTermino(termino));
		
		sc.close();
	}

}
