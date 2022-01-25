package tema07a;
/**
 * Tema 7
 * Ejercicio 10
 * 
 * Programa que almacena en un array 20 num aleatorios entre 0 y 100
 * Pasar los pares a las primeras posiciones y los impares después.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio10 {
  public static void main(String[] args) {

    //variables
    int num = (int)(Math.random() * 100);
    int[] n = new int[20];
    int[] par= new int[20];
    int[] impar = new int[20];
    int conteoPar = 0;  
    int conteoImpar = 0;  
    //programa
    System.out.println("Programa que genera 20 números aleatorios.\nGuarda primero pares y luego impares.");
    for (int i = 0; i < n.length; i++) {
      num = (int)(Math.random() * 100);
      n[i] = num;
      if (num % 2 == 0) {
        par[conteoPar] = num;
        conteoPar++;
      } else {
        impar[conteoImpar] = num;
        conteoImpar++;
      }
    }
    System.out.println("Los 20 números generados son: ");
    for (int i = 0; i < 20; i++) {
      System.out.print(n[i] + " ");
    }
    //ordeno el array
    System.out.println();
    for (int i = 0; i < conteoPar; i++) {
      n[i] = par[i];
    }
    for (int i = conteoPar; i < 20; i++) {
        n[i] = impar[i - conteoPar];
    }
    System.out.println();
    System.out.println("El resultado trás ordenar es: ");
    for (int i = 0; i < 20; i++) {
      System.out.print(n[i] + " ");
    }
    System.out.println();
  }
}

