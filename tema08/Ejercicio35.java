package tema08;

/**
 * Tema 8
 * Ejercicio 35
 * 
 * Programa que convierte un número n al sistema de palotes y lo devuelve en una
 * cadena de caracteres.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio35 {
	public static void main(String[] args) {

		// variables
		System.out.println("___Conversor de decimal a 'palotes'___");
		System.out.print("Introduce un número entero positivo: ");
		int numero = Integer.parseInt(System.console().readLine());
		System.out.println("El número dado convertido a palotes es: ");
		System.out.println(convierteEnPalotes(numero));
	}
	// FUNCION CONVERTIR EN PALOTES
	public static String convierteEnPalotes(long n) {
		String palotes = "";		
		int conteo = Ejercicio01_14.digitos(n);
		long numReves = Ejercicio01_14.voltea(n);
		long numero = numReves;
		do {
			numero = numReves % 10;
			for (int i = 0; i < numero; i++) {
				palotes += "|";
			}
			conteo--;
			numReves = numReves / 10;
			if (conteo > 0) {
				palotes += "-";
			}
		} while (conteo > 0);
		return palotes;
	}
}
