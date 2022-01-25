package tema05.del51_60;
/**
 * Tema 5
 * Ejercicio 53
 * Programa que pinta un triángulo con *
 * Pedir altura.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio53 {
  public static void main(String[] args) {

    System.out.println("___Programa que pinta un triángulo___");
    System.out.println("Introduce la altura del triángulo: ");
    int altura = Integer.parseInt(System.console().readLine());
    //Comprobar altura
    while (altura <= 0) {
      System.out.println("El número debe ser mayor a 0");
      System.out.print("Introduce la altura: ");
      altura = Integer.parseInt(System.console().readLine());
    }
    //Pintar triángulo
    System.out.println();
    for (int linea = altura; linea >= 0; linea--) {
      for (int dibujo = 1; dibujo <= linea; dibujo++) {
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println();
  }
}

