package tema05.del01_10;
/**
 * Tema 5
 * Ejercicio 10
 * Programa que calcula la media de un conjunto de números positivos dados por teclado. Se para al introducir un negativo.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio10 {
  public static void main(String[] args) {

    System.out.println("___Calcular la media de varios números (parar con -X)___");
    
    int numero = 0;
    int suma = 0;
    int conteo = 0;

    System.out.println("Introduce numeros para calcular media: ");
      numero = Integer.parseInt(System.console().readLine());
      suma = numero;

    while (numero > 0) {
      numero = Integer.parseInt(System.console().readLine());
      suma += numero;
      conteo++;
    }
    System.out.println("Números introducidos: " + conteo + " La suma es: "+ suma + " y la media es: " + suma / conteo);
  }
}

