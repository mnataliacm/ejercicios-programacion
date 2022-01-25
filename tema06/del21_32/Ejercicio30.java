package tema06.del21_32;
/**
 * Tema 6
 * Ejercicio 30
 * Programa que pinta una pecera con un pececito &, un caballito de mar $ y una caracola @.
 * Pedir alto y ancho de la pecera
 * Lo animales no pueden coincidir.
 * 
 * 🐠
 * @author Natalia Castillo Muñoz
 * 
 */
public class Ejercicio30 {
  public static void main(String[] args) {

    // System.out.println("___Programa que pinta pecera con pez___");
    // System.out.print("Introduce la altura del rectángulo: ");
    // int alto = Integer.parseInt(System.console().readLine());
    // System.out.print("Introduce el ancho del rectángulo: ");
    // int ancho = Integer.parseInt(System.console().readLine());
    int alto = 5;
    int ancho = 10;
    //variables
    String pez = "&";
    String caballito = "$";
    String caracola = "@";
    int posicion = 0;
    int posicionPez = 0;
    int posicionCaballito = 0;
    int posicionCaracola = 0;
    System.out.println();
    //posición mascotas
    do {
      posicionPez = (int)(Math.random() * (alto - 2) * (ancho - 2));
      posicionCaballito = (int)(Math.random() * (alto - 2) * (ancho - 2));
      posicionCaracola = (int)(Math.random() * (alto - 2) * (ancho - 2));
    } while ((posicionPez == posicionCaballito) || (posicionPez == posicionCaracola) || (posicionCaballito == posicionCaracola));
    //parte superior
    for (int a = 0; a < ancho; a++) {
      System.out.print("*");
    }
    System.out.println();
    //parte central
    for (int h = 2; h < alto; h++) {
      System.out.print("*");
      for (int i = 2; i < ancho; i++) {
        if (posicion == posicionPez) {
          System.out.print(pez);
        } else if (posicion == posicionCaballito) {
          System.out.print(caballito);
        } else if (posicion == posicionCaracola) {
          System.out.print(caracola);
        } else {
          System.out.print(" ");
        }
        posicion++;
      }
      System.out.print("*");
      System.out.println();
    }
    //parte inferior
    for (int b = 0; b < ancho; b++) {
      System.out.print("*");
    }
    System.out.println();
  }
}

