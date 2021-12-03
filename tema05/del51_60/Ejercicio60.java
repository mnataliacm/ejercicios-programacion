/**
 * Tema 5
 * Ejercicio 60
 * Programa que pinta por pantalla un par de calcetines para Papá Noël. 
 * Pedir altura, suponemos que será >=4. Solo varia su altura no el pie y el espacio que los separa.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio60 {
  public static void main(String[] args) {

    System.out.println("___Programa que pinta dos calcetines___");
    System.out.print("Introduce la altura de los calcetines (mayor o igual a 4): ");
    int altura = Integer.parseInt(System.console().readLine());
    //variables
    String dibujo = "\033[31m*\033[39;49m";
    System.out.println();
    //altura calcetines
    for (int h = 0; h < altura - 2; h++) {
      for (int i = 0; i < 3; i++) {
        System.out.print(dibujo);
      }
      for (int i = 0; i < 5; i++) {
        System.out.print(" ");
      }
      for (int i = 0; i < 3; i++) {
        System.out.print(dibujo);
      }
      System.out.println();
    }
    //pie calcetines
    for (int h = 0; h < 2; h++) {
      for (int i = 0; i < 6; i++) {
        System.out.print(dibujo);
      }
      for (int i = 0; i < 2; i++) {
        System.out.print(" ");
      }
      for (int i = 0; i < 6; i++) {
        System.out.print(dibujo);
      }
      System.out.println();
    }
  }
}

