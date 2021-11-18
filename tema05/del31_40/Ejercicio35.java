/**
 * Tema 5
 * Ejercicio 35
 * Programa que pinta X con asteriscos. Pedir la altura
 * Comprobar que numero sea impar y mayor que 3, msj error.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio35 {
  public static void main(String[] args) {

    System.out.println("___Programa que pinta una X___");
    System.out.print("Introduce la altura: ");
    int altura = Integer.parseInt(System.console().readLine());

    int linea = 1;

    while ((altura < 3) || (altura % 2 == 0)){
      System.out.println("El número debe ser impar y mayor a 3");
      System.out.print("Introduce la altura: ");
      altura = Integer.parseInt(System.console().readLine());
    }
    //parte superior espacios
    for (linea = 3; linea <= altura; linea++) {
      System.out.println();
      for (int espacio = 0; espacio <= altura - linea; espacio++) { 
        System.out.print(" ");
      }
    }
    System.out.println();
    //parte superior dibujo
    System.out.print("*");
    for (linea = 3; linea <= altura; linea++) {
      for (int espacio = 0; espacio <= altura - linea; espacio++) { 
        System.out.print(" ");
      }
    }
    System.out.print("*");
    System.out.println();
    //centro dibujo
    for (linea = 3; linea <= altura; linea++) {
      
      for (int espacio = 0; espacio <= (altura * 2) - 1; espacio++) { 
        System.out.print(" ");
      }
    }
    System.out.print("*");
    System.out.println();



    // if (altura == 3) {
    //   System.out.println(" * * ");
    //   System.out.println("  *  ");
    //   System.out.println(" * * ");
    // } else {
    //   System.out.println();
    //   System.out.print(" *");
    //   for (int espacio = 0; espacio <= altura - linea; espacio++) { 
    //     System.out.print(" ");
    //   }
    //   System.out.print("*");
    //   //cuerpo pirámide
    //   for (linea = 1; linea <= altura; linea++) {
    //     System.out.println();
    //     for (int espacio = 0; espacio <= altura - linea; espacio++) { 
    //       System.out.print(" ");
    //     }
    //     System.out.print("*");
    //     for (int hueco = 1; hueco <= (linea) ; hueco++) { 
    //       System.out.print(" ");
    //     }
    //     System.out.print("*");
    //   }
    //   System.out.println();
    //   //base pirámide
    //   for (int dibujo = 1; dibujo <= (linea) ; dibujo++) {
    //       System.out.print("*");
    //   }
    // }
  System.out.println();
  }
}

