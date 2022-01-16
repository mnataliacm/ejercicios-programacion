package tema08;

/**
 * Tema 8
 *
 * Ejercicio 1-14 
 * Biblioteca de funciones matemáticas que contenga las siguientes funciones. 
 * Recuerda que puedes usar unas dentro de otras si es necesario. 
 * Ten en cuenta lo que hace cada funcion ya que, si las implementas en el orden adecuaado te puedes ahorrar trabajo. Por ejemplo la función esCapicua resulta trivial teniendo voltea y la función siguientePrimo es más fácil de implementar teniendo esPrimo. 
 * FUNCIONES: 
 * 1. esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso
 * contrario. 
 * 2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario. 
 * 3. siguientePrimo: Devuelve el menor primo que es mayor al número que se pasa como parámetro. 
 * 4. potencia: Dada una base y un exponente devuelve la potencia. 
 * 5. digitos: Cuenta el número de dígitos de un número entero. 
 * 6. voltea: Le da la vuelta a un número. 
 * 7. digitoN: Devuelve el dígito que está en la posición n de un número entero. Se empieza contando por el 0 y de izquierda a derecha. 
 * 8. posicionDeDigito: Da la posición de la primera ocurrencia de un dígito dentro de un número entero. Si no se encuentra, devuelve -1. 
 * 9. quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha). 
 * 10. quitaPorDelante: Le quita a un número n dígitos por delante (por la izquierda). 
 * 11. pegaPorDetras: Añade un dígito a un número por detrás. 
 * 12. pegaPorDelante: Añade un dígito a un número por delante. 
 * 13. trozoDeNumero: Toma como parámetros las posiciones inicial y final dentro de un número y devuelve el
 * trozo correspondiente. 
 * 14. juntaNumeros: Pega dos números para formar uno.
 *
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio01_14 {

  public static void main(String[] args) {

  }
  // FUNCIÓN CAPICÚA
  /**
   * Devuelve verdadero si el número que se pasa como parámetro es capicúa y
   * falso en caso contrario.
   *
   * @param x un número entero positivo
   * @return <code>true</code> si el número es capicúo 
   *         <code>false</code> en caso contrario
   * 
   */
  public static boolean esCapicua(long x) {
    long numero = x;
    long ultimo;
    long numeroReves = 0;
    while (numero > 0) {
      ultimo = numero % 10;
      numeroReves = numeroReves * 10 + ultimo;
      numero /= 10;
    }
    if (x == numeroReves) {
      return true;
    } else {
      return false;
    }
  }

  // FUNCIÓN PRIMOS
  /**
   * Comprueba si un número entero positivo es primo o no. Un número es primo
   * cuando únicamente es divisible entre él mismo y la unidad.
   *
   * @param x un número entero positivo
   * @return <code>true</code> si el número es primo <code>false</code> en caso
   * contrario
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

  //FUNCIÓN POTENCIA
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
  
  //FUNCIÓN CONTAR DÍGITOS
  /**
   * Cuenta el número de dígitos de un número entero
   *
   * @param x un número entero
   * @return los dígitos del número
   */
  public static int digitos(long x) {
    int cortar = 10;
    int conteo = 0;
    //contar dígitos
    while (x > 0) {
      x = x / 10;
      cortar *= 10;
      conteo++;
    }
    return conteo;
  }
  
  //FUNCIÓN VOLTEAR NÚMERO
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
  
   //FUNCIÓN DÍGITO n
  /**
   * Devuelve el dígito que está en la posición dada
   * Se empieza por el 0 de izq a der
   *
   * @param x número
   * @param y posición
   * @return la posición del dígito
   */
  public static long digitoN(long x, int y) {
    int cortar = 10;
    long num = x;
    int conteo = 0;
    while (num != 0) {
      num = num / 10;
      cortar *= 10;
    }
    while (conteo <= y) {
      cortar /= 10;
      num = (x / cortar) % 10;
      conteo++;
    }
    return num;
  }
  
  //FUNCIÓN POSICIÓN DE UN DÍGITO
  /**
   * Devuelve la posición de la primera ocurrencia de un dígito dentro de un número entero, si no la encuentra devuelve -1
   *
   * @param x número
   * @param y digito
   * @return la posición del dígito
   */
  public static int posicionDigito(long x, int y) {
    int cortar = 10;
    long num = x;
    int conteo = 0;
    while (num != 0) {
      num = num / 10;
      cortar *= 10;
    }
     while (num != y) {
      cortar /= 10;
      num = (x / cortar) % 10;
      conteo++;
    }
    return conteo - 1;
  }
  /////////////////////////FALLA!!!
  
  //FUNCIÓN QUITAR DÍGITOS POR LA DERECHA
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
  
  //FUNCIÓN QUITAR DÍGITOS POR LA IZQUIERDA
  /**
   * Le quita a un número n dígitos por delante (por la izquierda)
   *
   * @param x número
   * @param y digito a quitar
   * @return el número resultado
   */
  public static long quitaPorDelante(long x, int y) {
    int conteo = digitos(x);
    long cortar = potencia(10, conteo - y);
    long n = x % cortar;
    return n;
  }
  
  //FUNCIÓN AÑADIR DÍGITO POR LA DERECHA
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
  
  //FUNCIÓN AÑADIR DÍGITO POR LA IZQUIERDA
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
  
  //FUNCIÓN DEVUELVE UN TROZO DE UN NÚMERO
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
  
  //FUNCIÓN JUNTA DOS NÚMEROS
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
}
