/**
 * Tema 3
 * Ejercicio 6
 * Programa que calculo el área de un triángulo.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio6 {
  public static void main(String[] args) {
    
    System.out.println("---Calcular el área de un triángulo---");
    
    String numero;
    System.out.print("Introduce la base: ");
    numero = System.console().readLine();
    int base = Integer.parseInt(numero);
    
    System.out.print("Introduce la altura: ");
    numero = System.console().readLine();
    int altura = Integer.parseInt(numero);
    
    int area = (base*altura)/2;
    
    System.out.printf("El área del triángulo es: " + area);
    
  }
}
