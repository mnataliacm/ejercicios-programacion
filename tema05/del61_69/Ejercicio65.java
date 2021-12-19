/**
 * Tema 5
 * Ejercicio 65
 * Programa que pinta por pantalla una letra A.
 * Pedir altura y la fila en que aparece el palito horizontal
 * Fila debe ser mayor que 1 y menor que la altura total.
 * Mensaje de error.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio65 {
  public static void main(String[] args) {

    System.out.println();
    System.out.println("___Programa que pinta una A___");
    //variables
    int altura = 1;
    int fila = 1;
    int linea = 0;
    String caracter = "*";
    //pedir datos
    do {
      System.out.print("Introduzca la altura de la A (un número mayor o igual a 3): ");
      altura = Integer.parseInt(System.console().readLine());
      System.out.print("Introduzca la final donde quieres que vaya el palito horizontal ( entre 2 y 6): ");
      fila = Integer.parseInt(System.console().readLine());
      if ((altura < 3) && (fila < 2) || (fila > 6)) {
        System.out.println();
        System.out.println("Los datos introducidos son incorrectos, intentalo de nuevo.");
        System.out.println();
      }
    } while ((altura < 3) && (fila < 2) || (fila > 6));
    //espacios parte superior
    System.out.println();
    for (int espacio = 0; espacio < altura + 3; espacio++) { 
      System.out.print(" ");
    }
    //pico de la A
    System.out.print(caracter);
    //resto de la A
    for (linea = 0; linea <= altura; linea++) {
      System.out.println();
      for (int espacio = 1; espacio <= altura - linea + 2; espacio++) { 
        System.out.print(" ");
      }
      System.out.print(caracter);
      for (int hueco = 0; hueco <= (linea * 2); hueco++) { 
        System.out.print(" ");
      }
      System.out.print(caracter);
    }
    System.out.println();
    //espacios palito
    for (int espacio = 0; espacio < 2; espacio++) { 
      System.out.print(" ");
    }
    //palito horizontal
    for (int dibujo = 0; dibujo <= (linea * 2) ; dibujo++) {
        System.out.print(caracter);
    }
    //espacios parte inferior
    System.out.println();
    for (int espacio = 0; espacio < 2; espacio++) { 
      System.out.print(" ");
      //parte inferior
      for (int i = 0; i < 2; i++) {
        System.out.print(caracter);
        for (espacio = 1; espacio <= (linea * 2); espacio++) { 
          System.out.print(" ");
        }
        System.out.println(caracter);
      }
    }
    System.out.println();
  }
}

