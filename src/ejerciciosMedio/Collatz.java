package ejerciciosMedio;

public class Collatz {

	public static void main(String[] args) {
		
		int numero = 0;
		int contador = 0;
		
		for (int i=1; i<1000; i++) {
			int cont = 0;
			int num = i;
			while (num > 1) {
				if (num % 2 == 0) {
					num /= 2;
				} else {
					num = num * 3 + 1;
				}
				cont++;
			}
			if (cont > contador) {
				contador = cont;
				numero = i;
			}
		}
		
		System.out.print("El número menor de 1000 con más pasos es " + numero + " con " + contador + " pasos");
		
	}

}
