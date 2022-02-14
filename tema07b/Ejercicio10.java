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
public class Ejercicio10 {

  public static void main(String[] args) {

    //variables
    Scanner s = new Scanner(System.in);
    int jugada = 0;
    int pc = (int) (Math.random() * 10) + 1;
    int[][] n = new int[3][3];
    String[][] ocupada = new String[3][3];
    String ficha = "";
    int elije = 0;
    int conteo = 1;
    String fichaPc = "";
    //TABLERO
    for (int i = 0; i < n.length; i++) {
      for (int j = 0; j < n[0].length; j++) {
        n[i][j] = conteo++;
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
    
    System.out.println("FICHAS");
    System.out.println("******");
    System.out.println("1. ❌");
    System.out.println("2. ⭕");
    System.out.println("Elije ficha: ");
    elije = s.nextInt();
    switch (elije) {
      case 1:
        ficha = "❌";
        fichaPc = "⭕";
        break;
      case 2:
        ficha = "⭕";
        fichaPc = "❌";
        break;
      default:
        break;
    }
    conteo = 0;
    do {
      System.out.print("Introduce la jugada: ");
      jugada = s.nextInt();
      pc = (int) (Math.random() * 10) + 1;
      for (int i = 0; i < n.length; i++) {
        for (int j = 0; j < n.length; j++) {
          if (jugada == n[i][j]) {
            ocupada[i][j] = ficha;
            conteo++;
          }
          if (pc == n[i][j]) {
            ocupada[i][j] = fichaPc;
            conteo++;
          }
        }
      }
      
      System.out.println("");
      for (int i = 0; i < n.length; i++) {
        for (int j = 0; j < n.length; j++) {
          System.out.print(ocupada[i][j]);
        }
        System.out.println("");
      }
    } while (conteo != 10);

//    System.out.print("╭───┬────┬────╮\n");
//    System.out.print("┃");
//    for (int i = 0; i < n.length; i++) {
//      System.out.print("┃");
//      if (i < n.length - 1) {
//        System.out.println("\n├───┼────┼────┤");
//        System.out.printf(" %s ┃", ficha);
//      } else {
//        System.out.println("\n╰───┴────┴────╯");
//      }
//    }
//    for (int i = 0; i < n.length; i++) {
//      for (int j = 0; j < n[0].length; j++) {
//        System.out.println(n[i][j]);
//      }      
//    }
    System.out.println();
    s.close();
  }
}
