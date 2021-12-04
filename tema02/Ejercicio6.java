/**
 * Tema 2
 * Ejercicio 6
 * Programa que calcule el total de una factura a partir de la base imponible (sin IVA)
 * Base Imponible almacenada en variable.
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio6 {
  public static void main(String[] args) {
    
    double baseImponible = 575;
    double iva = 0.21;
    double totalIva = baseImponible * iva;
    double factura = baseImponible + totalIva;
    
        
    System.out.println(" El total de la factura es: "+ baseImponible +" + "+ totalIva +" = "+ factura);
    
  }
}
