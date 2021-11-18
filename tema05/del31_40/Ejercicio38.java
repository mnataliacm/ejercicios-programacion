/**
 * Tema 5
 * Ejercicio 38
 * Programa que pinta un reloj de arena relleno de asteriscos.
 * Pedir la altura que debe ser impar mayor o igual a 3.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio38 {
  public static void main(String[] args) {

    System.out.println("___Programa que dibuja un reloj de arena___");
    System.out.print("Introduce la altura: ");
    int altura = Integer.parseInt(System.console().readLine());
    //variables
    String caracter = "*";
    //comprar impar y >= 3
    while ((altura < 3) || (altura % 2 == 0)) {
      System.out.println("El número debe ser impar e igual o mayor que 3");
      System.out.print("Introduce la altura: ");
      altura = Integer.parseInt(System.console().readLine());
    }
    //espacios arriba - izquierda
    System.out.println();
    for (int linea = 0; linea <= altura; linea++) {
      for (int espacio = 0; espacio <= altura; espacio++) {
        System.out.print(" ");
      }
      //parte superior reloj  
      for (int dibujo = 1; dibujo <= (linea * 2) + 1; dibujo++) {
        System.out.print(caracter);
      }
      System.out.println();
    }
    //espacios abajo - izquierda
    System.out.println();
    for (int linea = 0; linea <= altura; linea++) {
      for (int espacio = 0; espacio <= altura - linea; espacio++) {
        System.out.print(" ");
      }
      //parte inferior reloj  
      for (int dibujo = 1; dibujo <= (linea * 2) - 1; dibujo++) {
        System.out.print(caracter);
      }
      System.out.println();
    }
    System.out.print("");
    System.out.print("");
  }
}

