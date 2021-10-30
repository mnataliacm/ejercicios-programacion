/**
 * Tema 4
 * Ejercicio 24
 * Programa que genere una nómina (desglosada) de un empleado.
 * Pedir cargo: 1-Prog.junio, 2-Prog.senior, 3-Jefe de proyecto.
 * Pedir estado civil: 1 - soltero, 2 - Casado.
 * Sueldo base según cargo: 950, 1200 y 1600 euros.
 * Por día de viaje se pagan 30 euros extras, concepto dietas.
 * Al sueldo restar IRPF 25% soltero y 20% casado.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio24 {
  public static void main(String[] args) {

    System.out.println("___Programa para calcular la nómina___");
    System.out.println("________________MENÚ__________________");
    System.out.println("     1 - Programador junior");
    System.out.println("     2 - Programador senior");
    System.out.println("     3 - Jefe de proyecto");
    System.out.print("Introduzca el cargo del empleado (1-3): ");
    int cargo = Integer.parseInt(System.console().readLine());
    double sueldo = 0.0;
    switch (cargo) {
      case 1:
        sueldo = 950.00;
        break;
      case 2:
        sueldo = 1200.00;
        break;
      case 3:
        sueldo = 1600.00;
        break;

      default:
        System.out.println("Número introducido incorrecto.");
        break;
    }

    System.out.print("¿Cúantos días ha estado de viaje visitando clientes? ");
    int dia = Integer.parseInt(System.console().readLine());
    String viaje = dia + " viajes";
    double dieta = dia*30;
    double sueldobruto = sueldo+dieta;
    System.out.print("Introduzca su estado civil (1:Soltero o 2:Casado): ");
    int estado = Integer.parseInt(System.console().readLine());
    String irpf = "";
    double retencion =  0.0;
    switch (estado) {
      case 1:
        irpf = "25%";
        retencion = sueldobruto*0.25;
        break;
      case 2:
        irpf = "20%";
        retencion = sueldobruto*0.20;
        break;
      default:
        System.out.println("Número introducido incorrecto.");
        break;
    }
    double total = sueldobruto-retencion;

    System.out.print("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
    System.out.printf("\n┃%-20s %15.2f %s", "Sueldo base:", sueldo, "€┃");
    System.out.printf("\n┃%-6s (%s) %18.2f %s", "Dietas", viaje, dieta, "€┃");
    System.out.print("\n┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
    System.out.printf("\n┃%-20s %15.2f %s", "Sueldo bruto", sueldobruto, "€┃");
    System.out.printf("\n┃%-10s (%s) %15.2f %s", "Retención IRPF", irpf, retencion, "€┃");
    System.out.print("\n┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
    System.out.printf("\n┃%-20s %15.2f %s", "Sueldo neto", total, "€┃");
    System.out.println("\n┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");



  }
}

