/**
 * Tema 4
 * Ejercicio 27
 * Programa que nos pide una pasteleria que haga presupuestos sabors.
 * Sabor = manzana=18€, fresas=16 o chocolate: negro=14€ blanco=15€
 * Nata =2.5€
 * Poner nombre = 2.75€
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio27 {
  public static void main(String[] args) {

    String sabor, nata, nombre;
    String choco = "";
    double precio = 0.0;
    double precionata = 0.0;
    double precionombre = 0.0;
    System.out.println("___Presupuesto para sabor___");
    System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
    sabor = System.console().readLine().toLowerCase();
    if (sabor.equals("chocolate")) {
      System.out.print("¿Que tipo de chocolate quiere? (negro o blanco): ");
      choco = System.console().readLine().toLowerCase();
    }  
    System.out.print("¿Quiere nata? (si o no): ");
    nata = System.console().readLine().toLowerCase();
    System.out.print("¿Quiere escribir un nombre? (si o no): ");
    nombre = System.console().readLine().toLowerCase();

    if (sabor.equals("manzana")) {
      precio = 18.00;
    } else if (sabor.equals("fresa")) {
      precio = 16.00;
    } else if ((sabor.equals("chocolate")) && (choco.equals("negro"))) {
      precio = 14.00;
    } else if ((sabor.equals("chocolate")) && (choco.equals("blanco"))) {
      precio = 14.00;
    } 
    System.out.println("Tarta de " + sabor +" "+ choco +" "+ precio + "€");
    if ((nata.equals("si")) || (nata.equals("s"))){
      precionata = 2.50;
      System.out.println("Con nata: " + precionata + " €");
    }
    if ((nombre.equals("si")) || (nombre.equals("s"))) {
      precionombre = 2.75;
      System.out.println("Con nombre: " + precionombre + " €");
    }
    double total = precio+precionata+precionombre;
    System.out.println("Total: " + total + " €");

  }
}

