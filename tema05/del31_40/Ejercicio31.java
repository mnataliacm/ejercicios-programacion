/**
 * Tema 5
 * Ejercicio 31
 * Programa que pinta una L hecha con *.
 * Se pedirá la altura y la base tendrá de tamaño la mitad +1 de la altura.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio31 {
  public static void main(String[] args) {

    System.out.println("___Programa que pinta una L___");
    System.out.print("Introduce la altura: ");
    int h = Integer.parseInt(System.console().readLine());
    System.out.println();
    for (int i = 1; i < h; i++) { 
      System.out.println("     *");
    }
    System.out.print("     ");
    int base = (h / 2)+1;
    for (int i = 0; i < base; i++) { 
      System.out.print("* ");
    }
    System.out.println();
  }
}

