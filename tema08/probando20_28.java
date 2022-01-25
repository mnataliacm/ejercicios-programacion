package tema08;
import java.util.Scanner;

/**
 * Tema 8
 *  
 * Probando las funciones de los ejercicios 20-28
 *
 *
 * @author Natalia Castillo Muñoz
 */
public class probando20_28 {
  public static void main(String[] args) {

    //variables
    Scanner s = new Scanner(System.in);
    int n, t, min, max;
    //Genero array aleatorio
    int[] array = new int [10];
    for (int i = 0; i < array.length; i++) {
      array[i] = (int)(Math.random() * (15)) + 1;
    }
    //GENERA ARRAY BIDIRECCIONAL INT
//    System.out.println("GENERAR UN ARRAY DE ENTEROS");
//    System.out.print("Introduce el tamaño del array: ");
//    t = s.nextInt();
//    System.out.print("Introduce el valor mínimo de los aleatorios: ");
//    min = s.nextInt();
//    System.out.print("Introduce el valor máximo de los aleatorios: ");
//    max = s.nextInt();
//    int[] array = new int[t];
//    
//    System.out.println("El array generado es: ");
//    for (int i = 0; i < array.length; i++) {
//      array[i] = Ejercicio20_28.generaArrayInt(t, min, max);
//      System.out.print(array[i] + " ");     
//    }
    
    //BUSCA EL MINIMO DENTRO DE UN ARRAY
//    System.out.println("\nBUSCAR EL MÍNIMO DENTRO DEL ARRAY");   
//    int minimo = Integer.MAX_VALUE;
//    minimo = Ejercicio20_28.minimoArrayInt(array);      
//    System.out.print("El número menor del array es: " + minimo);
    
    //BUSCA EL MÁXIMO DENTRO DE UN ARRAY
//    System.out.println("\nBUSCAR EL MÁXIMO DENTRO DEL ARRAY");   
//    int maximo = Integer.MIN_VALUE;
//    maximo = Ejercicio20_28.maximoArrayInt(array);      
//    System.out.print("El número mayor del array es: " + maximo);
    
    //BUSCA UN NÚMERO DENTRO DE UN ARRAY
//    System.out.println("\nBUSCA UN NÚMERO DENTRO DEL ARRAY");   
//    boolean buscar;
//    n = 10;
//    buscar = Ejercicio20_28.estaEnArray(array, n);      
//    if (buscar) {
//      System.out.println("El número " + n + " está en el array");
//    }else {
//      System.out.println("El número " + n + " no está en el array");
//    }
//    for (int i = 0; i < array.length; i++) {
//      System.out.print(array[i] + " ");    
//    }
     
    //BUSCA UN NÚMERO DENTRO DE UN ARRAY Y DEVUELVE SU POSICION
//    System.out.println("\nBUSCA UN NÚMERO DENTRO DEL ARRAY Y DEVUELVE POSICIÓN");   
//    n = 10;
//    int posicion = Ejercicio20_28.posicionEnArray(array, n);
//    System.out.println("El numero " + n + " está en la posición: " + posicion + " del array");
//    for (int i = 0; i < array.length; i++) {
//      System.out.print(array[i] + " "); 
//    }
    

  //VOLTEAR UN ARRAY
//    System.out.println("El array inicial es: ");
//    for (int i = 0; i < array.length; i++) {
//      System.out.print(array[i] + " "); 
//    }
//    System.out.println("\nEl array resultado es: ");
//    for (int i = 0; i < array.length; i++) {
//      System.out.print(Ejercicio20_28.volteaArrayInt(array)[i] + " "); 
//    }
    
   //MOVER EL ARRAY a la derecha
//   n = 5;
//   int[] r;
//    System.out.println("El array inicial es: ");
//    for (int i = 0; i < array.length; i++) {
//      System.out.print(array[i] + " "); 
//    }
//    System.out.println("\nEl array resultado es: ");
//    r = Ejercicio20_28.rotaDerechaArrayInt(array, n);
//    for (int i = 0; i < array.length; i++) {  
//      System.out.print(r[i] + " "); 
//    } 
    
    //MOVER EL ARRAY a la izquierda
//   n = 4;
//   int[] r;
//    System.out.println("El array inicial es: ");
//    for (int i = 0; i < array.length; i++) {
//      System.out.print(array[i] + " "); 
//    }
//    System.out.println("\nEl array resultado es: ");
//    r = Ejercicio20_28.rotaIzquierdaArrayInt(array, n);
//    for (int i = 0; i < array.length; i++) {  
//      System.out.print(r[i] + " "); 
//    } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  System.out.println("");   
  }
}