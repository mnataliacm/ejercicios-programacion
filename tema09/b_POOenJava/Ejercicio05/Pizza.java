package tema09.b_POOenJava.ejercicio05;

public class Pizza {

  private String nombre;
  private String tamano;
  private String estado = "pedida";
  private static int totalPedidas = 0;
  private static int totalServidas = 0;

  public Pizza(String n, String t) {
    this.nombre = n;
    this.tamano = t;
  }

  public String getNombre() {
    Pizza.totalPedidas++;
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getTamano() {
    return this.tamano;
  }

  public void setTamano(String tamano) {
    this.tamano = tamano;
  }

  void sirve() {
    if (estado.equals("pedida")) {
      estado = "servida";
      Pizza.totalServidas++;
    } else if (estado.equals("servida")) {
      System.out.println("esa pizza ya se ha servido");
    }
  }

  @Override
  public String toString() {
    return getNombre() + ", " + getTamano() + ", " + estado;
  }

  public Pizza() {
    Pizza.totalPedidas = 0;
    Pizza.totalServidas = 0;
  }

  public static int getTotalPedidas() {
    return Pizza.totalPedidas;
  }

  public static int getTotalServidas() {
    return Pizza.totalServidas;
  }

  /**
   * Cambia el estado del pedido
   * LLeva el conteo de las pizzas pedidas y servidas
   * @param estado estado del pedido "pedida" o "servida"
   */
  public void conteo(String estado) {
    if (estado.equals("pedido")) {
      Pizza.totalPedidas++;
    } else {
      Pizza.totalServidas++;
    }
  }

}

