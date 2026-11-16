package ejerciciosBase;

public class MetodoAdecuado {

	public static void main(String[] args) {
		//a
		String s = "programación";
		boolean empieza = s.length() >= 3 && s.charAt(0) == 'p' && s.charAt(1) == 'r' && s.charAt(2) == 'o';
		System.out.println(empieza);
		
		//Resultado
		empieza = s.startsWith("pro");
		System.out.println(empieza);
		
		//b
		int pos = -1;
		for (int i = 0; i < s.length() && pos == -1; i++) {
			if (s.charAt(i) == 'n') {
				pos = i;
			}
		}
		System.out.println(pos);
		
		//Resultado
		System.out.println(s.indexOf('n'));
		
		//c
		String r = "";
		for (int i = 2; i < 6; i++) {
			r += s.charAt(i);
		}
		System.out.println(r);
		
		//Resultado
		System.out.println(s.substring(2, 6));
		
		//d
		boolean vacia = s.length() == 0;
		System.out.println(vacia);
		
		//Resultado
		System.out.println(s.isEmpty());
	}

}
