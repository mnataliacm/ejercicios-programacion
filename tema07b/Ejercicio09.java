package tema07b;

/**
 * Tema 7b
 *
 * Ejercicio 9 Programa que rota los elementos de una matriz cuadrada una
 * posición sentido agujas reloj 12 filas y 12 columnas. Números aleatorios
 * entre 0 y 100. Mostrar original y resultado
 *
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio09 {

  public static void main(String[] args) {

    //variables
    int x = 0;
    int y = 0;
    //int num = (int)(Math.random() * 4) + 1;
    int[][] n = new int[12][12];
    int[][] r = new int[12][12];

    //programa
    System.out.println("Programa que rota números a la derecha ");
    for (int i = 0; i < n.length; i++) {
      for (int j = 0; j < n[0].length; j++) {
        n[i][j] = (int) (Math.random() * 101);
      }
    }
    //ARRAY ORIGINAL
    System.out.println("\nArray original:");
    System.out.print("     ╭───────┬───────┬───────┬───────┬───────┬───────┬───────┬───────┬───────┬───────┬───────┬───────╮\n");
    for (int i = 0; i < n.length; i++) {
      System.out.print("     |");
      for (int j = 0; j < n[0].length; j++) {
        System.out.printf(" %4d │", n[i][j]);
      }
      if (i < n.length - 1) {
        System.out.println("\n     ├───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┤");
      } else {
        System.out.println("\n     ╰───────┴───────┴───────┴───────┴───────┴───────┴───────┴───────┴───────┴───────┴───────┴───────╯");
      }
    }
    //MOVER LOS NÚMEROS
    int fin = n[11][11];
    do {
      for (int i = 0; i < n.length; i++) {
        for (int j = 0; j < n[0].length; j++) {

          if (i == 0 && j == 0) {
            r[i][j] = fin;
          } else {
            r[i][j] = n[x][y];
          }
          //Falla y++ si lo pongo en el for ????
        }
        y++;
      }
      x++;
    } while ((x < 11) && (y < 11));
//    int fin = n[11][11];
//    x--;
//    y--;
//    for (int i = n.length; i > 0; i--) {     
//      for (int j = n[0].length; j > 0 ; j--) {
//        if ((i  > 0) && (j > 0)) {     
//          r[i][j] = n[x--][y--];
//        } else {
//          r[0][0] = fin;
//        }
//      }
//    }

    //ARRAY RESULTADO
    System.out.println("\nArray resultado:");
    System.out.print("     ╭───────┬───────┬───────┬───────┬───────┬───────┬───────┬───────┬───────┬───────┬───────┬───────╮\n");
    for (int i = 0; i < n.length; i++) {
      System.out.print("     |");
      for (int j = 0; j < n[0].length; j++) {
        System.out.printf(" %4d │", r[i][j]);
      }
      if (i < n.length - 1) {
        System.out.println("\n     ├───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┤");
      } else {
        System.out.println("\n     ╰───────┴───────┴───────┴───────┴───────┴───────┴───────┴───────┴───────┴───────┴───────┴───────╯");
      }
    }
    System.out.println();
  }
}
