package tema09.b_POOenJava.ejercicio16;

class Linea {

	private Punto inicio;
	private Punto fin;
	
	public Linea(Punto coordenada1, Punto coordenada2) {
		this.inicio = coordenada1;
		this.fin = coordenada2;
	}
	
	@Override
	public String toString() {
		return "Línea formada por los puntos " + inicio + " y " + fin;
	}
	
}
