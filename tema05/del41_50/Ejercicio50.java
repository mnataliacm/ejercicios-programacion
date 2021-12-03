/**
 * Tema 5
 * Ejercicio 50
 * Programa que realiza el diseño de una empresa. Debe mostrar un 155 con *. Se pedira la altura y los espacios que habrá entre los números.
 * Altura minima 5. El ancho es siempre igual.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio50 {
  public static void main(String[] args) {

    System.out.println("___Programa que dibuja un 155___");
    System.out.print("Introduce la altura (mínimo 5): ");
    int altura = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el espacio entre números (mínimo 1): ");
    int espacio = Integer.parseInt(System.console().readLine());
    //comprobar números
    while ((altura < 5) || (espacio < 1)) {
      System.out.println("Los datos introducidos no son correctos, vuelve a intentar.");
      System.out.print("Introduce la altura (mínimo 5): ");
      altura = Integer.parseInt(System.console().readLine());
      System.out.print("Introduce el espacio entre números (mínimo 1): ");
      espacio = Integer.parseInt(System.console().readLine());
    } 
    //variables
    int conteo = 1;
    //linea 1
    System.out.println();
    while (conteo < 2) {
      System.out.print("*");
      for (int i = 0; i < espacio; i++) {
        System.out.print(" ");
      }
      System.out.print("****");
      for (int i = 0; i < espacio; i++) {
        System.out.print(" ");
      }
      System.out.print("****");
      conteo++;
    }
    //linea 2
    System.out.println();
    conteo = 1;
    while (conteo < 2) {
      System.out.print("*");
      for (int i = 0; i < espacio; i++) {
        System.out.print(" ");
      }
      System.out.print("*");
      for (int i = 0; i < espacio + 3; i++) {
        System.out.print(" ");
      }
      System.out.print("*");
      conteo++;
    }
    //linea 3
    conteo = 1;
    System.out.println();
    while (conteo < 2) {
      System.out.print("*");
      for (int i = 0; i < espacio; i++) {
        System.out.print(" ");
      }
      System.out.print("****");
      for (int i = 0; i < espacio; i++) {
        System.out.print(" ");
      }
      System.out.print("****");
      conteo++;
    }
    //lineas que marca la altura
    conteo = 1;
    System.out.println();
    while (conteo < altura - 3) {
      System.out.print("*");
      for (int i = 0; i < espacio + 3; i++) {
        System.out.print(" ");
      }
      System.out.print("*");
      for (int i = 0; i < espacio + 3; i++) {
        System.out.print(" ");
      }
      System.out.println("*");
      conteo++;
    }
    //última linea
    conteo = 1;
    while (conteo < 2) {
      System.out.print("*");
      for (int i = 0; i < espacio; i++) {
        System.out.print(" ");
      }
      System.out.print("****");
      for (int i = 0; i < espacio; i++) {
        System.out.print(" ");
      }
      System.out.print("****");
      conteo++;
    }


    System.out.println("");
    
    //int palo = (int)(Math.random() * 4) + 1;
    // int numero = Integer.parseInt(System.console().readLine());

  }
}

