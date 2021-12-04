/**
 * Tema 7
 * Ejercicio 1
 * 
 * Define un array de 12 números enteros con nombre num
 * Asigna los valores segun la tabla mostrada.
 * Muestra todo el contenido.
 * 
 * PREGUNTA:
 * ¿ que sucede con los valores de los elementos que no han sido inicializados?
 * Muestra un cero.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio01 {
  public static void main(String[] args) {

    System.out.println("___Muestra un array___");
    System.out.println();
    //defino array
    int [] num;
    //reservo espacio
    num = new int [12];
    //asigno valores
    num[0] = 39;
    num[1] = -2;
    num[4] = 0;
    num[6] = 14;
    num[8] = 5;
    num[9] = 120;
    //muestro valores
    for (int i = 0; i < 12; i++) {
      System.out.println(num[i]);
    }

  }
}

