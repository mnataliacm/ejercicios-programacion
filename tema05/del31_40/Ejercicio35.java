package tema05.del31_40;
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
    //comprobar numero impar >= 3
    while ((altura < 3) || (altura % 2 == 0)){
      System.out.println("El número debe ser impar y mayor a 3");
      System.out.print("Introduce la altura: ");
      altura = Integer.parseInt(System.console().readLine());
    }
    //variables
    int linea = 0;
    String caracter = "*";
    altura = (altura / 2) + 1;
    //parte de arriba
    System.out.println();
    for (linea = altura; linea > 1; linea--) {
      for (int espacio = 0; espacio < altura - linea; espacio++) { 
        System.out.print(" ");
      }
      System.out.print(caracter);
      for (int dibujo = 2; dibujo <= (linea * 2) - 2; dibujo++) {
        System.out.print(" ");
      }
      System.out.print(caracter);
      System.out.println();
    }
    //parte de centro
      for (int espacio = 1; espacio <= altura - linea; espacio++) {
        System.out.print(" ");
      }
      System.out.println(caracter); 
    //parte de abajo
    for (linea = 1; linea < altura; linea++) {
      for (int espacio = 2; espacio <= altura - linea; espacio++) {
        System.out.print(" ");
      }
      System.out.print(caracter); 
      for (int dibujo = 1; dibujo <= (linea * 2) - 1; dibujo++) {
        System.out.print(" ");
      }
      System.out.print(caracter);
      System.out.println();
    }
  }
}

