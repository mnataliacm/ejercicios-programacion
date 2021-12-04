/**
 * Tema 2
 * Ejercicio 8
 * Programa que declare 5 variables tipo char. 
 * 1 variable cadena de caracteres y su valor la concatenación de las anteriores.
 * Mostrar por pantalla, ¿problemas? ¿solución?
 *  
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio8 {
  public static void main(String[] args) {
    
    char vocal1 = 'a';
    char vocal2 = 'e';
    char vocal3 = 'i';
    char vocal4 = 'o';
    char vocal5 = 'u';
    
    String vocales = "" + vocal1 + vocal2 + vocal3 + vocal4 + vocal5;
    
    System.out.println("Las vocales son: " + vocales);
    
  }
}
//Problema: falla variable vocales, dice que int no se puede convertir a String, se toma las vocales como números.
//Solucion: poner un espacio delante para que no las sume.
