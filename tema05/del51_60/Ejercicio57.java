package tema05.del51_60;
/**
 * Tema 5
 * Ejercicio 57
 * Programa que pinta un triángulo con *
 * Pedir altura.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio57 {
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
    System.out.println();
    //Pintar espacios
    for (int linea = altura - 1; linea > 1; linea--) {
      for (int espacio = 1; espacio <= altura - linea; espacio++) { 
        System.out.print(" ");
      }
      //pintar triangulo hueco
        System.out.print("*");
      for (int dibujo = 2; dibujo <= linea - 1; dibujo++) {
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println();
    }
    //ultima linea
    for (int i = 1; i < altura; i++) {
      System.out.print(" ");
    }
    System.out.print("*");
    System.out.println();
  }
}

