/**
 * Tema 4
 * Ejercicio 23
 * Programa que calcule el precio final de un producto según su base imponible, tipo de IVA y descuento promocional.
 * IVA: general=21% reducido=10% superreducido=4%
 * descuentos promocionales: nopro, mitad, meno5(-5€) o 5porc(-5%).
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio23 {
  public static void main(String[] args) {

    System.out.println("___Calcular el precio final de un producto___");

    String tipo = "";
    String promo = "";
    Double tipoiva = 0.0;
    Double descuento = 0.0;

    System.out.print("Introduzca la base imponible: ");
    double base = Double.parseDouble(System.console().readLine());

    System.out.print("Introduzca el tipo de IVA(general, reducido o superreducido): ");
    String iva = System.console().readLine();
    switch (iva) {
      case "general":
        tipo = "21%";
        tipoiva = base*0.21;
        break;
      case "reducido":
        tipo = "10%";
        tipoiva = base*0.10;
        break;
      case "superreducido":
        tipo = "4%";
        tipoiva = base*0.04;
        break;
      default:
        System.out.println("El tipo de IVA introducido es incorrecto");
        System.exit(0);
    }
    System.out.print("Introduzca el código promocional(nopro, mitad, meno5 o 5porc): ");
    String codigo = System.console().readLine();
    switch (codigo) {
      case "nopro":
        promo = "nopro";
        descuento = 0.0;
        break;
      case "mitad":
        promo = "mitad";
        descuento = -(base+tipoiva)/2;
        break;
      case "meno5":
        promo = "meno5";
        descuento = -5.0;
        break;
      case "5porc":
        promo = "5porc";
        descuento = -(base+tipoiva)*0.05;
        break;
      default:
        System.out.println("El código de descuento introducido es incorrecto");
        System.exit(0);
    }
    double baseiva = base + tipoiva;
    double total = baseiva + descuento;

    System.out.print("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
    System.out.printf("\n┃%-20s %15.2f %s", "Base imponible:", base, "€┃");
    System.out.printf("\n┃%-4s (%s) %25.2f %s", "IVA", tipo, tipoiva, "€┃");
    System.out.printf("\n┃%-20s %15.2f %s", "Precio con IVA", baseiva, "€┃");
    System.out.printf("\n┃%-11s (%s) %16.2f %s", "Cód. promo.", promo, descuento, "€┃");
    System.out.print("\n┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
    System.out.printf("\n┃%-20s %15.2f %s", "TOTAL", total, "€┃");
    System.out.println("\n┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

  }
}