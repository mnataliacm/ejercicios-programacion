package ejercicios.tema09.b_POOenJava.ejercicio03;

/**
 *
 * @author Natalia Castillo Muñoz
 */
public class Canario extends Ave {
  private String tipoDeCanto;

  public String getTipoDeCanto() {
    return this.tipoDeCanto;
  }

  public void setTipoDeCanto(String tipoDeCanto) {
    this.tipoDeCanto = tipoDeCanto;
  }
  
  public Canario(String nombre, String color, int edad, int mesesDeIncuvacion, String tipoDeCanto) {
    super(nombre, color, edad, mesesDeIncuvacion);
    this.tipoDeCanto = tipoDeCanto;
  }

  @Override
  public String toString() {
    return "\nHola, soy " + this.getNombre() + " de color " + this.getColor() + " tengo " + this.getEdad() + " años " + "y mi canto es " + this.getTipoDeCanto() + "\n";
  }
  
}