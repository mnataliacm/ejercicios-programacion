package ejercicios.tema09.b_POOenJava.ejercicio03;

/**
 *
 * @author Natalia Castillo Muñoz
 */
public class Perro extends Mamifero {
  private String tipoDeLadrido;


  public String getTipoDeLadrido() {
    return this.tipoDeLadrido;
  }

  public void setTipoDeLadrido(String tipoDeLadrido) {
    this.tipoDeLadrido = tipoDeLadrido;
  }
  
  public Perro(String nombre, String color, int edad, int mesesDeGestacion, String tipoDeLadrido) {
    super(nombre, color, edad, mesesDeGestacion);
    this.tipoDeLadrido = tipoDeLadrido;
  }

  @Override
  public String toString() {
    return "\nHola, soy " + this.getNombre() + " de color " + this.getColor() + " tengo " + this.getEdad() + " años " + "y mi ladrido es " + this.getTipoDeLadrido() + "\n";
  }

}
