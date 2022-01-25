package tema04;
/**
 * Tema 4
 * Ejercicio 14 
 * Programa que diga si un numero introducido es par y/o divisible entre 5.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio14 {
  public static void main(String[] args) {
    
    System.out.println("___Programa que dice si un número es par y/o divisible entre 5___");
    System.out.print("Introduce un número: ");
    int num = Integer.parseInt(System.console().readLine());
    
    int par = (num%2);
    int dividir = (num%5);
    
    if ((par == 0) && (dividir == 0)){
      System.out.print("El número es par y divisible entre 5.");
    } else if (par == 0) {
      System.out.print("El número es par pero no divisible entre 5");
    } else if (dividir == 0) {
      System.out.print("El número no es par pero si divisible entre 5");
    } else {
      System.out.print("El número ni es par ni divisible entre 5");
    }
      
  }
}
