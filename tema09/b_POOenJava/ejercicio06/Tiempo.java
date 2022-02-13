package tema09.b_POOenJava.ejercicio06;

public class Tiempo {
  private int hora;
  private int minuto;
  private int segundo;

  public Tiempo(int h, int m, int s) {
    this.hora = h;
    this.minuto = m;
    this.segundo = s;
  }

  public Tiempo() {
  }

  public int getHora() {
    return this.hora;
  }

  public void setHora(int hora) {
    this.hora = hora;
  }

  public int getMinuto() {
    return this.minuto;
  }

  public void setMinuto(int minuto) {
    this.minuto = minuto;
  }

  public int getSegundo() {
    return this.segundo;
  }

  public void setSegundo(int segundo) {
    this.segundo = segundo;
  }

  public static Tiempo suma(Tiempo a, Tiempo b) {
    Tiempo c = new Tiempo();
    if (a.segundo + b.segundo >= 60) {
      c.segundo = (a.segundo + b.segundo) % 60;
      c.minuto = (a.segundo + b.segundo) / 60;
    } else {
      c.segundo = a.segundo + b.segundo;
    }
    if (a.minuto + b.minuto >= 60) {
      c.hora = (a.minuto + b.minuto) / 60;
      c.minuto += (a.minuto + b.minuto) % 60; 
    } else {
      c.minuto += (a.minuto + b.minuto);
    }
    if (a.hora + b.hora > 24) {
      System.out.println("Más de 24 horas no se puede calcular");
      return null;
    } else {
      c.hora += a.hora + b.hora;
    }
    return c;
  }

  public static Tiempo resta(Tiempo a, Tiempo b) {
    Tiempo c = new Tiempo();
    if (a.segundo < b.segundo) {
      a.minuto--;
      c.segundo = (a.segundo + 60) - b.segundo; 
    } else {
      c.segundo = a.segundo - b.segundo;
    }
    if (a.minuto > b.minuto) {
      c.minuto = a.minuto - b.minuto;
    } else if (a.minuto < b.minuto && a.hora > 1) {
      a.hora--;
      c.minuto = (a.minuto + 60) - b.minuto;
    } else {
      System.out.println("Error: la operacion no se puede realizar minutos no se pueden restar");
      return null;
    }  
    if ((a.hora < b.hora) || (a.hora - b.hora < 0)) {
      System.out.println("Error: la operacion no se puede realizar horas no se pueden restar");
      return null;
    } else {
      c.hora = a.hora - b.hora;
    }
    return c;
  }

  @Override
  public String toString() {
    return getHora() + "h " + getMinuto() + "m " + getSegundo() + "s";
  }

}
