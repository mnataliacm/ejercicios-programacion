package tema08;

import java.util.Scanner;

public class Ejercicio41 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce el carácter para dibujar: ");
    char caracter = s.next().charAt(0);
    System.out.print("Introduce la altura: ");
    int repeticiones = s.nextInt();
    System.out.println();
    for (int i = repeticiones; i > 0; i--) {
      linea(caracter, i);
      System.out.println();
    }
    System.out.println();
    s.close();
  }
  public static void linea(char c, int r) {
    for (int i = 0; i < r; i++) {
      System.out.print(c);
    }
  }
}
