/**
 * Tema 3
 * Ejercicio 7
 * Programa que calcule el total de una factura.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio7 {
  public static void main(String[] args) {
    
    System.out.println("---Calcular el total de la factura---");
    
    String numero;
    System.out.print(" Introduce la base imponible: ");
    numero = System.console().readLine();
    int base = Integer.parseInt(numero);
    
    double calculoIva = (base*0.21);
    double factura = (base+calculoIva);
    
    System.out.println(" El IVA es : 21% \n El total de la factura es: " + factura);
    
  }
}
