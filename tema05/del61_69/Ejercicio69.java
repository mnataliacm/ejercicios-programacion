/**
 * Tema 5
 * Ejercicio 69
 * Programa que pinta una pirámide maya.
 * Pirámide normal pero por el centro se alterna al pintar la lineas.
 * Terraza 6 *, cada linea añade 4 *.
 * Pedir altura debe ser entero >= 3.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio69 {
  public static void main(String[] args) {

    System.out.println("___Pirámide MAYA___");
    System.out.print("Introduce la altura (entero >= 3): ");
    int altura = Integer.parseInt(System.console().readLine());
    //variables
    int planta = 1;
    int longitud = 1;
    int espacio = altura - 1;
    System.out.println();
    while (planta <= altura) {
      //espacios izquierda
      for (int i = 0; i < espacio; i++) { 
        System.out.print(" "); 
      }
      //dibujo izquierda
      for (int i = 0; i < longitud / 2; i++) {
        System.out.print("*");
      }
      //centro
      if (planta % 2 == 1) {
        System.out.print("****");
      } else {
        System.out.print("    ");
      }
      //dibujo derecha
      for (int i = 0; i < longitud / 2; i++) {
        System.out.print("*");
      }
      System.out.println();
      planta++;
      espacio--;
      longitud += 2;
    }
  }
}

