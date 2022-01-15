package tema07b;

/**
 * Tema 7b
 *
 * Ejercicio 12 
 * Programa que muestra por pantalla un array de 9x9 con números
 * aleatorios entre 500 y 900 Mostrar la diagonal inferior izquierda a la
 * superior derecha y motrar el máximo, el mínimo y la media de la diagonal.
 *
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio12 {

  public static void main(String[] args) {

    //variables
    //int num = (int)(Math.random() * 401) + 500;
    int[][] n = new int[9][9];
    int x = 8;
    int y = 0;
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    int media = 0;
    //programa
    System.out.println("Genero array de 9x9");
    for (int i = 0; i < n.length; i++) {
      for (int j = 0; j < n[0].length; j++) {
        n[i][j] = (int) (Math.random() * 401) + 500;
      }
    }
    System.out.println();
    System.out.print("  ┌───────┬───────┬───────┬───────┬───────┬───────┬───────┬───────┬───────┐\n");
    for (int i = 0; i < n.length; i++) {
      System.out.print("  │");
      for (int j = 0; j < n[0].length; j++) {
        System.out.printf(" %4d │", n[i][j]);
      }
      if (i < 8) {
        System.out.println("\n  ├───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┤");
      } else {
        System.out.println("\n  └───────┴───────┴───────┴───────┴───────┴───────┴───────┴───────┴───────┘");
      }
    }
    System.out.println();  
      System.out.print("Diagonal: ");
      do {
        media += n[x][y];
        if (n[x][y] > maximo) {
          maximo = n[x][y];
        }
        if (n[x][y] < minimo) {
          minimo = n[x][y];
        }
        System.out.print(n[x--][y++] + " ");       
      } while ((x != 9) && (y != 9));
      System.out.println("\nMáximo: " + maximo + "  Mínimo: " + minimo + "  Media: " + media/n.length);
  }
}
