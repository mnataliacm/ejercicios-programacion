package tema07b;

import java.util.Scanner;

/**
 * Tema 7b
 * 
 * Ejercicio 8
 * Programa que dada la posición del álfil en un tablero no dice a que casillas puede moverse, siempre en diagonal.
 * Tablero de 64 casillas: columnas a - h y filas 1 - 8
 * ♝ 
 * 
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio08 {
  public static void main(String[] args) {

    //VARIABLES
    Scanner s = new Scanner(System.in);
    //int[][] tablero = new int[8][8];
    String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h"};
    String white = "\033[47m";
    String red = "\033[41m"; 
    String reset="\033[0m";
    //PROGRAMA
    System.out.println("  Posibles movimientos del Álfil  ");
    System.out.println("----------------------------------");
    System.out.print("Introduce la posición del Álfil: ");
    String alfil = s.nextLine();
    //MUESTRO TABLERO
    System.out.println();
    System.out.print("  ");
    for (String l : letras) {
      System.out.print(l + " ");
    }
    System.out.println();
    for (int n = 8; n > 0; n-=2) {
      System.out.println(n + white + "  " + red + "  " + white + "  " + red + "  " + white + "  " + red + "  " + white + "  " + red + "  " + reset + n + "\n" + (n - 1) + red + "  " + white + "  " + red + "  " + white + "  " + red + "  " + white + "  " + red + "  " + white + "  " + reset + (n - 1));
    }
    System.out.print("  ");
    for (String l : letras) {
      System.out.print(l + " ");
    }
    //MUESTRO RESULTADO
     System.out.println("\n");
    System.out.println("El Álfil puede moverse a las siguientes posiciones: ");
    System.out.println();
    System.out.println();
  }
}

