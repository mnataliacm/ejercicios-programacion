package tema05.del41_50;
/**
 * Tema 5
 * Ejercicio 44
 * Programa que sea capaz de nsertar un dígito dentro de un número indicando su posición.
 * Pedir número, posicion y nuevo dígito
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio44 {
  public static void main(String[] args) {

    System.out.println("___Programa que introduce un dígito___");
    System.out.print("Introduce un número entero positivo: ");
    long numero = Integer.parseInt(System.console().readLine());
    System.out.print("Indica la posición del nuevo dígito: ");
    long posicion = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el dígito a insertar: ");
    long digito = Integer.parseInt(System.console().readLine());
    //variables 
    long num = numero;
    int conteo = 1;
    //contar dígitos
    do {
      num /= 10;
      conteo++;
    } while (num > 0);
    //cortar número
    long num1 = numero / (long)(Math.pow(10, conteo - posicion));
    long num2 = numero % (long)(Math.pow(10, conteo - posicion));
    System.out.println("El número que obtenemos es " + num1 + digito + num2);
  }
}

