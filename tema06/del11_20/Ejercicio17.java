/**
 * Tema 6
 * Ejercicio 17
 * Programa que pinta una pecera con un pececito dentro
 * Pedir alto y ancho de la pecera
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio17 {
  public static void main(String[] args) {

    System.out.println("___Programa que pinta pecera con pez___");
    System.out.print("Introduce la altura del rectángulo: ");
    int alto = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el ancho del rectángulo: ");
    int ancho = Integer.parseInt(System.console().readLine());
    //variables
    int pez1 = 1;
    int pez2 = 1;
    String pez = "🐠";
    System.out.println();
      pez1 = (int)(Math.random() * ancho + 1);
      pez2 = (int)(Math.random() * alto + 1);  
    System.out.println(pez1 + " " + pez2);
    //parte superior
    for (int a = 0; a < ancho; a++) {
      System.out.print("* ");
    }
    System.out.println();
    //parte central
    for (int h = 1; h < alto / 2 + 2; h++) {
      System.out.print("*");
      for (int i = 1; i < (ancho * 2 - 2); i++) {
        if ((pez1 == i) && (pez2 == h)) {
          System.out.print(pez + " ");
          i += 2;
        } else {
          System.out.print(" ");
        }
      }
      System.out.print("*");
      System.out.println();
    }
    //parte inferior
    for (int b = 0; b < ancho; b++) {
      System.out.print("* ");
    }
    System.out.println();
  }
}

