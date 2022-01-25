package tema08;
import java.util.Scanner;
/**
 * Tema 8
 *
 * Ejercicio 1-14 
 * Probar las funciones creadas
 * 
 * Biblioteca de funciones matemáticas
 *
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio01_14 {
  public static void main(String[] args) {

    //variables
    Scanner s = new Scanner(System.in);
    //int num = (int)(Math.random() * 4) + 1;
    long n = 0;
    int i = 0;
    int f = 0;
    long r = 0;
    int conteo = 0;
    System.out.print("Introduce un número entero positivo: ");
    n = s.nextInt();
    //CAPICÚA
    System.out.println("COMPROBAR SI ES CAPICÚO");
    if (esCapicua(n)) {
      System.out.println("El número " + n + " es capicúo.");
    } else {
      System.out.println("El número " + n + " no es capicúo.");
    }
    //SI ES PRIMO
    System.out.println("COMPROBAR SI ES PRIMO");
    if (esPrimo(n)) {
      System.out.println("El número " + n + " es primo.");
    } else {
      System.out.println("El número " + n + " no es primo.");
    }
    //SIGUIENTE PRIMO
    System.out.println("BUSCAR SIGUIENTE PRIMO");
    r = siguientePrimo(n);
    System.out.println("El siguiente número primo es " + r);
    //POTENCIA
    System.out.println("CALCULAR LA POTENCIA");
    System.out.print("Introduce la base: ");
    int b = s.nextInt();
    System.out.print("Introduce el exponente: ");
    int e = s.nextInt();
    long resultado = potencia(b, e);
    System.out.println("La potencia es: " + resultado); 
    //CONTAR DÍGITOS
    System.out.println("CONTAR DÍGITOS DE UN NÚMERO");
    System.out.println("El número " + n + " tiene " + digitos(n) + " dígitos.");
    //VOTEAR NÚMERO
    System.out.println("DÁ LA VUELTA A UN NÚMERO");
    System.out.println("El número " + n + " del revés: " + voltea(n)); 
    //POSICIÓN DEL DÍGITO N
    System.out.println("POSICIÓN DE UN DÍGITO");
    System.out.print("Introduce la posición: ");
    int p = s.nextInt();
    System.out.println("En la posición " + p + " está el dígito " + digitoN(n, p));
    //BUSCA POSICIÓN DEL DÍGITO DADO
    System.out.println("POSICIÓN DE UN DÍGITO");
    System.out.print("Introduce el dígito a buscar: ");
    int d = s.nextInt();
    System.out.println("El dígito " + d + " está en la posición " + posicionDigito(n, d));
    //QUITAR n DÍGITOS POR LA DERECHA
    System.out.println("QUITAR DÍGITOS POR LA DERECHA");
    System.out.print("¿Cuantos dígitos quieres quitar?: ");
    d = s.nextInt();
    System.out.println("El resultado es: " + quitaPorDetras(n, d));
    //QUITAR n DÍGITOS POR LA IZQUIERDA
    System.out.println("QUITAR DÍGITOS POR LA IZQUIERDA");
    System.out.print("¿Cuantos dígitos quieres quitar?: ");
    d = s.nextInt();
    System.out.println("El resultado es: " + quitaPorDelante(n, d));
    //PEGAR UN DÍGITO POR LA DERECHA
    System.out.println("AÑADIR 1 DÍGITO POR LA DERECHA");
    System.out.print("Introduce el dígito para añadir al final: ");
    d = s.nextInt();
    System.out.println("El resultado es: " + pegaPorDetras(n, d));
    
    //PEGAR UN DÍGITO POR LA IZQUIERDA
    System.out.println("AÑADIR 1 DÍGITO POR LA IZQUIERDA");
    System.out.print("Introduce el dígito para añadir al principio: ");
    d = s.nextInt();
    System.out.println("El resultado es: " + pegaPorDelante(n, d));
    //CORTA UN TROZO DE UN NÚMERO
    System.out.println("TROZO DE UN NÚMERO");
    System.out.print("Introduce el primer dígito: ");
    i = s.nextInt();
    System.out.print("Introduce el último dígito: ");
    f = s.nextInt();
    System.out.println("El resultado es: " + trozoDeNumero(n, i, f));
    //JUNTA DOS NÚMEROS
    System.out.println("JUNTA DOS NÚMERO");
    System.out.print("Introduce un número: ");
    n = s.nextInt();
    System.out.print("Introduce otro número: ");
    i = s.nextInt();
    System.out.println("El resultado es: " + juntaNumeros(n, i));
    System.out.println("");
  }
  //////////////////////////////////////FUNCIONES///////////////////////////////
  // FUNCIÓN VOLTEAR NÚMERO
  /**
   * Le da la vuelta a un número
   *
   * @param x número entero dado
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
   * Devuelve verdadero si el número que se pasa como parámetro es capicúa y
   * falso en caso contrario.
   *
   * @param x un número entero positivo
   * @return <code>true</code> si el número es capicúo 
   *         <code>false</code> en caso contrario
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
   * @return <code>true</code> si el número es primo 
   *         <code>false</code> en caso contrario
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
  
  // 8 FUNCIÓN POSICIÓN DE UN DÍGITO
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
  
  // 9 FUNCIÓN QUITAR DÍGITOS POR LA DERECHA
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
  
  // 10 FUNCIÓN QUITAR DÍGITOS POR LA IZQUIERDA
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
  
  // 11 FUNCIÓN AÑADIR DÍGITO POR LA DERECHA
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
  
  // 12 FUNCIÓN AÑADIR DÍGITO POR LA IZQUIERDA
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
  
  // 13 FUNCIÓN DEVUELVE UN TROZO DE UN NÚMERO
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
  
  // 14 FUNCIÓN JUNTA DOS NÚMEROS
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
