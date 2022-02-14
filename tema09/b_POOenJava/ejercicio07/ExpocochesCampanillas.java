package tema09.b_POOenJava.ejercicio07;

import java.util.Scanner;

public class ExpocochesCampanillas {  
  public static void main(String[] args)  {
    
    Scanner s = new Scanner(System.in);
    Zona principal = new Zona(1000);
    Zona compraVenta = new Zona(200);
    Zona vip = new Zona(25);
    int opcion = 0;

    //menu
    while (opcion != 3) {
      System.out.println();
      System.out.println("*******************");
      System.out.println("GESTION DE ENTRADAS");
      System.out.println("*******************");
      System.out.println("1. Mostrar número de entradas libres");
      System.out.println("2. Vender entradas");
      System.out.println("3. Salir");
      System.out.print("Elije una opcion: ");
      opcion = Integer.parseInt(s.nextLine()); 
      System.out.println();      
      switch (opcion) {
        case 1:
          System.out.println("Las entradas disponibles son: \n");
          System.out.println(" * Zona Principal: " + principal);
          System.out.println(" * Zona Compra-Venta: " + compraVenta);
          System.out.println(" * Zona VIP: " + vip);
          break;
          case 2:
            System.out.println("Zonas de la expo");
            System.out.println("1. Zona principal");
            System.out.println("2. Zona de compra-venta");
            System.out.println("3. Zona VIP");
            System.out.print("Elige que entradas quieres: ");
            int entrada = Integer.parseInt(s.nextLine());
            System.out.println("¿Cuantas quieres?"); 
            int cantidad = Integer.parseInt(s.nextLine());           
            switch (entrada) {
              case 1:
                principal.vendida(cantidad);
                break;
              case 2:
                compraVenta.vendida(cantidad);
                break;
              case 3:
                vip.vendida(cantidad);
                break;
              default:
                break;
            }
          break;
        default:
          break;
      }
    }
    s.close();
  }
}
