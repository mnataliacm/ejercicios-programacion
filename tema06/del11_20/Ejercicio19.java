package tema06.del11_20;
/**
 * Tema 6
 * Ejercicio 19
 * Programa que 
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio19 {
  public static void main(String[] args) {

    System.out.println("___Programa que muestra 50 números aleatorios___");
    System.out.println("___Muestra el mayor par, el menor impar y la media___");
    //variables
    int numero = 0;
    int mayor = 0;
    int menor = 0;
    int media = 0;
    for (int i = 0; i < 50; i++) {
      numero = (int)(Math.random() * 201 - 100);
      System.out.print(numero + " ");
      if ((numero % 2 == 0) && (numero > mayor)) {
        mayor = numero;
      } else if ((numero % 2 != 0) && (numero < menor)) {
        menor = numero;
      }
      media += numero;
    }
    System.out.println();
    System.out.println("El máximo par ha sido " + mayor);
    System.out.println("El mínimo impar ha sido " + menor);
    System.out.println("La media de todos es " + (double)media / 50);
  }
}

