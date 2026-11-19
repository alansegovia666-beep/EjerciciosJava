package ejerciciosAvanzado;

import java.util.Random;

public class Caracoles {
	
	public static String avanza (String caracol) {
		Random rand = new Random();
		
		for (int i = 0; i <= rand.nextInt(4); i++) {
			caracol += ".";
		}
		
		return caracol;
	}
	
	public static String dibujar (String caracol) {
		return caracol + "@";
	}
	
	public static boolean ganador (String caracol) {
		if (caracol.length() >= 50) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int cont = 1;
		
		String c1 = "";
		String c2 = "";
		String c3 = "";
		
		while (!ganador(c1) && !ganador(c2) && !ganador(c3)) {
			
			c1 = avanza(c1);
			c2 = avanza(c2);
			c3 = avanza(c3);
			
			System.out.println("Turno " + cont);
			System.out.println("A: " + dibujar(c1));
			System.out.println("B: " + dibujar(c2));
			System.out.println("C: " + dibujar(c3));
			
			if (ganador(c1)) {
				System.out.println("El caracol A es el ganador");
			}

			if (ganador(c2)) {
				System.out.println("El caracol B es el ganador");
			}
			
			if (ganador(c3)) {
				System.out.println("El caracol C es el ganador");
			}
			
			cont++;
		}
	}

}
