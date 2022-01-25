package tema03;
/**
 * Tema 3
 * Ejercicio 3
 * Conversor de pesetas a euros.
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio3 {
  public static void main(String[] args) {
    
    System.out.println("---Conversor de Euros a Pesetas---");
    
    String pesetas;
    System.out.print("Introduce las Pesetas: ");
    pesetas = System.console().readLine();
    double conversor = Integer.parseInt(pesetas);
    double euros = conversor/166.386;
    
    System.out.printf("La cantidad de: " + pesetas + " pesetas son: %.2f", euros, " euros");
    
    
  }
}
