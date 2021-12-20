/**
 *
 * Tema 7
 * Ejercicio 15
 * 
 * Aplicacion para colocar a los clientes en sus mesas. Las mesas pueden sentar
 * de 0 (mesa vacia) a 4 (mesa llena).
 * Preguntar cuantos son, si dice más de 4 mensaje de error, máximo 4, intente
 * de nuevo
 * Se busca la primera mesa libre (0 personas), si no quedan se busca donde
 * colocar al grupo, por ejemplo si son dos se buscan las mesas con 1 o 2
 * comensales
 * 
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio15 {
  public static void main(String[] args) {
    
    //VARIABLES
    int[] mesa = new int[10];
    int clientes = 0;
    //RELLENA MESA
    for (int i = 0; i < mesa.length; i++) {
      mesa[i] = (int)(Math.random() * 5);
    }
    boolean haySitio = false;
    boolean noHay = false;
    int vacia = 0;
    int hueco = 0;
    //PROGRAMA
    do {
      System.out.println();
      System.out.println("CONTROL DE MESAS");
      System.out.println("\n┌───────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
      System.out.print("│ Mesa nº   │");
      for (int i = 1; i < 11; i++) { 
        System.out.printf("%4d│", i);
      }
      System.out.println("\n├───────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
      System.out.print("│ Ocupación │");
      for (int i = 0; i < 10; i++) {
        System.out.printf("%4d│", mesa[i]);
      }
      System.out.println("\n└───────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");
      System.out.println();
      System.out.print("¿Cuántos son? (introduzca -1 para salir del programa): ");
      clientes = Integer.parseInt(System.console().readLine());
      //COMPROBAR CLIENTES
      if (clientes > 4) {
        System.out.println(
        "Lo siento, no admitimos grupos tan grandes, haga grupos de 4 personas como máximo e intente de nuevo");
      } else {
        //BUSCAR MESA VACIA
        vacia = 0;
        haySitio = false;
        for (int o = 9; o >= 0; o--) {
          if (mesa[o] == 0) {
            haySitio = true;
            vacia = o;
          }
        }
        if (haySitio) {
          mesa[vacia] = clientes;
          System.out.println("Tenemos libre la mesa número " + (vacia + 1));
        } else {
          //BUSCAR HUECO EN MESA OCUPADA
          hueco = 0;
          noHay = false;
          for (int i = 9; i >= 0; i--) {
            if (clientes <= (4 - mesa[i])) {
              hueco = i;
              noHay = true;
            }
          }
          if (noHay) {
            mesa[hueco] += clientes;
            System.out.println("Tendrá que compartir mesa. Hay hueco en la mesa número " + (hueco + 1));
          } else {
            System.out.println("Lo siento, no hay sitio en estos momentos.");
          }
        }
      }
      if (clientes == -1) {
        System.out.println("Cerrando programa");
      }
    } while (clientes != -1); 
    System.out.println();
  }
}