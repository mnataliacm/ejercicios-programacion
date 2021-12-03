/**
 * Tema 5
 * Ejercicio 49
 * Programa que calcula el máximo, el mínimo y la media de una serie de números enteros positivos dados por teclado.
 * Teminar cuando se introduzca un primo que no se tendrá en cuenta. 
 * Mostrar también cuantos números se han introducido sin contar el primo.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio49 {
  public static void main(String[] args) {

    System.out.println("___Programa que calcula el máximo, mínimo y media de los números enteros positivos dados___");
    //variables
    int numero = 0;
    boolean primo;
    int conteo = 1;
    int max = 0;
    int min = 1;
    int media = 0;
    //pedir y comprobar numeros
    System.out.println("Introduce números enteros positivos. Terminará cuando el número sea primo: ");
    numero = Integer.parseInt(System.console().readLine());
    max = numero;
    min = numero;
    do {
      numero = Integer.parseInt(System.console().readLine());
        primo = true;
        for (int n = 2; n < numero; n++) {
          if (numero % n == 0){
            primo = false; 
          } 
        } 
      if (!primo) {
        media += numero;
        conteo++;
        if (numero > max) {
          max = numero;
        } else if (numero < min) {
          min = numero;
        }
      }
    } while ((numero > 1) && (!primo));
    System.out.println();
    System.out.println("Has introducido " + conteo + " números no primos");
    System.out.println("Número mayor: " + max);
    System.out.println("Número menor: " + min);
    System.out.println("La media del total es: " + (double)media / conteo);
  }
}

