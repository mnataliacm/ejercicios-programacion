package misFunciones;
/**
 * 
 * Funciones con arrays bidireccionales
 *
 * @author Natalia Castillo Muñoz
 */
public class ArrayBi {
  
  public static void main(String[] args) {
    
  }
  // FUNCIÓN GENERAR ARRAY BIDIRECCIONAL
  /**
  * Genera un array de tamaño n x m y rellena con números aleatorios entre min y max dados.
  *
  * @param f número de filas
  * @param c número de columnas
  * @param min mininmo aleatorio
  * @param max máximo aleatorio
  * @return el array bidireccional generado de manera aleatoria
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
  * @return muestra la linea
  */
  public static int[] filaArrayBiInt(int[][] a, int f) {
    int[] r = new int[a.length];
    for (int i = 0; i < a.length; i++) {
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
  * @return muestra la columna 
  */
  public static int[] columnaArrayBiInt(int[][] a, int c) {
    int[] r = new int[a[0].length];
    for (int i = 0; i < a[0].length; i++) {
      r[i]= a[i][c];
      }
    return r;
  }

  // FUNCIÓNES MUESTRAN COORDENADAS DEL NÚMERO n DEL ARRAY BIDIRECCIONAL
  /**
  * Devuelve las coordenadas del número n dado dentro del array
  *
  * @param a[][] array
  * @param n número a buscar
  * @return si el número está devuelve sus coordenadas y si no devuelve {-1, -1}
  */
  public static int[] coordenadasArrayBiInt(int[][] a, int n) {
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[0].length; j++) { 
        if (n == a[i][j]) {
          int[] r = {i, j};
          return r;
        }
      }
    }
    int[] r = {-1, -1};
    return r;
  }
  
  public static String coordenadasArrayBiString(int[][] a, int n) {
    //int[] f = new int[a.length];
    //int[] c = new int[a.length];
    String r = "";
    boolean esta = false;
    int f = 0;
    int c = 0;
    //do {  
      for (int i = 0; i < a.length; i++) {
	      for (int j = 0; j < a[0].length; j++) { 
	        if (n == a[i][j]) {	
	          f = i;
	          c = j;
	          esta = true;
	        } else {
	         esta = false;
	        }
	      }
      }
    //} while (esta);
    if (esta) {
    	r = String.valueOf(f) + ", " + String.valueOf(c);
    } else {
    	r = "{-1, -1}";
    }  
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
	  int[] r = coordenadasArrayBiInt(a, n);
	  int f = r[0];
	  int c = r[1];
	  int[] fila = filaArrayBiInt(a, f);
	  int[] columna = columnaArrayBiInt(a, c);
	  if ((Array.minimoArrayInt(fila) == n) & (Array.maximoArrayInt(columna) == n)) {
		  return true;
	  } else {
		  return false;
	  }   
  }
  
  // FUNCIÓN MUESTRA UNA DIAGONAL INDICADA SEGÚN FILA Y COLUMNA
  /**
  * Devuelve la diagonal en la dirección indicada según fila y columna dadas
  *
  * @param a[][] array
  * @param f indica la fila
  * @param c indica la columna
  * @param direccion indicando diagonal 
  <code>nose</code> si va de arriba izquierda hacia abajo derecha 
  <code>neso</code> si va de arriba derecha hacia abajo izquierda
  * @return la diagonal resultado
  */
  public static int[] diagonal(int[][] a, int f, int c, String direccion) {
    int n = a.length + a[0].length;
    int[] d = new int[n];
    int conteo = 0;
    int i, j;
	
    for (i = 0; i < a.length; i++) {
      for (j = 0; j < a[0].length; j++) { 
        if ((((f - i) == (c - j)) && (direccion.equals("nose"))) || (((i - f) == (c - j)) && (direccion.equals("neso")))) {
			d[conteo++] = a[i][j];
		}
      }
    }
    int [] diagonal = new int[conteo];
    for (int k = 0; k < conteo; k++) {
		diagonal[k] = d[k];
	}
    return diagonal;
    
    
  } 
}