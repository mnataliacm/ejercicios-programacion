package tema09.b_POOenJava.ejercicio02;

import java.util.Scanner;

/**
 * Tema 9 Ejercicio 2
 *
 * Crea la clase Vehiculo.java y sus subclases Bicicleta.java y Coche.java En
 * Vehiculo crea atributos vehiculosCreados y kilometrosTotales, y el atributo
 * de instancia kilometrosRecorridos Crea también métodos específicos para las
 * subclases. Prueba las clases
 *
 *
 * @author Natalia Castillo Muñoz
 */
public class PruebaVehiculo {

  public static void main(String[] args) {

    // variables
    Scanner s = new Scanner(System.in);
    // Bicicleta bici = new Bicicleta("GAC", "todoterreno", "azul", 1);
    // Coche kangoo = new Coche("Renault", "Kangoo", "furgoneta", "gris", 5);
    Bicicleta bici = new Bicicleta();
    Coche kangoo = new Coche();
    int opcion = 0; 
    //int km;
    // menu
    while (opcion != 10) {
      
      System.out.println();
      System.out.println("              VEHÍCULOS             ");
      System.out.println("====================================");
      System.out.println("1. Recorre 20 km");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Toca el timbre de la bicicleta");
      System.out.println("4. Recorre 100 km");
      System.out.println("5. Quema rueda con el coche");
      System.out.println("6. Toca el claxon del coche");
      System.out.println("7. Ver kilometraje de la bicicleta");
      System.out.println("8. Ver kilometraje del coche");
      System.out.println("9. Ver kilometraje total");
      System.out.println("10. Salir");
      System.out.println("====================================");
      System.out.print("   Elige una opción(1-10): ");
      opcion = Integer.parseInt(s.nextLine());

      switch (opcion) {
        case 1: {
          // System.out.print("¿Cuantos km quieres hacer? ");
          // kmBi = Integer.parseInt(s.nextLine());
          System.out.println();
          bici.recorre(20);
          System.out.println();
        }
        case 2: {
          System.out.println();
          bici.caballito();
          System.out.println();
        }
        case 3: {
          System.out.println();
          bici.timbre();
          System.out.println();
        }
        case 4: {
          // System.out.print("¿Cuantos km quieres hacer? ");
          // kmCo = Integer.parseInt(s.nextLine());
          kangoo.recorre(100);
          System.out.println();
        }
        case 5: {
          System.out.println();
          kangoo.quemaRueda();
          System.out.println();
        }
        case 6: {
          System.out.println();
          kangoo.claxon();
          System.out.println();
        }
        case 7: {
          System.out.println();
          System.out.println("Cuentakilómetros de bici, la bicicleta lleva: ");
          System.out.println(bici.getTotalKm() + " Km");
          System.out.println();
        }
        case 8: {
          System.out.println();
          System.out.println("Cuentakilómetros de kangoo, el coche lleva: ");
          System.out.println(kangoo.getTotalKm() + " Km");
          System.out.println();
        }
        case 9: {
          System.out.println();
          System.out.println("Los vehículos llevan un total de: ");
          System.out.println(Vehiculo.getTotalKmVeh() + " Km");
          System.out.println();
        }
      } // switch
    }
    s.close(); // while
  }
}
