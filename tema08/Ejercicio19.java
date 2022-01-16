package tema08;
import java.util.Scanner;

/**
 * Tema 8
 *
 * Ejercicio 18 Conversor entre todas las bases: decimal, binario, hexadecimal y
 * octal
 *
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio19 {

  public static void main(String[] args) {

    //variables
    Scanner s = new Scanner(System.in);
    String numeroString = "";
    long numero = 0;
    String resultado = "";
    int base = 0;
    //programa
    System.out.println("           CONVERSOR           ");
    System.out.println("********************************");
    System.out.println("¿Que conversión quieres hacer?");
    System.out.println("1. Decimal a Binario");
    System.out.println("2. Decimal a Hexadecimal");
    System.out.println("3. Decimal a Octal");
    System.out.println("4. Binario a Decimal");
    System.out.println("5. Binario a Hexadecimal");
    System.out.println("6. Binario a Octal");
    System.out.println("7. Hexadecimal a Decimal");
    System.out.println("8. Hexadecimal a Binario");
    System.out.println("9. Hexadecimal a Octal");
    System.out.println("10. Octal a Decimal");
    System.out.println("11. Octal a Binario");
    System.out.println("12. Octal a Hexadecimal");  
    System.out.println("********************************");
    System.out.print("Elije la opcion: ");
    base = s.nextInt();
    System.out.print("Introduce el número a convertir: ");
    if (base < 7 && base > 9) {
      numeroString = s.nextLine();
    } else {
      numero = s.nextLong();
    }
    switch (base) {
      case 1:
        resultado = Long.toString(decimalBinario(numero));
        break;
      case 2:
        resultado = binarioHexadecimal(decimalBinario(numero));
        break;
      case 3:
        resultado = Long.toString(binarioOctal(decimalBinario(numero)));
        break;
      case 4:
        resultado = Long.toString(binarioDecimal(numero));
        break;
      case 5:
        resultado = binarioHexadecimal(numero);
        break;
      case 6:
        resultado = Long.toString(binarioOctal(numero));
        break;
      case 7:
        resultado = Long.toString(binarioDecimal(hexadecimalBinario(numeroString)));
        break;
      case 8:
        resultado = Long.toString(hexadecimalBinario(numeroString));
        break;
      case 9:
        resultado = Long.toString(binarioOctal(hexadecimalBinario(numeroString)));
        break;
      case 10:
       resultado = Long.toString(binarioDecimal(octalBinario(numero)));
        break;
      case 11:
        resultado = Long.toString(octalBinario(numero));
        break;
      case 12:
        resultado = binarioHexadecimal(octalBinario(numero));
        break;
      default:
        break;
    }
    System.out.println("El resultado es: " + resultado);
  }
  //FUNCIONES DE CONVERSION
  // 1 BINARIO A OCTAL
  /**
   * Pasa un número binario a octal.
   * 
   * @param binario número entero en binario
   * @return        número inicial pasado a octal
   */
  public static long binarioOctal(long binario) {
    long octal = 1;  
    while (binario > 0) {
      octal = octal * 10 + (binarioDecimal(binario % 1000));
      binario = binario / 1000;
    }  
    octal = Ejercicio01_14.pegaPorDetras(octal, 1);
    octal = Ejercicio01_14.voltea(octal);
    octal = Ejercicio01_14.quitaPorDetras(octal, 1);
    octal = Ejercicio01_14.quitaPorDelante(octal, 1);  
    return octal;
  }
  // 2 BINARIO A DECIMAL
  /**
   * Pasa un número binario a decimal.
   * 
   * @param binario número entero en binario
   * @return        número inicial pasado a decimal
   */
  public static long binarioDecimal(long binario) {
    long decimal = 0; 
    int bits = Ejercicio01_14.digitos(binario);   
    for(int i = 0; i < bits; i++) {
      decimal += Ejercicio01_14.digitoN(binario, bits - i - 1) * Ejercicio01_14.potencia(2, i);
    }      
    return decimal;
  }
  // 3 BINARIO A HEXADECIMAL
  /**
   * Pasa un número binario a hexadecimal.
   * 
   * @param binario número entero en binario
   * @return        número inicial pasado a hexadecimal
   */
   public static String binarioHexadecimal(long binario) {
    String hexadecimal = "";
    String digitosHexa = "0123456789ABCDEF";  
    while (binario > 0) {
      hexadecimal = digitosHexa.charAt((int)binarioDecimal(binario % 10000)) + hexadecimal;
      binario = binario / 10000;
    }     
    return hexadecimal;
  }
  // 4 OCTAL A BINARIO
  /**
   * Pasa un número octal a binario.
   * 
   * @param octal número entero en octal
   * @return      número inicial pasado a binario
   */
  public static long octalBinario(long octal) {
    long binario = 0; 
    for (int i = 0; i < Ejercicio01_14.digitos(octal); i++) {
      binario = binario * 1000 + decimalBinario(Ejercicio01_14.digitoN(octal, i));
    }    
    return binario;
  }
  // 5 DECIMAL A BINARIO
  /**
   * Pasa un número decimal a binario.
   * 
   * @param decimal número entero en decimal
   * @return      número inicial pasado a binario
   */
  public static long decimalBinario(long decimal) {
    if (decimal == 0) {
      return 0;
    }     
    long binario = 1;    
    while (decimal > 1) {
      binario = Ejercicio01_14.pegaPorDetras(binario, (int)decimal % 2);
      decimal = decimal / 2;
    }
    binario = Ejercicio01_14.pegaPorDetras(binario, 1);
    binario = Ejercicio01_14.voltea(binario);
    binario = Ejercicio01_14.quitaPorDetras(binario, 1);  
    return binario;
  }
  // 6 HEXADECIMAL A BINARIO
  /**
   * Pasa un número hexadecimal (en base 10) a binario (base 2).
   * 
   * @param hexadecimal número entero en hexadecimal
   * @return            número inicial pasado a binario
   */
  public static long hexadecimalBinario(String hexadecimal) {
    String digitosHexa = "0123456789ABCDEF";
    long binario = 0;  
    for (int i = 0; i < hexadecimal.length(); i++) {
      binario = binario * 10000 + decimalBinario(digitosHexa.indexOf(hexadecimal.charAt(i)));
    }
    return binario;
  }
}
