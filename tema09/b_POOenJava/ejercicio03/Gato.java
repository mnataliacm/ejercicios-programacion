package tema09.b_POOenJava.ejercicio03;

/**
 *
 * @author Natalia Castillo Muñoz
 */
public class Gato extends Mamifero {
  private String tipoDeMaullido;


  public String getTipoDeMaullido() {
    return this.tipoDeMaullido;
  }

  public void setTipoDeMaullido(String tipoDeMaullido) {
    this.tipoDeMaullido = tipoDeMaullido;
  }
  
  public Gato(String nombre, String color, int edad, int mesesDeGestacion, String tipoDeMaullido) {
    super(nombre, color, edad, mesesDeGestacion);
    this.tipoDeMaullido = tipoDeMaullido;
  }

  @Override
  public String toString() {
    return "\nHola, soy " + this.getNombre() + " de color " + this.getColor() + " tengo " + this.getEdad() + " años " + "y mi maullido es " + this.getTipoDeMaullido() + "\n";
  }

}