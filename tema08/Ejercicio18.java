package tema08;

import java.util.Scanner;

/**
 * Tema 8
 * 
 * Ejercicio 18
 * Programa que pase de decimal a binario
 *
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio18 {
  public static void main(String[] args) {

    //variables
    Scanner s = new Scanner(System.in);
    String binario;
    long decimal = 0;
    //programa
    System.out.println("CONVERSOR DECIMAL-BINARIO");
    System.out.print("Introduce el número decimal: ");
    decimal = s.nextLong();
    binario = decimalBinario(decimal);
    System.out.println("Convertido a binario es: " + binario);
    System.out.println();
  }
  
  public static String decimalBinario(long decimal) {
    return Long.toBinaryString(decimal);
  }
}
  
