/**
 * Tema 3
 * Ejercicio 2
 * Conversor de euros a pesetas.
 * k
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio2 {
  public static void main(String[] args) {
    
    System.out.println("---Conversor de Euros a Pesetas---");
    
    String euros;
    System.out.print("Introduce los Euros: ");
    euros = System.console().readLine();
    double conversor = Integer.parseInt(euros);
    double pesetas = conversor*166.386;
    
    System.out.printf("La cantidad de: " + euros + " euros son: %.2f", pesetas," pesetas");
    
  }
}
