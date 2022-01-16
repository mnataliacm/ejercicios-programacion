package tema08;

import java.util.Scanner;

/**
 * Tema 8
 * 
 * Ejercicio 17
 * Programa que pase de binario a decimal
 *
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio17 {
  public static void main(String[] args) {

    //variables
    Scanner s = new Scanner(System.in);
    String binario;
    long decimal = 0;
    //programa
    System.out.println("CONVERSOR BINARIO-DECIMAL");
    System.out.print("Introduce el número binario: ");
    binario = s.nextLine();
    decimal = binarioDecimal(binario);
    System.out.println("Convertido a decimal es: " + decimal);
    System.out.println();
  }
  
  public static long binarioDecimal(String binario) {
    return Long.parseLong(binario, 2);
  }
}
  
