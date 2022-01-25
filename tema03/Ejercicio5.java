package tema03;
/**
 * Tema 3
 * Ejercicio 5
 * Programa que calcule el área de un rectángulo.
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio5 {
  public static void main(String[] args) {
    
    System.out.println("---Calcular el área de un rectángulo---");
    
    String numero;
    System.out.print("Introduce un lado: ");
    numero = System.console().readLine();
    int lado1 = Integer.parseInt(numero);
    
    System.out.print("Introduce el otro lado: ");
    numero = System.console().readLine();
    int lado2 = Integer.parseInt(numero);
    
    int area = lado1*lado2;
    
    System.out.printf("El área del rectángulo es: " + area);
    
  }
}
