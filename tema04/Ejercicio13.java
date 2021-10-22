/**
 * Tema 4
 * Ejercicio 13
 * Programa que ordene 3 números enteros introducidos por teclado.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio13 {
  public static void main(String[] args) {
    
    System.out.println("__Programa que ordena de menor a mayor 3 números__");
    System.out.print("Introduce el primer número: ");
    int num1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el segundo número: ");
    int num2 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el tercer número: ");
    int num3 = Integer.parseInt(System.console().readLine());
    
    if ((num1 > num2) && (num2 > num3)) {
      System.out.print("Los números ordenados: " + num3 +" "+ num2 +" "+ num1);
    } else if ((num1 > num3) && (num3 > num2)) {
      System.out.print("Los números ordenados: " + num2 +" "+ num3 +" "+ num1);
    } else if ((num2 > num1) && (num1 > num3)) {
      System.out.print("Los números ordenados: " + num3 +" "+ num1 +" "+ num2);
    } else if ((num2 > num3) && (num3 > num1)) {
      System.out.print("Los números ordenados: " + num1 +" "+ num3 +" "+ num2);
    } else if ((num3 > num1) && (num1 > num2)) {
      System.out.print("Los números ordenados: " + num2 +" "+ num1 +" "+ num3);
    } else if ((num3 > num2) && (num2 > num1)) {
      System.out.print("Los números ordenados: " + num1 +" "+ num2 +" "+ num3);
    }
    
  }
}
