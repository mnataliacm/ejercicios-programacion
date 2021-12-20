/**
 *
 * Tema 7
 * Ejercicio 13
 * 
 * Programa que rellena un array de 100 elementos aleatorios entre 0 y 500 (ambos incluidos)
 * Mostrar el array y preguntar si quiere destacar el mayor o el menor
 * Volver a mostrar array con destacado entre dobles asteriscos.
 * 
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio13 {
  public static void main(String[] args) {
    
    //variables
    int[] n = new int[100];
    int maximo = 0;
    int minimo = 500;
    //programa
    System.out.println("__PROGRAMA QUE BUSCA MAYOR O MENOR__");
    System.out.println();
    for (int i = 0; i < n.length; i++) {
      n[i] = (int)(Math.random() * 500);
      if (n[i] < minimo) {
        minimo = n[i];
      } else if (n[i] > maximo) {
        maximo = n[i];
      }
    }
    for (int i = 0; i < n.length; i++) {
      System.out.print(n[i] + " ");
    }
    System.out.println();
    System.out.print("¿Quieres encontrar el mayor o el menor?: ");
    String buscar = System.console().readLine();
    System.out.println();
    for (int i = 0; i < n.length; i++) {
      
      if (buscar.equals("mayor") && (n[i] == maximo)) {
        System.out.print("**" + n[i] + "**" + " ");
      } else if (buscar.equals("menor") && (n[i] == minimo)) {
        System.out.print("**" + n[i] + "**" + " ");
      } else {
        System.out.print(n[i] + " ");
      }
    }
    System.out.println("");   
    }  
}
