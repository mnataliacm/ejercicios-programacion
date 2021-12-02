/**
 * Tema 5
 * Ejercicio 47
 * Por el dia de la mujer tenemos que hacer un programa que pinta por pantalla un 8 usando la letra M.
 * Se pide la altura que debe ser impar mayor o igual a 5.
 * Ancho fijo a 6.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio47 {
  public static void main(String[] args) {

    System.out.println("___Programa que pinta un 8 con la M___");
    System.out.print("Introduce la altura (impar >= 5): ");
    int altura = Integer.parseInt(System.console().readLine());
    //comprobar número
    while ((altura < 5) || (altura % 2 == 0)) {
      System.out.println("El número introducido no es impar o no es mayor o igual a 5");
      System.out.print("Introduce la altura (impar >= 5): ");
      altura = Integer.parseInt(System.console().readLine());
    }
    int ancho = 6;
    System.out.println();
    //linea superior
    for (int a = 0; a < ancho; a++) {
      System.out.print("M");
    }
    System.out.println();
    //parte de arriba
    for (int h = 0; h < altura / 2 - 1; h++) {
      System.out.print("M");
      for (int i = 1; i < (ancho - 1); i++) {
        System.out.print(" ");
      }
      System.out.print("M");
      System.out.println();
    }
    //linea central
    for (int a = 0; a < ancho; a++) {
      System.out.print("M");
    }
    System.out.println();
    //parte de abajo
    for (int h = 0; h < altura / 2 - 1; h++) {
      System.out.print("M");
      for (int i = 1; i < (ancho - 1); i++) {
        System.out.print(" ");
      }
      System.out.print("M");
      System.out.println();
    }
    //linea inferior
    for (int b = 0; b < ancho; b++) {
      System.out.print("M");
    }
    System.out.println();
  }
}
