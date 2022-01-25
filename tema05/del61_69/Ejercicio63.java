package tema05.del61_69;
/**
 * Tema 5
 * Ejercicio 63
 * Programa que pinta dos piramides separadas por un espacio en la base.
 * Pedir 2 alturas.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio63 {
  public static void main(String[] args) {

    System.out.println("___Programa que pinta dos pirámides hechas con asteriscos___");
    System.out.print("Introduce la altura de la primera pirámide: ");
    int piramide1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce la altura de la primera pirámide: ");
    int piramide2 = Integer.parseInt(System.console().readLine());
    // variables
    String caracter = "*";
    int num1 = piramide1;
    int num2 = piramide2;
    int altura = 1;
    int espacios1 = piramide1 - 1;
    int espacios2 = piramide2 - 1;
    int base1 = piramide1 * 2 - 1;
    int base2 = piramide2 * 2 - 1;
    int asterisco1 = 1;
    int asterisco2 = 1;

    if (num1 > num2) {
      altura = num1;
    } else {
      altura = num2;
    }
    System.out.println();
    for (int i = altura; i > 0; i--) {
      // pirámide 1
      if (i > piramide1) {
        //si piramide 1 mas pequeña
        for (int j = 0; j <= base1; j++) {
          System.out.print(" ");
        }
      } else {
          //espacios delante piramide 1
          for (int j = 0; j < espacios1; j++) {
            System.out.print(" ");
          }
        // dibujo piramide1
        for (int j = 0; j < asterisco1; j++) {
          System.out.print(caracter);
        }
        // espacios detras piramide1
        for (int j = 0; j <= espacios1; j++) {
          System.out.print(" ");
        }
        espacios1--;
        asterisco1 += 2;
      }
      // piramide 2
      if (i > piramide2) {
        // piramide dos mas pequeña
        for (int j = 0; j < base2; j++) {
          System.out.print(" ");
        }
      } else {
        // espacios delante piramide 1
        for (int j = 0; j < espacios2; j++) {
          System.out.print(" ");
        }
        // piramide 1
        for (int j = 0; j < asterisco2; j++) {
          System.out.print("*");
        }
        // espacios detras piramide 1
        for (int j = 0; j <= espacios1; j++) {
          System.out.print(" ");
        }
        espacios2--;
        asterisco2 += 2;
      }
      System.out.println();
    }
  }
}

