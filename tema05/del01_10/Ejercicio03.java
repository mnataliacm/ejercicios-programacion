/**
 * Tema 5
 * Ejercicio 3
 * Programa que muestra multiplos de 5 desde 0 hasta 100 usando do-while
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio03 {
  public static void main(String[] args) {

    System.out.println("___Multiplos de 5 (0-100) v2___");

    int i = 0;
    
    do {
      i = i + 5;
      System.out.printf("%10d\n", i); 
    } while (i != 100);

  }
}

