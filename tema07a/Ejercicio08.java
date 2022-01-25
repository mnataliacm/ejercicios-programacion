package tema07a;
/**
 * Tema 7
 * Ejercicio 8
 * 
 * Programa que pide temperaturas meses de un año y muestra diagrama de barras horizontal con esos datos.
 * Para dibujar usar * u otro carácter.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio08 {
  public static void main(String[] args) {

    //variables
    double[] n = new double[12];
    String[] m = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    String caracter = "■";
    String esquina = "└";
    String mes = "Meses";
    String magenta = "\033[35m"; 
    String magentaC ="\033[95m";
    String reset="\033[0m";
    int mayor = 0;
    //programa
    System.out.println("Diagrama de barras de temperaturas años 2020");
    System.out.println("Introduce la temperatura cada mes del año 2020: ");
    for (int i = 0; i < n.length; i++) {
      n[i] = Double.parseDouble(System.console().readLine());
    }
    System.out.println();
    System.out.println("_Gráfico temperaturas 2020_");
    System.out.println();
    System.out.printf("   %-10s\n", mes);
    System.out.println("───────────┤");
    for (int i = 0; i < n.length; i++) {
      System.out.printf("%-10s │", m[i]);
      for (int j = 0; j < n[i]; j++) {
        if (n[i] > mayor) {
          mayor = (int)n[i];
        }
        if (i % 2 == 0){
          System.out.print(magenta + caracter);
        } else {
          System.out.print(magentaC + caracter);
        }
      }
      System.out.println(reset);
    }
    System.out.printf("%12s", esquina);
    for (int i = 0; i < mayor + 2; i++) {
      System.out.print("─");
    }
    System.out.println();
  }
}

