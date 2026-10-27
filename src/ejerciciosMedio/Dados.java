package ejerciciosMedio;

import java.util.Random;

public class Dados {

	public static void main(String[] args) {
		Random rand = new Random();
		int suma;
		int cont = 0;
		int lanzamientos = 100000;
		
		for (int i=1; i<=lanzamientos; i++) {
			suma = (rand.nextInt(6)+1) + (rand.nextInt(6)+1);
			if (suma == 7) {
				cont++;
			}
		}
		
		System.out.printf("La suma ha sido 7 un total de %d veces, esto representa el %.2f %%\n", cont, ((double)cont / lanzamientos * 100));
	}

}
