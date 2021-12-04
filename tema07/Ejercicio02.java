/**
 * Tema 7
 * Ejercicio 2
 * 
 * Define un array de 10 caracteres con nombre simbolo
 * Asigna los valores segun la tabla mostrada.
 * Muestra todo el contenido.
 * 
 * PREGUNTA:
 * ¿ que sucede con los valores de los elementos que no han sido inicializados?
 * No muestra nada, deja el espacio.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio02 {
  public static void main(String[] args) {

    System.out.println("___Muestra un array___");
    System.out.println();
    //defino array
    char [] simbolo;
    //reservo espacio
    simbolo = new char [12];
    //asigno valores
    simbolo[0] = 'a';
    simbolo[1] = 'x';
    simbolo[4] = '@';
    simbolo[6] = ' ';
    simbolo[8] = '+';
    simbolo[9] = 'Q';
    //muestro valores
    for (int i = 0; i < 10; i++) {
      System.out.println(simbolo[i]);
    }

  }
}

