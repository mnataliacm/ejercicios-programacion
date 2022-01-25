package tema05.del51_60;
/**
 * Tema 5
 * Ejercicio 56
 * Programa que pinta un triángulo con *
 * Pedir altura.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio56 {
  public static void main(String[] args) {

    System.out.println("___Programa que pinta un triángulo___");
    System.out.print("Introduce la altura del triángulo: ");
    int altura = Integer.parseInt(System.console().readLine());
    //Comprobar altura
    while (altura <= 0) {
      System.out.println("El número debe ser mayor a 0");
      System.out.print("Introduce la altura: ");
      altura = Integer.parseInt(System.console().readLine());
    }
    //pintar espacios
    for (int linea = altura; linea > 0; linea--) {
      for (int espacio = 1; espacio <= altura - linea; espacio++) { 
        System.out.print(" ");
      }
      //pintar triángulo
      for (int dibujo = 2; dibujo <= linea + 1; dibujo++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

