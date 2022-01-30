import com.sun.tools.javac.code.Attribute.Array;

/**
 * Tema 8
 * 
 * Ejercicios 20-28
 * Biblioteca de funciones de array de una dimensión de números enteros
 *
 * 1. generaArrayInt: Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
 * 2. minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.
 * 3. maximoArrayInt: Devuelve el máximo del array que se pasa como parámetro.
 * 4. mediaArrayInt: Devuelve la media del array que se pasa como parámetro.
 * 5. estaEnArrayInt: Dice si un número está o no dentro de un array.
 * 6. posicionEnArray: Busca un número en un array y devuelve la posición (el índice) en la que se encuentra.
 * 7. volteaArrayInt: Le da la vuelta a un array.
 * 8. rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un array.
 * 9. rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los números de un array
 * 
 * 
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio20_28 {
  
  public static void main(String[] args) {
    
  }
  // 1 FUNCIÓN GENERA UN ARRAY
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
  
   // 2 FUNCIÓN MINIMO DE UN ARRAY
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
  
  // 3 FUNCIÓN MÁXIMO DE UN ARRAY
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
  // 4 FUNCIÓN MEDIA DE UN ARRAY
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
  
 // 5 FUNCIÓN BUSCA NÚMERO EN EL ARRAY                         
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
  
  // 6 FUNCIÓN POSICIÓN EN ARRAY
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
  
  // 7 FUNCIÓN VOLTEAR UN ARRAY
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
  
  // 8 FUNCIÓN QUE ROTA A LA DERECHA
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
  
  // 9 FUNCIÓN QUE ROTA A LA IZQUIERDA
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
}
