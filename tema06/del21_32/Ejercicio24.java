package tema06.del21_32;
/**
 * Tema 6
 * Ejercicio 24
 * 
 * Programa que pide un número y elije al azar uno de sus dígitos.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio24 {
  public static void main(String[] args) {

    System.out.println("___Programa que elije un dígito___");
    System.out.print("Introduce un número entero positivo: ");
    long numero = Integer.parseInt(System.console().readLine());
    int conteo = 0;
    long num = numero;
    //contar dígitos
    while (num > 0) {
      num = num / 10;
      conteo++;
    }
    int elije = (int)(Math.random() * conteo) +1;
    //mostrar dígito
    long resultado = (numero / (long) (Math.pow(10, conteo - elije))) % 10;
    System.out.println(resultado);
  }
}
