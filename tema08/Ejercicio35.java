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
		// variables
		int num = numero;
		int conteo = 0;
		int num1 = 1;
		int numeroReves = 0;
		// Contar dígitos
		while (num > 0) {
			num = num / 10;
			conteo++;
		}
		num = numero;
		// voltear números
		while (num > 0) {
			numeroReves = ((numeroReves * 10) + (num % 10));
			num /= 10;
		}
		num = numeroReves;
		System.out.println(conteo); // comprobar --> quitar luego
		// convirtiendo a palote
		do {

			num1 = num % 10;
			for (int i = 0; i < num1; i++) {
				System.out.print("|");
			}
			conteo--;
			num = num / 10;
			if (conteo > 0) {
				System.out.print("-");
			}
		} while (conteo > 0);
		System.out.println();
	}

	// FUNCION CONVERTIR EN PALOTES
	// public static String convierteEnPalotes(int n) {
	// int conteo = .arra);
	// }

}
