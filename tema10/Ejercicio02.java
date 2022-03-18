import java.util.ArrayList;
/**
 * Tema 10
 * Ejercicio 2
 * Introduce valores aleatorios entre 0 y 100 en un ArrayList que luego calcule
 * Suma, Media, Máximo y Mínimo de esos números. Tamaño lista aleatorio entre 10-20
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio02 {
  public static void main(String[] args) {

    int tamano = (int) (Math.random() * 11) + 10;
    int[] num = new int[tamano];
    int suma = 0;
    int max = 0;
    int min = 100;

    for (int i = 0; i < num.length; i++) {
      num[i] = (int) (Math.random() * 100);
      suma += num[i];
      if (num[i] < min) {
        min = num[i];  
      } else if (num[i] > max) {
        max = num[i];
      } 
    }
    
    System.out.println("_____Usando Array_____");
    for (int i = 0; i < num.length; i++) {
      System.out.print(num[i] + " ");
    }
    System.out.println();
    System.out.println("La suma es: " + suma);
    System.out.println("La media es: " + suma/num.length);
    System.out.println("El mayor es: " + max);
    System.out.println("El menor es: " + min);

    System.out.println("____________________");
    
    System.out.println("_____Usando ArrayList_____");

    ArrayList<Integer> numeros = new ArrayList<>();
      for (int i = 0; i < tamano; i++) {
        numeros.add((int)(Math.random() * 100));
      }

      for (Integer n : numeros) {
        suma += n;
        if (n > max)
        max = n > max ? n : max;
        min = n < min ? n : min;
      }

      
      





  }
}
