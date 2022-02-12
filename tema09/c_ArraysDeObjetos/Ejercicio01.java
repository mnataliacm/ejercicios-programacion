import java.util.Scanner;
/**
 * Tema 
 * Ejercicio 
 * 
 * Programa que
 * 
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejerciciox {
  
  public static void main(String[] args) {

    //variables
    Scanner s = new Scanner (System.in);
    int num = (int)(Math.random() * 4) + 1;
    int[] n = new int[10];
    int inicio = 0;
    int fin = 0;
    //programa
    System.out.println("Programa que ");
    System.out.println("Introduce ");
    for (int i = 0; i < n.length; i++) {
      n[i] = s.nextInt();
    }
    
    for (int i = 0; i < n.length; i++) {
      System.out.println(n[i]);
    }
    //comprobar datos introducidos
    do {
      System.out.print("Introduce el número inicial: ");
      inicio = Integer.parseInt(System.console().readLine());
      System.out.print("Introduce el número final: ");
      fin = Integer.parseInt(System.console().readLine());
      if ((inicio < 0) || (inicio > 9) || (fin < 0) || (fin > 9)) {
        System.out.println("El número inicial y final deben estar entre 0 y 9");
      } else if ((inicio > fin)) {
        System.out.println("El número inicial debe ser menor que número final");
      } 
    } while ((inicio > fin) || (inicio < 0) || (inicio > 9) && (fin < 0) || (fin > 9));   
    ////////////////
    switch (num) {
      case 1:

        break;
      case 2:

        break;
      case 3:

        break;
      case 4:

        break;
      case 5:

        break;
      case 6:

        break;
      default:
        break;
    }
    //
    System.out.println();
  }
}



