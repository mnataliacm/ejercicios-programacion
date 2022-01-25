package tema06.del11_20;
/**
 * Tema 6
 * Ejercicio 17
 * Programa que pinta una pecera con un pececito dentro
 * Pedir alto y ancho de la pecera
 * 🐠
 * 
 * 
 * @author Natalia Castillo Muñoz
 * 
 */
public class Ejercicio17 {
  public static void main(String[] args) {

    System.out.println("___Programa que pinta pecera con pez___");
    System.out.print("Introduce la altura del rectángulo: ");
    int alto = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el ancho del rectángulo: ");
    int ancho = Integer.parseInt(System.console().readLine());
    //variables
    int pezAlto = 1;
    int pezAncho = 1;
    String pez = "&";
    System.out.println();
    //posición pez
    int aPez = (ancho * 2) - 2;
    int hPez = alto - 2;
    do {
      pezAlto = (int)(Math.random() * hPez);
    } while ((pezAlto < 2) || (pezAlto > alto));
    do {
      pezAncho = (int)(Math.random() * aPez);
    } while ((pezAncho < 2) || (pezAncho >= (ancho * 2) - 1));
     
    System.out.println(pezAlto + " " + pezAncho);

    //parte superior
    for (int a = 0; a < ancho; a++) {
      System.out.print("* ");
    }
    System.out.println();
    //parte central
    for (int h = 1; h < alto - 1; h++) {
      System.out.print("*");
      for (int i = (ancho * 2) - 2; i > 1; i--) {
        if ((pezAlto == h) && (pezAncho == i)) {
          System.out.print(pez);
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

