package ejercicios.tema09.b_POOenJava.ejercicio15;

import ejercicios.tema09.b_POOenJava.ejercicio14.FichaDomino;

public class GeneraFichasDomino {

	public static void main(String[] args) {
				
		int a;
		int b;
		
		for (int i = 0; i < 9; i++) {
			a = (int)(Math.random() * 10);
			b = (int)(Math.random() * 10);
			FichaDomino fichaDomino = new FichaDomino(a, b);
			System.out.println(fichaDomino);
		}
		
	}

}
