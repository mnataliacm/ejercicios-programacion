package Ejercicio08;

import java.util.Objects;

public class Cartas {
  private String numero; 
  private String palo;

  private static String n[] = {"as", "2", "3", "4", "5", "6", "7", "sota", "caballo", "rey"};
  private static String p[] = {"oros", "copas", "bastos", "espadas"};

  public Cartas() {
    this.numero = n[(int)(Math.random()*10)];
    this.palo = p[(int)(Math.random()*4)];
  }

  public String getNumero() {
    return this.numero;
  }

  public String getPalo() {
    return this.palo;
  }

  @Override
  public String toString() {
    return this.numero + " de " + this.palo;
  }

  @Override
  public boolean equals(Object c) {
    if (c == null) {
      return false;
    }
    if (getClass() != c.getClass()) {
      return false;
    }
    Cartas nueva = (Cartas) c;
    if (!Objects.equals(this.numero, nueva.numero)) {
      return false;
    }
    if (!Objects.equals(this.palo, nueva.palo)) {
      return false;
    }
    return true;
  }
}
