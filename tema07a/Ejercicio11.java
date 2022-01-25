package tema07a;
/**
 * Tema 7
 * Ejercicio 11
 * 
 * Programa que pide 10 números por teclado. Los muestra en una tabla junto al indice (0-9).
 * Pasar primos a las primeras posiciones, que no se pierdan números.
 * Mostrar otra tabla con el array resultante
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio11 {
  public static void main(String[] args) {

    //variables
    int[] n = new int[10];
    int[] primo= new int[10];
    int[] noPrimo = new int[10];
    int conteoPrimo = 0;  
    int conteoNoPrimo = 0;
    boolean primoEs;  
    //programa
    System.out.println("Introduce 10 números: ");
    for (int i = 0; i < 10; i++) {
      n[i] = Integer.parseInt(System.console().readLine());
    }
    //compruebo si son primos y separo en 2 arrays
    for (int i = 0; i < n.length; i++) {
      int num = n[i];
      primoEs = true;
      for (int p = 2; p < num; p++) {
        if (num % p == 0){
         primoEs = false;
        } 
      }
      if (!primoEs) {
        noPrimo[conteoNoPrimo] = num;
        conteoNoPrimo++;
      } else {
        primo[conteoPrimo] = num;
        conteoPrimo++;
      }
    }
    System.out.println("\n");
    System.out.print("Índice  ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%5d ", i);
    }
    System.out.println("\n        ┌─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("Valor   │");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%4d │", n[i]);
    }
    System.out.println("\n        └─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    System.out.println("                                   Array inicial ");
    //ordeno el array
    for (int i = 0; i < conteoPrimo; i++) {
      n[i] = primo[i];
    }
    for (int i = conteoPrimo; i < 10; i++) {
        n[i] = noPrimo[i - conteoPrimo];
    }
    System.out.println();
    System.out.print("Índice  ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%5d ", i);
    }
    System.out.println("\n        ┌─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("Valor   │");
    for (int i = 0; i < 10; i++) {
      System.out.printf(" %3d │", n[i]);
    }
    System.out.println("\n        └─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    System.out.println("                                    Array final ");
    System.out.println();
    //comprobación
  //   System.out.println("\ncompruebo array primo y noPrimo");
  //   for (int i = 0; i < 10; i++) {
  //     System.out.print(primo[i] + " ");
  //   }
  //   System.out.println("primos: " + conteoPrimo);
  //   for (int i = 0; i < 10; i++) {
  //     System.out.print(noPrimo[i] + " ");
  //   }
  //   System.out.println("no primos: " + conteoNoPrimo);
  }
}

