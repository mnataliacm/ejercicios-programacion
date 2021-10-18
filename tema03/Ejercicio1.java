/**
 * Tema 3
 * Ejercicio 1
 * Programa que pide dos números y luego muestra resultado multiplicados.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio1 {
  public static void main(String[] args) {
    
    String numero;
    
    System.out.print("Introduce un número: ");
    numero = System.console().readLine();
    int numero1 = Integer.parseInt(numero);
    
    System.out.print("Introduce otro número: ");
    numero = System.console().readLine();
    int numero2 = Integer.parseInt(numero);
    
    System.out.print(numero1 * numero2);
    
  }
}
