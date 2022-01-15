package tema07b;

/**
 * Tema 7b
 *
 * Ejercicio 11 
 * Programa que muestra por pantalla un array de 10x10 con números
 * aleatorios entre 200 y 300 Mostrar la diagonal superior izquierda a la
 * inferior derecha y motrar el máximo, el mínimo y la media de  la diagonal
 *
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio11 {

  public static void main(String[] args) {

    //variables
    //int num = (int)(Math.random() * 101) + 200;
    int[][] n = new int[10][10];
    int x = 0;
    int y = 0;
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    int media = 0;
    //programa
    System.out.println("Genero array de 10x10");
    for (int i = 0; i < n.length; i++) {
      for (int j = 0; j < n[0].length; j++) {
        n[i][j] = (int) (Math.random() * 101) + 200;
      }
    }
    System.out.println();
    System.out.print("  ┌───────┬───────┬───────┬───────┬───────┬───────┬───────┬───────┬───────┬───────┐\n");
    for (int i = 0; i < n.length; i++) {
      System.out.print("  │");
      for (int j = 0; j < n[0].length; j++) {
        System.out.printf(" %4d │", n[i][j]);
      }
      if (i < 8) {
        System.out.println("\n  ├───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┤");
      } else {
        System.out.println("\n  └───────┴───────┴───────┴───────┴───────┴───────┴───────┴───────┴───────┴───────┘");
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
        System.out.print(n[x++][y++] + " ");
        
        
      } while ((x != 10) && (y != 10));
      System.out.println("\nMáximo: " + maximo + "  Mínimo: " + minimo + "  Media: " + media/n.length);
  }
}
