/**
 * Tema 4
 * Ejercicio 29 
 * Programa que calcula el precio de un desayuno.
 * Comida: palmera=1.40, donut=1, o pitufo: aceite=1.2 y tortilla=1.6
 * Bebida: zumo=1.50 o café=1.20.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio29 {
  public static void main(String[] args) {

    String comida, bebida;
    String relleno = "";
    double precio = 0.0;
    double preciozumo = 1.5;
    double preciocafe = 1.2;
    
    System.out.println("___Precio del desayuno___");
    System.out.print("¿Qué ha tomado de comer (palmera, donut o pitufo): ");
    comida = System.console().readLine().toLowerCase();
    if (comida.equals("pitufo")) {
      System.out.print("¿Con qué se ha tomado el pitufo? (aceite o tortilla): ");
      relleno = System.console().readLine().toLowerCase();
    }
    System.out.print("¿Qué ha tomado de beber (zumo o café): ");
    bebida = System.console().readLine().toLowerCase();
    System.out.println("\n********************************");
    
    if (comida.equals("palmera")) {
      precio = 1.40;
      System.out.printf("* %-21s %.2f €* € *\n", "Palmera:", precio);
    } else if (comida.equals("donut")) {
      precio = 1.0;
      System.out.printf("* %-21s %.2f € *\n", "Donut:", precio);
    } else if ((comida.equals("pitufo")) && (relleno.equals("aceite"))) {
      precio = 1.20;
      System.out.printf("* %-21s %.2f € *\n", "Pitufo con aceite:", precio);
    } else if ((comida.equals("pitufo")) && (relleno.equals("tortilla"))) {
      precio = 1.60;
      System.out.printf("* %-21s %.2f € *\n", "Pitufo con tortilla:", precio);
    }   
    if ((bebida.equals("café")) || (bebida.equals("cafe"))){
      System.out.printf("* %-21s %.2f € *\n", "Café:", preciocafe);
      System.out.printf("* %-21s %.2f € *\n", "Total desayuno:", (precio+preciocafe));
    } else if (bebida.equals("zumo")) {
      System.out.printf("* %-21s %.2f € *\n", "Zumo:", preciozumo);
      System.out.printf("* %-21s %.2f € *\n", "Total desayuno:", (precio+preciozumo));
    } 
    System.out.println("********************************");

  }
}


