/**
 * Tema 5
 * Ejercicio 49
 * Programa que calcula el máximo, el mínimo y la media de una serie de números enteros positivos dados por teclado.
 * Teminar cuando se introduzca un primo que no se tendrá en cuenta. 
 * Mostrar también cuantos números se han introducido sin contar el primo.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio49 {
  public static void main(String[] args) {

    System.out.println("___Programa que calcula el máximo, mínimo y media de los números enteros positivos dados___");
    //variables
    int numero = 2;
    boolean primo =  false;
    int conteo = 0;
    //int num = 0;
    int max = 2;
    int min = 2;
    int media = 1;
    //pedir y comprobar numeros
    System.out.println("Introduce números enteros positivos. Terminará cuando el número sea primo: "); 
    for (int n = 2; n < numero; n++) {
      numero = Integer.parseInt(System.console().readLine());
      if (numero % n == 0){
        primo = false;
        conteo++;
        media += numero;

        //comprobar maximo
        if (numero > max) {
          max = numero;
        } else if (numero < min) {
          min = numero;
        }
      } 
    }
    // while ((numero > 1) && (!primo)) {
    // }
    System.out.print(conteo);
    System.out.print(max);
    System.out.println(min);
    System.out.println(media);
    //System.out.println(media/conteo);
    //comprobar números
    //if ((alto < 2) || (ancho < 2)) {}
    //int palo = (int)(Math.random() * 4) + 1;
    // int numero = Integer.parseInt(System.console().readLine());

  }
}

