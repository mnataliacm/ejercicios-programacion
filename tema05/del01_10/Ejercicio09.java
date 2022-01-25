package tema05.del01_10;
/**
 * Tema 5
 * Ejercicio 9
 * Programa que cuenta números, la limitación la establece si usas int o long
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio09 {
  public static void main(String[] args) {

    System.out.println("___Programa que cuenta números___");
    System.out.print("Introduce un número para contar su dígitos: ");
    int numero = Integer.parseInt(System.console().readLine());

    int conteo = 0;

    while (numero != 0) {
      numero= numero/10;
      conteo++;
    }
    System.out.println("El número introducido tiene: " + conteo + " dígitos");
  }
} 

