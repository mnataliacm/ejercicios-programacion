package tema05.del21_30;
/**
 * Tema 5
 * Ejercicio 27
 * Programa que muestre, cuente y sume los múltiplos de 3.
 * Desde 1 hasta numero introducido por teclado.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio27 {
  public static void main(String[] args) {

    System.out.println("___Programa que muestra, cuenta y suma los múltiplos de 3___");
    System.out.print("Introduce número de parada: ");
    int parada = Integer.parseInt(System.console().readLine());
    //variables
    int multiplos = 0;
    int conteo = 0;
    int suma = 0;
    //operaciones
    System.out.println("\nLos múltiplos de 3 desde 1 hasta " + parada + " son: ");
    for (int i = 1; i <= parada; i++) {
      multiplos = i % 3;
      if (multiplos == 0) {
        System.out.print(i + ", ");
        conteo++;
        suma = suma + i;

      }
    }
  System.out.println();
  System.out.println("Total de multiplos de 3 encontrados: " + conteo);
  System.out.println("La suma de todos los múltiplos de 3 es: " + suma);
  }
}

