package tema03;
/**
 * Tema 3
 * Ejercicio 10
 * Programa que convierte MB en kB.
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio10 {
  public static void main(String[] args) {
    
    System.out.println("---Convertir de MB a kB y a kiB---");
    
    System.out.print("Introduce los megabytes a convertir: ");
    int megas = Integer.parseInt(System.console().readLine());
    int kB = megas * 1000;
    int kiB = megas * 1024;
    
    System.out.println("El resultado es: " + kB + " kB y " + kiB + " kiB");
  }
}
