/**
 * Tema 7
 * Ejercicio 21
 * 
 * Programa que rellena array de 15 numeros enteros entre 0 y 500 (ambos incluidos).
 * Mostrar el array "cincuerizado" si el valor no es multiplo de 5 se cambia por el multiplo de 5 siguiente.
 * 
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio21 {
  public static void main(String[] args) {

    //VARIABLES
    int[] n = new int[15];
    int[] r = new int[15];
    int cuenta = 0;
    //PROGRAMA
    System.out.println("Programa que 'cincueriza' números");
    System.out.println();
    for (int i = 0; i < n.length; i++) {
      n[i] = (int)(Math.random() * 501);
    }
    for (int i = 0; i < r.length; i++) {
      r[i] = n[i] % 10;
      if ((r[i] == 0) || (r[i] == 5)) {
        r[i] = n[i];
      } else if (r[i] < 5) {
        cuenta = 5 - r[i];
        r[i] = n[i] + cuenta;
      } else if (r[i] > 5) {
        cuenta = 10 - r[i];
        r[i] = n[i] + cuenta;
      }
    }
    //MUESTRO ARRAY ORIGINAL
    System.out.println("");
    System.out.println("Array original:");
    System.out.println();
    for (int i = 0; i < 15; i++) {
      System.out.printf(" %5d", n[i]);
    }
    System.out.println();
    //MUESTRO ARRAY RESULTADO
    System.out.println("");
    System.out.println("Array resultado:");
    System.out.println();
    for (int i = 0; i < 15; i++) {
      System.out.printf(" %5d", r[i]);
    }
    System.out.println();
  }
}

