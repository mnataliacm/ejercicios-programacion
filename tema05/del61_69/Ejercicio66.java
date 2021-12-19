/**
 * Tema 5
 * Ejercicio 66
 * Programa que pinta señal para desviar el trafico a la derecha.
 * Pedir altura debe ser impar y >= 3.
 * Separación entre flechas es 4 espacios.
 * Mensaje de error
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio66 {
  public static void main(String[] args) {

    System.out.println("___Flecha para desviar tráfico a la derecha___");
    System.out.println();
    // System.out.print("Introduce la altura (impar mayor o igual a 3): ");
    // int altura = Integer.parseInt(System.console().readLine());
    //comprobacion impar >= 3
    //variables
    int altura = 1;
    int espacio = 4;
    String caracter = "\033[31m*\033[0m";
    do {
      System.out.println();
      if ((altura < 3) || (altura % 2 == 0)) {
        System.out.println("La altura introducida no es impar mayor o igual a 3. Vuelve a intentar.");
      }
      System.out.print("Introduce la altura (impar mayor o igual a 3): ");
      altura = Integer.parseInt(System.console().readLine());
    } while ((altura < 3) || (altura % 2 == 0));
    
    System.out.println();
    for (int i = 0; i < altura; i++) {
      //parte superior y centro
      if (i <= (altura / 2)) {
        for (int j = i; j > 0; j--) {
        System.out.print(" ");
        }
        System.out.print(caracter);
        for (int j = 0; j < espacio; j++) {
          System.out.print(" ");
        }
        System.out.print(caracter);
        System.out.println();
      //parte inferior
      } else if (i > (altura / 2)) {
          for (int j = 1; j < altura - i; j++) {
            System.out.print(" ");
          }
          System.out.print(caracter);
          for (int j = 0; j < espacio; j++) {
            System.out.print(" ");
          }
          System.out.print(caracter);
          System.out.println();
      }
    }
    //ultima linea
    // System.out.print(caracter);
    //   for (int j = 0; j < espacio; j++) {
    //     System.out.print(" ");
    //   }
    //   System.out.print(caracter);  
    System.out.println();
  }
}

