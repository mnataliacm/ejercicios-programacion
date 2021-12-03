/**
 * Tema 5
 * Ejercicio 54
 * Programa que pinta un triángulo hueco con *
 * Pedir altura.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio54 {
  public static void main(String[] args) {

    System.out.println("___Programa que pinta un triángulo hueco___");
    System.out.print("Introduce la altura del triángulo: ");
    int altura = Integer.parseInt(System.console().readLine());
    //Comprobar altura
    while (altura <= 0) {
      System.out.println("El número debe ser mayor a 0");
      System.out.print("Introduce la altura: ");
      altura = Integer.parseInt(System.console().readLine());
    }
    //linea superior
    for (int dibujo = 1; dibujo <= altura; dibujo++) {
      System.out.print("*");
    }
    //Pintar triángulo hueco
    System.out.println();
    for (int linea = 3; linea <= altura; linea++) {
      System.out.print("*");
      for (int espacio = 1; espacio <= altura - linea; espacio++) {
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println();
    }
    //ultima linea
    System.out.print("*");
    System.out.println();
  }
}

