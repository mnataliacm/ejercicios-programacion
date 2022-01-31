package misFunciones;
/**
 * Funciones usando array:
 * Generar array, buscar mayor y menor, posición, etc
 * 
 *
 * @author Natalia Castillo Muñoz
 */
public class Arrays {
  
// FUNCIÓN GENERA UN ARRAY
  /**
  * Genera un array de tamaño n con numeros aleatorios. Intervalo (minimo y maximo) indicado por parámetros 
  *
  * @param x tamaño array 
  * @param min número minimo aleatorio
  * @param max número máximo aleatorio
  * @return el array generado
  */
  public static int[] generaArrayInt(int x, int min, int max) {
    int[] num = new int [x];
    for (int i = 0; i < num.length; i++) {
      num[i] = (int)(Math.random() * (max - min + 1)) + min;
    }
    return num;
  }
   // FUNCIÓN MINIMO DE UN ARRAY
  /**
  * Devuelve el minimo número que hay en un array
  *
  * @param num[] array 
  * @return el minimo del array dado
  */
  public static int minimoArrayInt(int[] num) {
    int minimo = Integer.MAX_VALUE;
    for (int i = 0; i < num.length; i++) {
      if (num[i] < minimo) {
        minimo = num[i];
      } 
    }
    return minimo;
  }
  
  // FUNCIÓN MÁXIMO DE UN ARRAY
  /**
  * Devuelve el máximo número que hay en un array
  *
  * @param num[] array 
  * @return el minimo del array dado
  */
  public static int maximoArrayInt(int[] num) {
    int maximo = Integer.MIN_VALUE;
    for (int i = 0; i < num.length; i++) {
      if (num[i] > maximo) {
        maximo = num[i];
      }
    }
    return maximo;
  }
  
  // FUNCIÓN MEDIA DE UN ARRAY
  /**
  * Devuelve la media de un array
  *
  * @param num[] array 
  * @return el minimo del array dado
  */
  public static double mediaArrayInt(int[] num) {
    double media = 0;
    for (int i = 0; i < num.length; i++) {
      media += num[i];
    }
    media /= num.length;
    return media;
  }
  
 // FUNCIÓN BUSCA NÚMERO EN EL ARRAY                         
  /**
  * Busca un número dentro del array
  *
  * @param num[] array
  * @param x número a buscar
  * @return <code>true</code> si el número esta en el array 
  *         <code>false</code> en caso contrario
  */
  public static boolean estaEnArray(int[] num, int x) {
    for (int i = 0; i < num.length; i++) {
      if (num[i] == x) {
        return true;
      }
    }
    return false;
  }
  
  // FUNCIÓN POSICIÓN EN ARRAY
  /**
  * Busca un número en el array y devuelve su posición
  *
  * @param num[] array 
  * @param x número a buscar
  * @return la posición del número en el array
  */
  public static int posicionEnArray(int[] num, int x) {
    for (int i = 0; i < num.length; i++) {
      if (num[i] == x) {
        return i; 
      }
    }  
    return -1;
  }
  
  // FUNCIÓN VOLTEAR UN ARRAY
  /**
  * Devuelve el array del revés
  *
  * @param num[] array 
  * @return el array resultado
  */
  public static int[] volteaArrayInt(int[] num) {
    int[] r = new int [num.length];
    int z = num.length - 1;
      for (int i = 0; i < num.length; i++) {
        r[i] = num[z--];        
      }
    return r;
  }
  
  // FUNCIÓN QUE ROTA A LA DERECHA
  /**
  * Rota el array n posiciones a la derecha
  *
  * @param num[] array
  * @param x posiciones a mover
  * @return el array resultado
  */
  public static int[] rotaDerechaArrayInt(int num[], int x) {
    int[] r = new int [num.length];
    for (int i = 0; i < num.length; i++) {
      r[i] = num[i];
    }
    for (int i = 0; i < num.length; i++) {
      if (i < x) {
        num[i] = r[num.length - x + i];
      } else {
        num[i] = r[i - x];
      }     
    }
    return num;
  }
  
  // FUNCIÓN QUE ROTA A LA IZQUIERDA
  /**
  * Rota el array n posiciones a la izquierda
  *
  * @param num[] array 
  * @param x posiciones a mover
  * @return el array resultado
  */
  public static int[] rotaIzquierdaArrayInt(int num[], int x) {
    int[] r = new int [num.length];
    int n = 0;
    for (int i = 0; i < num.length; i++) {
      r[i] = num[i];
    }
    for (int i = 0; i < num.length; i++) {
      if (i < num.length - x) {
        num[i] = r[x + i];
      } else {
        num[i] = r[n];
        n++;
      }     
    }
    return num;
  } 
  
  // FUNCIÓN QUE DEVUELVE UN TROZO DE UN ARRAY STRING
  /**
  * Selecciona un trozo del array dado el array, el inicio y el fin del corte
  *
  * @param a[] array String dado
  * @param x inicio del corte
  * @param y fin del corte
  * @return r[] el array resultado
  */
  public static String[] trozoArrayString(String a[], int x, int y) {
    String[] r = new String[y];
    if (y < x && x < 0 || y > a.length) {  
    } else if (x < 0) {
      x = 0;
      r = new String[y];
      for (int i = 0; i < y; i++) {
        r[i] = a[x++];
      } 
    }  
    return r; 
  }

  
  
  
  
  
  
  // FUNCIÓN x
  /**
  * Comprueba 
  *
  * @param x 
  * @return <code>true</code> si 
  *         <code>false</code> en caso contrario
  */
//  public static boolean esPrimo(int x) {
//    for (int i = 2; i < x; i++) {
//      if ((x % i) == 0) {
//      return false;
//      }
//    }
//    return true;
//  }
}