/**
 * Tema 5
 * Ejercicio 68
 * Programa que pide un número y luego lo "disloque"
 * Si el dígito es par le suma 1
 * Si es impar le resta 1
 * Usar long para admitir números largos
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio68 {
  public static void main(String[] args) {

    System.out.println("___Programa que 'disloca' el número dado___");
    System.out.print("Introduce un número: ");
    long numero = Long.parseLong(System.console().readLine());
    //variables
    long num = numero;
    long resultado = 0;
    int digito = 0;
    int nuevoDigito = 0;
    int conteo = 0;
    //comprobar dígitos pares
    while (num > 0) {
      digito = (int) num % 10;
      if (digito % 2 == 0) {
        nuevoDigito = digito + 1;
      } else {
        nuevoDigito = digito - 1;
      }
      resultado = (long) (nuevoDigito * Math.pow(10, conteo) + resultado);
      num /= 10;
      conteo++;
    }
    System.out.println();
    System.out.println("Dislocando el " + numero + " sale el " + resultado);
  }
}

