package tema07b;
import java.util.Scanner;
/**
 * 
 * Tema 7b
 * 
 * Minijuego "Busca el tesoro" (de Luis José Sánchez)
 * Se colocan una mina y un tesoro de forma aleatoria en un cuadrante de cuatro filas por cinco columnas. El usuario intentará averiguar dónde está el tesoro.
 * 💸 💣 ❌
 * 
 * Ejercicio 7
 * Mejora el juego de forma que si hay una mina a una casilla de distancia el programa avisa
 * ¡Cuidado! ¡Hay una mina cerca!
 * 
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio07 {
  public static void main(String[] args) {
  //VARIABLES
  Scanner s = new Scanner (System.in);
  final int VACIO = 0;
  final int MINA = 1;
  final int TESORO = 2;
  final int INTENTO = 3;
  int x;
  int y;
  int[][] cuadrante = new int[5][4];
  String red = "\033[31m";
  String green = "\033[32m"; 
  String blue = "\033[34m"; 
  String reset="\033[0m";  
  //ARRAY
  for(x = 0; x < 4; x++) {
    for(y = 0; y < 3; y++) {
      cuadrante[x][y] = VACIO;
    }
  }
  //MINA
  int minaX = (int)(Math.random() * 5);
  int minaY = (int)(Math.random() * 4);
  cuadrante[minaX][minaY] = MINA;
  //TESORO
  int tesoroX;
  int tesoroY;
  do {
    tesoroX = (int)(Math.random() * 5);
    tesoroY = (int)(Math.random() * 4);
  } while ((minaX == tesoroX) && (minaY == tesoroY));
  cuadrante[tesoroX][tesoroY] = TESORO;
  //JUEGO
  System.out.println();
  System.out.println("💸  ¡BUSCA EL TESORO!  💸");
  System.out.println();
  boolean salir = false;
  String c = "";
  do {
    //CUADRANTE
    for(y = 3; y >= 0; y--) {
      System.out.print(blue + (y + 1) + reset + "|");
      for(x = 0; x < 5; x++) {
        if (cuadrante[x][y] == INTENTO) {
        System.out.print("❌");
        } else {
        System.out.print(" ");
        }
      }
      System.out.println();
    }
    System.out.println(" └──────────");
    System.out.println(green + "  1 2 3 4 5" + reset);
    //PIDE COORDENADAS
    System.out.println();
    do {
      System.out.print(green + "Coordenada x: " + reset);
    x = s.nextInt();
    System.out.print(blue + "Coordenada y: " + reset);
    y = s.nextInt();
    } while ((x < 0) || (x > 5) && (y < 0) || (y > 4));
    System.out.println();
    //COMPRUEBO MINA CERCA
    if ((minaX == x + 1) || (minaX == x - 1) || (minaY == y + 1) || (minaY == y - 1)) {
      System.out.println(red + "¡Cuidado! " + reset + " ¡Hay una mina cerca!\n");
    }
    //COMPRUEBO CUADRANTE
    switch(cuadrante[x][y]) {
      case VACIO:
        cuadrante[x][y] = INTENTO;
        break;
      case MINA:
        System.out.println("Lo siento, has perdido.\n");
        salir = true;
        break;
      case TESORO:
        System.out.println("¡Enhorabuena! ¡Has encontrado el tesoro!\n");
        salir = true;
        break;
      default:
    }
  } while (!salir);
  //PINTA CUADRANTE
  for(y = 3; y >= 0; y--) {
    System.out.print(blue + (y + 1) + reset + "|");
    for(x = 0; x < 5; x++) {
      switch(cuadrante[x][y]) {
        case VACIO:
          c = " ";
          break;
        case MINA:
          c = "💣";
          break;
        case TESORO:
          c = "💸";
          break;
        case INTENTO:
          c = "❌";
          break;
        default:
      }
      System.out.print(c);
      }
    System.out.println();
    }
    System.out.println(" └──────────");
    System.out.println(green + "  1 2 3 4 5" + reset);
  }
}
