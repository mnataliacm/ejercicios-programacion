package misFunciones;
/**
 * Funciones matemáticas: 
 * Generar números aleatorios, voltear número, comprobar si es primo, capicúa, ...
 * 
 * 
 * @author Natalia Castillo Muñoz
 */
public class Matematicas {
  
  // FUNCIÓN VOLTEAR NÚMERO
  /**
   * Le da la vuelta a un número
   *
   * @param x un número entero
   * @return el número del revés
   */
  public static long voltea(long x) {
    long numero = x;
    long ultimo = 0;
    long numeroReves = 0;

    while( numero > 0 ) {
      ultimo = numero % 10;
      numeroReves = numeroReves * 10 + ultimo;
      numero /= 10;
   }
    return numeroReves;
  }
  
  // FUNCIÓN CAPICÚA
  /**
   * Comprueba si el número es capicúo
   *
   * @param x un número entero positivo
   * @return 
   * <pre><code>true</code> si el número es capicúo
   *  <code>false</code> en caso contrario</pre>
   * 
   */
  public static boolean esCapicua(long x) {
    return x == voltea(x);
  }

  // FUNCIÓN PRIMOS
  /**
   * Comprueba si un número entero positivo es primo o no. Un número es primo
   * cuando únicamente es divisible entre él mismo y la unidad.
   *
   * @param x un número entero positivo
   * @return 
   * <pre><code>true</code> si el número es capicúo
   *  <code>false</code> en caso contrario</pre>
   */
  public static boolean esPrimo(long x) {
    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
      }
    }
    return true;
  }
  // FUNCIÓN SIGUIENTE PRIMOS

  /**
   * Devuelve el menor primo que es mayor que el número que se pasa por
   * parámetro
   *
   * @param x un número entero positivo
   * @return el siguiente número primo a partir del número dado.
   */
  public static long siguientePrimo(long x) {

    long p = x + 1;
    do {      
      if (!esPrimo(p)) {
        p++;
      } 
    } while (!esPrimo(p)); 
    return p;
  }

  // FUNCIÓN POTENCIA
  /**
   * Dada una base y un exponente devuelve la potencia
   *
   * @param x la base 
   * @param y el exponente
   * @return la potencia
   */
  public static long potencia(int x, int y) {
    int r = x;
    for (int i = 1; i < y; i++) {
      r *= x;
    }
      return r;
  }
  
  // FUNCIÓN CONTAR DÍGITOS
  /**
   * Cuenta el número de dígitos de un número entero
   *
   * @param x un número entero
   * @return los dígitos del número
   */
  public static int digitos(long x) {
    int conteo = 0;
    do {
      x /= 10;
      conteo++;
    } while (x > 0);
    return conteo;
  }
  
  // FUNCIÓN DÍGITO n
  /**
   * Devuelve el dígito que está en la posición dada
   * Se empieza por el 0 de izq a der
   *
   * @param x número
   * @param y posición
   * @return el dígito que hay en esa posicion
   */
  public static int digitoN(long x, int y) {
    long n = voltea(x);
    while (y > 0) {      
      y--;
      n /= 10;
    }
    return (int) n % 10;
  }
  
  // FUNCIÓN POSICIÓN DE UN DÍGITO
  /**
   * Devuelve la posición de la primera ocurrencia de un dígito dentro de un número entero, si no la encuentra devuelve -1
   *
   * @param x número
   * @param y digito
   * @return la posición del dígito
   */
  public static int posicionDigito(long x, int y) {
    int digitos = digitos(x);
    int conteo = 1;
    long cortar = potencia(10, digitos -1);
    long n = x / cortar;
    while (n != y) {     
      conteo++;
      cortar /= 10;
      n = (x / cortar) % 10;
    }
    return conteo;
  }  
  
  // FUNCIÓN QUITAR DÍGITOS POR LA DERECHA
  /**
   * Le quita a un número n dígitos por detrás (por la derecha)
   *
   * @param x número
   * @param y digito a quitar
   * @return el número resultado
   */
  public static long quitaPorDetras(long x, int y) {
    long cortar = potencia(10, y);  
    long n = x / cortar;
    return n;
  }
  
  // FUNCIÓN QUITAR DÍGITOS POR LA IZQUIERDA
  /**
   * Le quita a un número n dígitos por delante (por la izquierda)
   *
   * @param x número
   * @param y digito a quitar
   * @return el número resultado
   */
  public static long quitaPorDelante(long x, int y) {
    long n = voltea(x);
    n = quitaPorDetras(n, y);
    n = voltea(n);
    return n;
  }
  
  // FUNCIÓN AÑADIR DÍGITO POR LA DERECHA
  /**
   * Le añade al número dado un dígito detrás
   *
   * @param x número
   * @param y digito
   * @return el número resultado
   */
  public static long pegaPorDetras(long x, int y) {
    String r = String.valueOf(x) + String.valueOf(y);
    return Integer.valueOf(r);
  }
  
  // FUNCIÓN AÑADIR DÍGITO POR LA IZQUIERDA
  /**
   * Le añade al número dado un dígito delante
   *
   * @param x número
   * @param y digito
   * @return el número resultado
   */
  public static long pegaPorDelante(long x, int y) {
    String r = String.valueOf(y) + String.valueOf(x);
    return Long.parseLong(r);
  }
  
  // FUNCIÓN DEVUELVE UN TROZO DE UN NÚMERO
  /**
   * Devuelve el trozo correspondiente tomando como parámetros inicial y final dentro de un número.
   *
   * @param n número
   * @param i inicial
   * @param f final
   * @return el trozo del número
   */
  public static long trozoDeNumero(long n, int i, int f) {
    long y = quitaPorDelante(n, i);
    long x = quitaPorDetras(y, f - i);
    return x; 
  }
  
  // FUNCIÓN JUNTA DOS NÚMEROS
  /**
   * Pega dos números para formar uno
   *
   * @param x número 1
   * @param y número 2
   * @return el número resultado
   */
  public static long juntaNumeros(long x, long y) {
    String r = String.valueOf(x) + String.valueOf(y);
    return Long.parseLong(r);
  } 
  
  ///// FUNCIÓN NÚMEROS ALEATORIOS
  /**
  * Genera números aleatorios entre dos números dados min y max.
  *
  * @param min número mínimo aleatorio
  * @param max numero máximo aleatorio
  * @return un número aleatorio
  */
  public static int aleatorio(int min, int max) {
    return (int)(Math.random() * (max - min + 1)) + min;
  }
  
  // FUNCIÓN  MEDIA DE 3 NÚMEROS DADOS
  /**
  * Calcula la media de tres números
  *
  * @param n1 número decimal
  * @param n2 número decimal
  * @param n3 número decimal
  * @return la media de los tres números
  */
  public static double media(double n1, double n2, double n3) {
    double r = (n1 + n2 + n3) /3;
    return r ;
  }
  
  // FUNCION CONVERTIR AL SISTEMA DE PALOTES
  /**
  * Convierte los dígitos de un números al sistema de "palotes"
  *
  * @param n número decimal
  * @return el numero convertido al sistema "palotes"
  */
	public static String convierteEnPalotes(long n) {
		String palotes = "";		
		int conteo = Matematicas.digitos(n);
		long numReves = Matematicas.voltea(n);
		long numero = numReves;
		do {
			numero = numReves % 10;
			for (int i = 0; i < numero; i++) {
				palotes += "|";
			}
			conteo--;
			numReves = numReves / 10;
			if (conteo > 0) {
				palotes += "-";
			}
		} while (conteo > 0);
		return palotes;
	}
  
   //FUNCION QUE CONVIERTE Nº A MORSE
  /**
   * Convierte un número dado al código morse
   * 
   * @param n numero dado
   * @return el número dado convertido a código morse
   */
  public static String convierteEnMorse(int n) {
    String morse = "";		
		int conteo = Matematicas.digitos(n);
		long numReves = Matematicas.voltea(n);
		long numero = 0;
    
		do {
			numero = numReves % 10;
      switch ((char)(numero)){
        case 0:
          morse += "-----";
          break;
          case 1:
          morse += ".----";
          break;
          case 2:
          morse += "..---";
          break;
          case 3:
          morse += "...--";
          break;
          case 4:
          morse += "....-";
          break;
          case 5:
          morse += ".....";
          break;
          case 6:
          morse += "-....";
          break;
          case 7:
          morse += "--...";
          break;
          case 8:
          morse += "---..";
          break;
          case 9:
          morse += "----.";
          break;
        default:
          break;
      }
      conteo--;
			numReves = numReves / 10;
		} while (conteo > 0);
    return morse;
	}  

  
  
}