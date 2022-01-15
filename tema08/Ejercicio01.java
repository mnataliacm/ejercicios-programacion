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
public class Ejercicio01 {

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
      numeroReves *= 10 + ultimo;
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
  public static boolean esPrimo(int x) {
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
   * @return <code>true</code> si el número es primo <code>false</code> en caso
   * contrario
   */
  public static int siguientePrimo(int x) {
    boolean esPrimo = false;
    int p = x + 1;
    do {
      if (!esPrimo(p)) {
        p++;
      } 
    } while (!esPrimo);
    return p;
  }

  //FUNCIÓN CONTAR DÍGITOS
  /**
   * Devuelve el número de dígitos que contiene un número entero
   *
   * @param x un número entero
   * @return la cantidad de dígitos que contiene el número
   */
  public static int digitos(int x) {
    if (x == 0) {
      return 1;
    } else {
      int n = 0;
      while (x > 0) {
        x = x / 10;
        n++;
      }
      return n;
    }
  }
  //FUNCIÓN 

}
