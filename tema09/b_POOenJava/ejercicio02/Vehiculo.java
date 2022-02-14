package tema09.b_POOenJava.ejercicio02;

/**
 * Vehiculo.java
 * Definición de la clase Vehículo
 * 
 * @author Natalia Castillo Muñoz
 */
public abstract class Vehiculo {

  // Atributos de clase
  private static int totalKmVeh = 0;
  //Atributos de instancia (objeto)
  private int totalKm;

  public Vehiculo() {
    this.totalKm = 0;
  }

  public int getTotalKm() {
    return this.totalKm;
  }

  public static int getTotalKmVeh() {
    return Vehiculo.totalKmVeh;
  }

  /**
   * Hace que el vehiculo recorra una distancia
   * <p>
   * Recorrida la distancia km, se incrementa su totalKmBi o totalKmCi y además se va calculando el total de km recorridos por todos los vehículos
   * 
   * @param km kilómetros a recorrer
   */
  public void recorre(int km) {
    this.totalKm += km;
    Vehiculo.totalKmVeh += km;
  }  
}

