/**
 * Tema 5
 * Ejercicio 33
 * Programa que pinta la letra U con asteriscos
 * Pedir altura. 
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio33 {
  public static void main(String[] args) {

    System.out.println("___Programa que pinta una U___");
    System.out.print("Introduce la altura: ");
    int altura = Integer.parseInt(System.console().readLine());
    int linea = 0;
    String caracter = "*";
    //cuerpo U
    for (linea = 2; linea <= altura; linea++) {
      System.out.println();
      System.out.print(" ");
      System.out.print(caracter);
      for (int espacio = 0; espacio <= altura + 1; espacio++) { 
        System.out.print(" ");
      }
      System.out.print(caracter);
    }
    System.out.println();
    //base U
    System.out.print(" ");

    for (int dibujo = 1; dibujo <= (linea / 2); dibujo++) {
        System.out.print(" " + caracter + " ");
    }
    System.out.println();
  }
}

