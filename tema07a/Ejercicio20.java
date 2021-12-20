/**
 * Tema 7
 * Ejercicio 20
 * 
 * Programa que calcula la denominación ordinal de los reyes de una secuencia histórica.
 * Pedir cantidad de nombres, y luego los nombres.
 * Mostrar dichos nombres pero añadiendo al final si es I o II segun aparezca repetido.
 * 
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio20 {
  public static void main(String[] args) {

    System.out.print("Introduce el número inicial: ");
    int cantidad = Integer.parseInt(System.console().readLine());
    //VARIABLES
    String[] reyes = new String[cantidad];
    String[] n = {" I", " II", " III", " IV", " V", " VI", " VII", " VIII", " IX", " X"};
    String[] r = new String[cantidad];
    int conteo = 0;
    //PROGRAMA
    System.out.println("Introduce los nombres y pulsa enter tras cada uno: ");
    for (int i = 0; i < cantidad; i++) {
      reyes[i] = System.console().readLine();
    }
    //COMPROBAR REPETIDOS
    System.out.println();
    System.out.println("Los reyes introducidos son: \n");
    for (int i = 0; i < cantidad; i++) {
      conteo = 0;
      for (int j = 0; j < i; j++) {
        if ((reyes[i]).equals(reyes[j])) {
          conteo++;
        }
      }
      System.out.printf("%-10s %-5s\n", reyes[i], n[conteo]);
    }  
    System.out.println();
  }
}

