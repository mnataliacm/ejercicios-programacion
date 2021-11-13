/**
 * Tema 4
 * Ejercicio 26 
 * Programa que calcula el precio de unas entradas de cine según personas y dia de la semana.
 * Entrada=8€   miercoles=5€ jueves=2x11€ (si son 7: 3entradas pareja y 1 individual=33+8)
 * CineCampa = 10% dto.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio26 {
  public static void main(String[] args) {

    String dia, socio;
    int entrada = 0;
    double precio = 8.0;
    double total = entrada*precio;
    double descuento = 0.0;
    String entradaTipo = "Entradas individuales";
    String precioTipo = "Precio por entrada individual";
    int ticket = 1;
    String entradaTipo2 ="";
    String precioTipo2 = "";
    int entrada2 = 0;
    double precio2 = precio;
    double total2 = entrada2*precio2;
    double descuento2 = 0.0;
    java.util.Date fecha = new java.util.Date();
//Solicitar datos
    System.out.println("___Venta de entradas CineCampa___");
    System.out.print("Número de entradas: ");
    entrada = Integer.parseInt(System.console().readLine());
    System.out.print("Día de la semana: ");
    dia = System.console().readLine().toLowerCase();
    System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
    socio = System.console().readLine().toLowerCase();   
//Comprobar dia de la semana   
    switch (dia) {
      case "lunes":
      case "martes":
      case "viernes":
      case "sabado":
      case "domingo":
        ticket = 1;
        precio = 8.0;
        total = entrada*precio;
        break;
      case "miercoles":
        ticket = 1;
        precio = 5.0;
        total = entrada*precio;
        break;
      case "jueves":
        if ((entrada%2) == 0) {
          ticket = 1;
          entrada = entrada/2;
          precio = 11.00;
          total = entrada*precio;
          entradaTipo = "Entradas de parejas";
          precioTipo = "Precio por entrada de pareja";
        } else {
          ticket = 2;
          entrada = entrada/2;
          precio = 11.00;
          entradaTipo = "Entradas de parejas";
          precioTipo = "Precio por entrada de pareja";
          entrada2 = 1;
          entradaTipo2 = "Entradas individuales";
          precioTipo2 = "Precio por entrada individual";
          precio2 = 8.00;
          total2 = (entrada*precio) + precio2;
        }
        break;
      default:
        break;
    }
//Comprobar si es socio del cine.
    if ("n".equals(socio)) {
      descuento = 0.0;
    } else {
      descuento = total*0.1;
      descuento2 = total2*0.1;
    }   
//Comprobar variable ticket para imprimir resultado diferente si jueves parejas impares
    if (1 == ticket) {
    System.out.println("\n      *************  CineCampa  *************");
    System.out.print("  ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
    System.out.printf("\n  ┃%-30s %10d %s", entradaTipo, entrada, "  ┃");
    System.out.printf("\n  ┃%-30s %10.2f %s", precioTipo, precio, " €┃");
    System.out.printf("\n  ┃%-30s %10.2f %s", "Total", total, " €┃");
    System.out.printf("\n  ┃%-30s %10.2f %s", "Descuento", descuento, " €┃");
    System.out.printf("\n  ┃%-30s %10.2f %s", "A pagar", (total-descuento), " €┃");
    System.out.println("\n  ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
    System.out.println("    " + fecha + "(IVA incluido)");
    System.out.println("  -----------------------------------------------");
    System.out.println("  GRACIAS por su compra, disfrute de la pelicula.");
   } else {
    System.out.println("\n      *************  CineCampa  *************");
    System.out.print("  ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
    System.out.printf("\n  ┃%-30s %10d %s", entradaTipo, entrada, "  ┃");
    System.out.printf("\n  ┃%-30s %10.2f %s", precioTipo, precio, " €┃");
    System.out.printf("\n  ┃%-30s %10d %s", entradaTipo2, entrada2, "  ┃");
    System.out.printf("\n  ┃%-30s %10.2f %s", precioTipo2, precio2, " €┃");
    System.out.printf("\n  ┃%-30s %10.2f %s", "Total", total2, " €┃");
    System.out.printf("\n  ┃%-30s %10.2f %s", "Descuento", descuento2, " €┃");
    System.out.printf("\n  ┃%-30s %10.2f %s", "A pagar", (total2-descuento2), " €┃");
    System.out.println("\n  ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
    System.out.println("    " + fecha + "(IVA incluido)");
    System.out.println("  -----------------------------------------------");
    System.out.println("  GRACIAS por su compra, disfrute de la pelicula.");
   }
  }
}
