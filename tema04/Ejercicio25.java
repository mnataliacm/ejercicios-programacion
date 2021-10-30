/**
 * Tema 4
 * Ejercicio 25
 * Programa que calcula el precio de las banderas según el alto y el ancho. Precio 1 céntimo por centímetro cuadrado.
 * Bordado = 2.50€
 * Gastos de envio = 3.25€
 * IVA incluido en las tarifas.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio25 {
  public static void main(String[] args) {

    System.out.println("___Calcular el precio de las banderas___");
    System.out.print("Introduzca la altura de la bandera en cm: ");
    int altura = Integer.parseInt(System.console().readLine());
    System.out.print("Ahora introduzca la anchura en cm: ");
    int ancho = Integer.parseInt(System.console().readLine());
    System.out.print("¿Quiere escudo bordado? (s/n)");
    String bordado = System.console().readLine();
    int area = altura*ancho;
    double precio = area/100;
    double gastos = 3.25;
    double escudo = 0.0;
    if ("s".equals(bordado)) {
      escudo = 2.50;
    } else {
      escudo = 0.00;
    }
    double total = precio+escudo+gastos;
    java.util.Date fecha = new java.util.Date();

    System.out.println("Gracias. Aquí tiene el desglose de su compra.\n");
    System.out.println("\n      *****  BanderaDeEspaña.es  *****");
    System.out.print("  ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
    System.out.printf("\n  ┃%-11s %s cm² %15.2f %s", "Bandera de", area, precio, "€┃");
    System.out.printf("\n  ┃%-20s %15.2f %s", "Escudo:", escudo, "€┃");
    System.out.printf("\n  ┃%-20s %15.2f %s", "Gastos de envío: ", gastos, "€┃");
    System.out.print("\n  ┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
    System.out.printf("\n  ┃%-20s %15.2f %s", "Sueldo neto", total, "€┃");
    System.out.println("\n  ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
    System.out.println(fecha + "(IVA incluido)");
  }
}

