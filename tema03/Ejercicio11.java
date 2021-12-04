/**
 * Tema 3
 * Ejercicio 11
 * Programa que convierte de kB a MB y a MiB.
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio11 {
  public static void main(String[] args) {
    
    System.out.println("---Convertir de kB a MB y a MiB---");
    
    System.out.print("Introduce los kilobytes a convertir: ");
    double kilob = Double.parseDouble(System.console().readLine());
    double MB = kilob / 1000;
    double MiB = (double)kilob / 1024;
    
    System.out.println("El resultado es: " + MB + " MB y " + MiB + " MiB");
    
  }
}
