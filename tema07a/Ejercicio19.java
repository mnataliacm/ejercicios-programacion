/**
 * Tema 7
 * Ejercicio 19
 * 
 * Programa capaz de insertar un numero en una posicion concreta del array.
 * Generar array de 12 números enteros aleatorios entre 0 y 200.
 * Mostrar array junto al indice (0-11) y pedir número nuevo a insertar y posición donde irá. 
 * Los números deben desplazarse a la derecha para dejar sitio al nuevo.
 * El último número se perderá.
 * 
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio19 {
  public static void main(String[] args) {

    //VARIABLES
    int[] n = new int [12];
    int[] r = new int [12];
    int numero = 0;
    int posicion = 0;
    //PROGRAMA
    //GENERO ARRAY ORIGINAL
    for (int i = 0; i < n.length; i++) {
      n[i] = (int) (Math.random() * 201);
    }
    //MUESTRO ARRAY ORIGINAL
    System.out.println("\n");
    System.out.print("Índice  ");
    for (int i = 0; i < 12; i++) {
      System.out.printf("%5d ", i);
    }
    System.out.println("\n        ┌─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("Valor   │");
    for (int i = 0; i < 12; i++) {
      System.out.printf("%4d │", n[i]);
    }
    System.out.println("\n        └─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    System.out.println("                                   Array inicial ");
    System.out.println();
    //PIDO DATOS
    System.out.print("Introduce el número nuevo: ");
      numero = Integer.parseInt(System.console().readLine());
    do {
      System.out.print("Introduce su posición: ");
      posicion = Integer.parseInt(System.console().readLine());
    //COMPRUEBO POSICION
      if ((posicion < 0) || (posicion > 11)) {
        System.out.println("La posición debe estar entre 0 y 11, vuelve a intentarlo.");
      } 
    } while ((posicion < 0) || (posicion > 11));
    //copio números
    for (int i = 0; i < 10; i++) {
      r[i] = n[i];
    }
   //AÑADO NUMERO Y MUEVO EL RESTO DESDE POSICION DADA
    r[posicion] = numero;
    for (int i = posicion + 1; i < 12; i++) {
      r[i] = n[i - 1];
    }
    //MUEVO PRIMEROS NUMEROS
    // r[0] = n[9];
    // for (int i = 0; i < inicio; i++) {
    //   r[i + 1] = n[i];
    // }

    //ARRAY RESULTADO
    System.out.println();
    System.out.print("Índice  ");
    for (int i = 0; i < 12; i++) {
      System.out.printf("%5d ", i);
    }
    System.out.println("\n        ┌─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("Valor   │");
    for (int i = 0; i < 12; i++) {
      System.out.printf(" %3d │", r[i]);
    }
    System.out.println("\n        └─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    System.out.println("                                   Array resultado ");
    System.out.println();
  }
}
