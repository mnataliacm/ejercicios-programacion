package tema05.del41_50;
/**
 * Tema 5
 * Ejercicio 46
 * Programa que pinta un rectangulo con *. Pedir alto y ancho.
 * Deben ser mayor o igual a 2.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio46 {
  public static void main(String[] args) {

    System.out.println("___Programa que pinta un rectángulo___");
    System.out.print("Introduce la altura del rectángulo (mínimo 2): ");
    int alto = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el ancho del rectángulo (mínimo 2): ");
    int ancho = Integer.parseInt(System.console().readLine());
    //comprobar números
    if ((alto < 2) || (ancho < 2)) {
      System.out.println("Los números deben ser mayor o igual a 2");
      System.out.print("Introduce la altura del rectángulo (mínimo 2): ");
      alto = Integer.parseInt(System.console().readLine());
      System.out.print("Introduce el ancho del rectángulo (mínimo 2): ");
      ancho = Integer.parseInt(System.console().readLine());
    }
    //parte superior
    for (int a = 0; a < ancho; a++) {
      System.out.print("* ");
    }
    System.out.println();
    //parte central
    for (int h = 0; h < alto / 2 + 1; h++) {
      System.out.print("*");
      for (int i = 1; i < (ancho * 2 - 2); i++) {
        System.out.print(" ");
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

