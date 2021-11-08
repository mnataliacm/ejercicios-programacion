/**
 * Tema 5
 * Ejercicio 08
 * Programa que muestra tabla de multiplicar
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio08 {
  public static void main(String[] args) {

    System.out.println("___Tabla de Multiplicar___");
    System.out.print("Introduce número de tabla a mostrar: ");
    int num = Integer.parseInt(System.console().readLine());
    int i = 1;
    int tabla = 1;

    for (i = 1; i <=10; i++) {
      tabla = num * i;
      System.out.println(num + " x " + i + " = " + tabla);
    }
  }
}

