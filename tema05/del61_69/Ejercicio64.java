/**
 * Tema 5
 * Ejercicio 64
 * Programa que pinta un rectángulo hueco de 6 caracteres de ancho por 3 de
 * alto.
 * Se muestra un menu que permita: agrandarlo, reducirlo o cambiar su
 * orientación.
 * Agrandar + 1 de ancho y de alto
 * Reducir - 1 de ancho y de alto
 * Orientación se cambian los valores.
 * Valor mínimo permitido alto y ancho es 2.
 * 
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio64 {
  public static void main(String[] args) {

    System.out.println("___Modifica el rectángulo___");
    System.out.println();
    //variables
    int num = 0;
    int ancho = 6;
    int alto = 3;
    do {
      //parte superior
      for (int a = 0; a < ancho; a++) {
        System.out.print("*");
      }
      System.out.println();
      //parte central
      for (int h = 2; h < alto; h++) {
        System.out.print("*");
        for (int i = 2; i < ancho; i++) {
          System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
      }
      //parte inferior
      for (int b = 0; b < ancho; b++) {
        System.out.print("*");
      }
      System.out.println();
      //menu
      System.out.println("--------------------------------------------");
      System.out.println("1. Agrandar");
      System.out.println("2. Reducir");
      System.out.println("3. Cambiar la orientación");
      System.out.println("4. Salir");
      System.out.println("--------------------------------------------");
      System.out.print(" Indique qué quiere hacer con el rectángulo: ");
      num = Integer.parseInt(System.console().readLine());
      switch (num) {
        case 1:
          ancho++;
          alto++;
          break;
        case 2:
          if ((ancho > 2) && (alto > 2)) {
            ancho--;
            alto--;
          } else {
            System.out.println("¡¡AVISO!!");
            System.out.println("El rectángulo no se puede encoger más.");
            System.out.println();
          }
          break;
        case 3:
          int voltea = ancho;
          ancho = alto;
          alto = voltea;
          break;
        default:
          break;
      }
    } while (num != 4);
    System.out.println();
  }
}
