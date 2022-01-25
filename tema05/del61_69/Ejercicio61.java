package tema05.del61_69;
/**
 * Tema 5
 * Ejercicio 61
 * Programa que pinta por una V. Ancho = 3 *
 * Pedir la altura, minimo 3. Comprobar
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio61 {
  public static void main(String[] args) {

    System.out.println("___Programa que pinta una V___");
    System.out.print("Introduce la altura (mayor o igual a 3): ");
    int altura = Integer.parseInt(System.console().readLine());
    while (altura < 3) {
      System.out.println("La altura mínima es 3.");
      System.out.print("Introduce la altura: ");
      altura = Integer.parseInt(System.console().readLine());
    }
    //variables
    String dibujo = "\033[96m*\033[39;49m";
    int h = 1;
    System.out.println();
    //comprobar altura
    for (h = altura; h > 1; h--) {
      for (int i = 0; i < altura - h; i++) {
        System.out.print(" ");
      }
      //lado izquierdo
      for (int i = altura; i > 1; i--) {
        System.out.print(" ");
      }
      for (int i = 0; i < 3; i++) {
        System.out.print(dibujo);
      }
      for (int i = 1; i <= (h * 2) - 2; i++) {
        System.out.print(" ");
      }
      //lado derecho
      for (int i = 0; i < 3; i++) {
        System.out.print(dibujo);
      }
      System.out.println();
    }
    //base de la V
    for (int i = 1; i <= (altura * 2) - 2; i++) {
      System.out.print(" ");
    }
    for (int i = 0; i < 6; i++) {
      System.out.print(dibujo);
    }
    
    System.out.println();
  }
}

