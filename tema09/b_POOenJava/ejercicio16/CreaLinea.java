package ejercicios.tema09.b_POOenJava.ejercicio16;
/**
 * Tema 9
 * Ejercicio 16
 * 
 * 
 * @author Natalia Castillo Muñoz
 *
 */
public class CreaLinea {

	public static void main(String[] args) {
		
		System.out.println();
		Punto p1 = new Punto(4.21, 7.3);
		Punto p2 = new Punto(-2, 1.66);
		Linea l = new Linea(p1, p2);
		System.out.println(l);

	}

}
