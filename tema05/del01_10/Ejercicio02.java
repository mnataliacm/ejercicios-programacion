package tema05.del01_10;
/**
 * Tema 5
 * Ejercicio 2
 * Programa que muestra múltiplos de 5 desde 0 hasta 100 usando while.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio02 {
  public static void main(String[] args) {

    System.out.println("___Multiplos de 5 (0-100) v1___");
    
    int i = 0;

    while (i != 100) {
      i = i + 5;
      System.out.printf("%10d\n", i);  
    }
  }
}

