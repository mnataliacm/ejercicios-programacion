package tema07b;

import java.util.Scanner;

/**
 * Tema 7b
 *
 * Ejercicio 8 Programa que dada la posición del álfil en un tablero no dice a
 * que casillas puede moverse, siempre en diagonal. Tablero de 64 casillas:
 * columnas a - h y filas 1 - 8 ♝
 *
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio08 {

  public static void main(String[] args) {

    //VARIABLES
    Scanner s = new Scanner(System.in);
    String[][] tablero = new String[8][8];
    String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h"};
    String white = "\033[47m";
    String red = "\033[41m";
    String reset = "\033[0m";
    String x = "";
    String y = "";
    int z = 0;
    int a = 0;
    int b = 0;
    int xx = 0;
    int yy = 0;
    //PROGRAMA
    System.out.println("  Posibles movimientos del Álfil  ");
    System.out.println("----------------------------------");
    System.out.print("Introduce la posición del Álfil: ");
    String alfil = s.nextLine();
    //MUESTRO TABLERO
    System.out.println();
    System.out.print(" ");
    for (String l : letras) {
      System.out.print(l + " ");
    }
    System.out.println();
    for (int n = 8; n > 0; n -= 2) {
      System.out.println(n + white + "  " + red + "  " + white + "  " + red + "  " + white + "  " + red + "  " + white + "  " + red + "  " + reset + n + "\n" + (n - 1) + red + "  " + white + "  " + red + "  " + white + "  " + red + "  " + white + "  " + red + "  " + white + "  " + reset + (n - 1));
    }
    System.out.print(" ");
    for (String l : letras) {
      System.out.print(l + " ");
    }
    System.out.println();
    for (int i = 0; i < tablero.length; i++) {
      switch (i) {
        case 0:
          x = "a";
          break;
        case 1:
          x = "b";
          break;
        case 2:
          x = "c";
          break;
        case 3:
          x = "d";
          break;
        case 4:
          x = "e";
          break;
        case 5:
          x = "f";
          break;
        case 6:
          x = "g";
          break;
        case 7:
          x = "h";
          break;
        default:
          break;
      }
      for (int j = 0; j < tablero[0].length; j++) {
        z = j + 1;
        y = String.valueOf(z);
        tablero[i][j] = x + y;
      }
    }
    //CALCULO POSICION ALFIL
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        if (tablero[i][j].equals(alfil)) {
          a = i;
          b = j;
        }
      }
    }
    //MUESTRO RESULTADO
    System.out.println();
    System.out.println("El Álfil puede moverse a las siguientes posiciones: ");
    //BUSCO MOVIMIENTOS ALFIL
    //abajo izquierda
    xx = a;
    yy = b;
    if (xx > 0 && yy > 0) {
      //System.out.print("BI: ");     
      xx--;
      yy--;
      do {
        System.out.print(tablero[xx--][yy--] + " ");
      } while ((xx != -1) && (yy != -1));
    }
    //abajo derecha
    xx = a;
    yy = b;
    if (xx < 7 && yy > 0) {
      //System.out.print("BD: ");    
      xx++;
      yy--;
      do {
        System.out.print(tablero[xx++][yy--] + " ");
      } while ((xx != 8) && (yy != -1));
    }
    //arriba izquierda
    xx = a;
    yy = b;
    if (xx > 0 && yy < 7) {
      //System.out.print("AI: ");
      xx = a - 1;
      yy = b + 1;
      do {
        System.out.print(tablero[xx--][yy++] + " ");
      } while ((xx != -1) && (yy != 8));
    }
    //arriba derecha
    xx = a;
    yy = b;
    if (xx < 7 && yy < 7) {
      //System.out.print("AD: ");     
      xx = a + 1;
      yy = b + 1;
      do {
        System.out.print(tablero[xx++][yy++] + " ");
      } while ((xx != 8) && (yy != 8));
    }
    System.out.println();
  }
}
//COMPROBACIONES
//ver array
//    for (String[] tablero1 : tablero) {
//      for (int j = 0; j < tablero[0].length; j++) {
//        System.out.print(tablero1[j] + " ");
//      }
//    }
//ver posicion
//System.out.println("\nPosición: " + a + " " + b);

///////*NO FUNCIONA ????*/
//    for (String l : letras) {
//      for (int k = 1; k < 8; k++) {
//        for (int i = 0; i < tablero.length; i++) {
//          for (int j = 0; j < tablero[0].length; j++) {
//            tablero[i][j] = l + String.valueOf(k);
//          }
//        }
//      }
//    }
///////
