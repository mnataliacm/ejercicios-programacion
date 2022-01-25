package tema04;
/**
 * Tema 4
 * Ejercicio 2
 * Programa que pida una hora por teclado y muestre buenos días, tardes o noches según la hora. 
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    
    System.out.println("__Programa que indica la hora y te saluda__");
    System.out.print("Indica la hora (sin minutos) que es: ");
    
    int h = Integer.parseInt(System.console().readLine());
    
    if ((h >= 6) && (h <= 12)) {
      System.out.println("!!Buenos días!!");
    } else if ((h >= 13) && (h <= 20)) {
      System.out.println("!!Buenas tardes!!");
    } else if ((h >= 21) && (h <= 24)) {
      System.out.println("!!Buenas noches!!");
    } else if ((h >= 0) && (h <= 5)) {
      System.out.println("!!Buenas noches!!");
    } else {
      System.out.println("La hora indicada no es correcta, debe elegir entre 0 y 24");
    }
    
  }
}
