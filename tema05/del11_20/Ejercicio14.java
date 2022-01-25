package tema05.del11_20;
/**
 * Tema 5
 * Ejercicio 14
 * Programa que pide una base y un exponente (entero positivo)
 * y calcula la potencia.
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio14 {
  public static void main(String[] args) {

    System.out.println("___Programa que calcula una potencia___");
    System.out.print("Introduce la base: ");
    int base = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el exponente (entero positivo): ");
    int exponente = Integer.parseInt(System.console().readLine());
    int resultado = base;
    for (int i = 1; i < exponente; i++) {
      resultado = resultado * base;
    }
    System.out.println("\nEl resultado de " + base + "^" + exponente + " es = " + resultado);
}

