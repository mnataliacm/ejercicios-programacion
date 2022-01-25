package tema05.del21_30;
/**
 * Tema 5
 * Ejercicio 22
 * Programa que muestre por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio22 {
  public static void main(String[] args) {

    System.out.println("__Programa que muestra números primos entre 2 y 100 (ambos inclusive)__");

    boolean primo = true;

    for(int i = 2; i <= 100; i++){
      primo = true;
      for(int n = 2; n < i && primo == true; n++){
        if(i % n == 0){
          primo = false;
        }
      }
      if(primo == true ){
        System.out.print(i + ", ");
      }
    }
    System.out.println();
    


    
  }
}

