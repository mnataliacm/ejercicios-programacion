/**
 * Tema 5
 * Ejercicio 40
 * Programa que pinta un rombo hueco de asteriscos.
 * Pedir altura, comprobar que es impar mayor o igual a 3.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio40 {
  public static void main(String[] args) {

    System.out.println("___Programa que pinta un rombo___");
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
    //pico arriba
    System.out.println();
    for (int espacio = 2; espacio <= altura - linea; espacio++) {
      System.out.print(" ");
      }
      System.out.println(caracter); 
    //parte de arriba
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
    //parte de abajo
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
    //pico de abajo
      for (int espacio = 1; espacio <= altura - linea; espacio++) {
        System.out.print(" ");
      }
      System.out.println(caracter); 
  }
}

