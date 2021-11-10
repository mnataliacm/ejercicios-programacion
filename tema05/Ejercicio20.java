/**
 * Tema 5
 * Ejercicio 19
 * Programa que pinta una pirámide hueca por pantalla.
 * Pedir altura por teclado
 * Pedir carácter para dibujarla
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio20 {
  public static void main(String[] args) {

    int blanco = 0;
    int linea = 0;
    
    System.out.println("___Programa que pinta una pirámide___");
    System.out.print("Introduce la altura: ");
    int altura = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el carácter para dibujarla: ");
    String caracter = System.console().readLine();

    while (altura <= 0) {
      System.out.print("El número debe ser mayor a 0");
      System.out.print("Introduce la altura: ");
      altura = Integer.parseInt(System.console().readLine());
    }

    System.out.println();
    for (linea = 0; linea <= altura; linea++) {
      
      for (int espacio = 0; espacio <= altura - linea; espacio++) { 
        System.out.print(" ");
      }
      System.out.print(caracter);
      for (int hueco = 1; hueco <= (linea * 2) - 1; hueco++) { 
        System.out.print(" ");
      }
      System.out.print(caracter);
      System.out.println();
    }
    for (int dibujo = 1; dibujo <= (linea * 2) + 1; dibujo++) {
        System.out.print(caracter);
    }
    System.out.println();
  }
}
