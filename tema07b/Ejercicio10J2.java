package tema07b;

import java.util.Scanner;

/**
 * Tema 7b
 *
 * Ejercicio 10 Juego 3 en raya
 *
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio10J2 {

  public static void main(String[] args) {

    //variables
    Scanner s = new Scanner(System.in);
    String red = "\033[31m";
    String green = "\033[32m";
    String reset = "\033[0m";
    int jugador1 = 0;
    int jugador2 = 0;
    Boolean siVacio = false;
    Boolean fin = false;
    //int pc = (int) (Math.random() * 10) + 1;
    int[][] n = new int[3][3];
    String[][] ocupada = new String[3][3];
    String ficha1 = red + "❌" + reset;
    String ficha2 = green + "⭕" + reset;
    int conteo = 1;
    int conteo1 = 0;
    int conteo2 = 0;
    //TABLERO
    for (int i = 0; i < n.length; i++) {
      for (int j = 0; j < n[0].length; j++) {
        n[i][j] = conteo++;
        ocupada[i][j] = "z";
      }
    }
    //PROGRAMA
    System.out.println("  3 en raya  ");
    System.out.println("*************");
    System.out.println(" POSICIONES  ");
    System.out.print("╭───┬────┬────╮\n");
    for (int i = 0; i < n.length; i++) {
      System.out.print("┃");
      for (int j = 0; j < n.length; j++) {
        System.out.printf(" %s ┃", n[i][j]);
      }
      if (i < n.length - 1) {
        System.out.println("\n├───┼────┼────┤");
      } else {
        System.out.println("\n╰───┴────┴────╯");
      }
    }
    System.out.println("   FICHAS  ");
    System.out.println("  ********  ");
    System.out.println(red + "Jugador 1: " + ficha1);
    System.out.println(green + "Jugador 2: " + ficha2);
    System.out.print("╭───┬────┬────╮\n");
    for (int i = 0; i < n.length; i++) {
      System.out.print("┃");
      for (int j = 0; j < n.length; j++) {
        System.out.printf(" %s ┃", ocupada[i][j]);
      }
      if (i < n.length - 1) {
        System.out.println("\n├───┼────┼────┤");
      } else {
        System.out.println("\n╰───┴────┴────╯");
      }
    }
    //conteo = 1;
    do {
      //JUGADOR 1
      do {
        System.out.print(red + "Jugador 1: " + reset);
        jugador1 = s.nextInt();
        siVacio = false;
        for (int i = 0; i < n.length; i++) {
          for (int j = 0; j < n.length; j++) {
            if (jugador1 == n[i][j] && ocupada[i][j].equals("z")) {
              ocupada[i][j] = ficha1;
              conteo1++;
              System.out.println(conteo1);
              siVacio = true;
            }
          }
        }
      } while ((!siVacio));
      //TABLERO
      System.out.print("╭───┬────┬────╮\n");
      for (int i = 0; i < n.length; i++) {
        System.out.print("┃");
        for (int j = 0; j < n.length; j++) {
          System.out.printf(" %s ┃", ocupada[i][j]);
        }
        if (i < n.length - 1) {
          System.out.println("\n├───┼────┼────┤");
        } else {
          System.out.println("\n╰───┴────┴────╯");
        }
      }
      //JUGADOR 2
      do {
        System.out.print(green + "Jugador 2: " + reset);
        jugador2 = s.nextInt();
        siVacio = false;
        for (int i = 0; i < n.length; i++) {
          for (int j = 0; j < n.length; j++) {
            if (jugador2 == n[i][j] && ocupada[i][j].equals("z")) {
              ocupada[i][j] = ficha2;
              conteo2++;
              System.out.println(conteo2);
              siVacio = true;
            }
          }
        }
      } while ((!siVacio));
      //TABLERO
      System.out.print("╭───┬────┬────╮\n");
      for (int i = 0; i < n.length; i++) {
        System.out.print("┃");
        for (int j = 0; j < n.length; j++) {
          System.out.printf(" %s ┃", ocupada[i][j]);
        }
        if (i < n.length - 1) {
          System.out.println("\n├───┼────┼────┤");
        } else {
          System.out.println("\n╰───┴────┴────╯");
        }
      }
      //NO CONSIGO QUE TERMINE
      conteo = conteo1 + conteo2;
    } while (conteo < 10);
    System.out.println("");
  }
}
