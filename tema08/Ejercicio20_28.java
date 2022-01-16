package tema08;
/**
 * Tema 8
 * 
 * Ejercicios 20-28
 * Biblioteca de funciones de array de una dimensión de números enteros
 *
 * 1. generaArrayInt: Genera un array de tamaño n con números aleatorios
cuyo intervalo (mínimo y máximo) se indica como parámetro.
* 2. minimoArrayInt: Devuelve el mínimo del array que se pasa como pará-
metro.
* 3. maximoArrayInt: Devuelve el máximo del array que se pasa como
parámetro.
* 4. mediaArrayInt: Devuelve la media del array que se pasa como parámetro.
* 5. estaEnArrayInt: Dice si un número está o no dentro de un array.
* 6. posicionEnArray: Busca un número en un array y devuelve la posición
(el índice) en la que se encuentra.
* 7. volteaArrayInt: Le da la vuelta a un array.
* 8. rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un
array.
* 9. rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los números de
un array
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio20_28 {
  
  public static void main(String[] args) {
    
  }
  // FUNCIÓN  GENERA ARRAY
  /**
  * Genera un array de tamaño n con numeros aleatorios. Intervalo (minimo y maximo) indicado por parámetros 
  *
  * @param x tamaño array 
  * @param min número minimo aleatorio
  * @param max número máximo aleatorio
  * @return el array generado
  */
  public static int generaArrayInt(int x, int min, int max) {
    int[] n = new int[x];
    for (int i = 0; i < n.length; i++) {
      n[i] = (int)(Math.random()* max) + min;
    }
    
    
  }