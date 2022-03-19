package tema10.Ejercicio09;

import java.util.Objects;

public class Cartas implements Comparable<Cartas> {
  private Integer numero; 
  private String palo;

  private static String n[] = {"as", "2", "3", "4", "5", "6", "7", "sota", "caballo", "rey"};
  private static String p[] = {"oros", "copas", "bastos", "espadas"};

  public Cartas() {
    this.numero = (int)(Math.random()*10);
    this.palo = p[(int)(Math.random()*4)];
  }

  public int getNumero() {
    return numero;
  }

  public String getPalo() {
    return palo;
  }

  @Override
  public String toString() {
    return n[numero] + " de " + palo;
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

  @Override
  public int compareTo(Cartas c) {
    if (palo.equals(c.getPalo())) {
      return numero.compareTo(c.getNumero());
    } else {
      return palo.compareTo(c.getPalo());
    }
  }
}
