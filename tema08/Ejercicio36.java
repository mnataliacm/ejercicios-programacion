package tema08;

/**
 * Tema 8
 * Ejercicio 36
 * .
 * Devuelve un array con todos los números primos que se encuentren en otro
 * array que se pasa como parámetro
 * Obviamente el array resultado será menor o igual al que se pasa como
 * parámetro
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio36 {
  public static void main(String[] args) {

    int[] array = new int[25];
    int[] r = new int[0];
    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (Math.random() * 999) + 1;
    }
    System.out.println("Array original: ");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
    System.out.println("Array resultado: ");
    r = filtraPrimos(array);
    for (int i = 0; i < r.length; i++) {
      System.out.print(r[i] + " ");
    }
  }

  // funcion filtrar primos en array
  public static int[] filtraPrimos(int a[]) {
    int[] x = new int[a.length];
    int tamano = 0;
    int conteo = 0;
    for (int i = 0; i < a.length; i++) {
      if (Ejercicio01_14.esPrimo(a[i])) {
        tamano++;
        x[conteo++] = a[i];
      }
    }
    int[] r = new int[tamano];

    if (tamano == 0) {
      int[] c = { -1 };
      return c;
    } else {
      for (int i = 0; i < x.length; i++) {
        if (x[i] != 0) {
          r[i] = x[i];
        }
      }
      return r;
    }
  }
}
