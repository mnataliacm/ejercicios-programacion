package tema08;
/**
 * Tema 8
 * 
 * Ejercicios 29_24
 * Biblioteca de funciones array bidireccionales
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio29_34 {
  
  public static void main(String[] args) {
    
  }
  // FUNCIÓN GENERAR ARRAY BIDIRECCIONAL
  /**
  * Genera un array de tamaño n x m
  *
  * @param f número de filas
  * @param c número de columnas
  * @param min mininmo aleatorio
  * @param max máximo aleatorio
  * @return <code>true</code> si 
  *         <code>false</code> en caso contrario
  */
  public static int[][] generaArrayBiInt(int f, int c, int min, int max) {
    int[][] a = new int[f][c];
    for (int i = 0; i < f; i++) {
      for (int j = 0; j < c; j++) {
        a[i][j] = (int)(Math.random() * (max - min + 1)) + min;
      }
    }
    return a;
  }
  
  // FUNCIÓN MUESTRA FILA DEL ARRAY BIDIRECCIONAL
  /**
  * Devuelve la fila solicitada
  *
  * @param a[][] array
  * @param f linea solicitada
  * @return muestra la linea indicada
  */
  public static int[] filaArrayBiInt(int[][] a, int f) {
    int[] r = new int[a[0].length];
    for (int i = 0; i < a[0].length; i++) {
      r[i]= a[f][i];
      }
    return r;
  }
  
  // FUNCIÓN MUESTRA COLUMNA DEL ARRAY BIDIRECCIONAL
  /**
  * Devuelve la columna indicada
  *
  * @param a[][] array
  * @param c columna solicitada
  * @return muestra la columna indicada
  */
  public static int[] columnaArrayBiInt(int[][] a, int c) {
    int[] r = new int[a[0].length];
    for (int i = 0; i < a[0].length; i++) {
      r[i]= a[i][c];
      }
    return r;
  }

  // FUNCIÓN MUESTRA COORDENADAS DEL NÚMERO n DEL ARRAY BIDIRECCIONAL
  /**
  * Devuelve las coordenadas del número n dado dentro del array
  *
  * @param a[][] array
  * @param n número a buscar
  * @return si el número está devuelve sus coordenadas y si no devuelve {-1, -1}
  */
//  public static int[] coordenadasArrayBiInt(int[][] a, int n) {
//    //int[] f = new int[a.length];
//    //int[] c = new int[a.length];
//    boolean esta = false;
//    int[] r = new int[2];
//    for (int i = 0; i < a.length; i++) {
//      for (int j = 0; j < a[0].length; j++) { 
//        if (n == a[i][j]) {
//          r[0] = i;
//          r[1] = j;
//          esta = true;
//        }
//      }
//    }
//    if (!esta) {
//      r[0] = -1;
//      r[1] = -1;
//    }
//    return null;
//  }
  public static String coordenadasArrayBiString(int[][] a, int n) {
    //int[] f = new int[a.length];
    //int[] c = new int[a.length];
    String r = "";
    int j = 0;
    do {      
      for (int i = 0; i < a.length; i++) {
      for (j = 0; j < a[0].length; j++) { 
        if (n == a[i][j]) {
          r = String.valueOf(i) + ", " + String.valueOf(j);
        } else {
          r = "{-1, -1}";
        }
      }
      }
    } while (n != a[i][j]);
    return r;
    }
    
  
  // FUNCIÓN INDICA SI UN NÚMERO ES PUNTO DE SILLA
  /**
  * Indica si un número es el menor de su fila y el mayor de su columna (punto de silla)
  *
  * @param a[][] array
  * @param n número a buscar
  * @return true si es punto de silla false si no lo es
  */
  public static boolean esPuntoDeSilla(int[][] a, int n) {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int r = coordenadasArrayBiInt(a, n);
    if (n == a[]) {
      return true;
    } else {
      return false;
    }
    
    
  }
  
  // FUNCIÓN MUESTRA COORDENADAS DEL NÚMERO n DEL ARRAY BIDIRECCIONAL
  /**
  * Devuelve las coordenadas del número n dado dentro del array
  *
  * @param a[][] array
  * @param n número a buscar
  * @return si el número está devuelve sus coordenadas y si no devuelve {-1, -1}
  */
  public static String diagonal(int[][] a, int n) {
    //int[] f = new int[a.length];
    //int[] c = new int[a.length];
    String r = "";
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[0].length; j++) { 
        if (n == a[i][j]) {
          r = String.valueOf(i) + ", " + String.valueOf(j);
        } else {
          r = "{-1, -1}";
        }
      }
      }
    return r;
  } 
}