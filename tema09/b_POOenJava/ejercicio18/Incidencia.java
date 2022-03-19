package tema09.b_POOenJava.ejercicio18;

public class Incidencia {
	
	int numPuesto;
	String problema;
	String solucion;
	String estado;
	int codigo = 0;
	static int pendientes = 0;
		
	public Incidencia(int num, String problema) {
		this.numPuesto = num;
		this.problema = problema;
		this.estado = "Pendiente";
		this.codigo++;
		pendientes++;
	}

	void resuelve(String solucion) {
		this.solucion = solucion;
		this.estado = "Resuelta";
		pendientes--;
	}

	public static int getPendientes() {	
		return pendientes;
	}
	
	@Override
	public String toString() {
		if (estado.equals("Pendiente")) {
			return "Incidencia " + this.codigo + " - Puesto: " + this.numPuesto + " - " + this.problema + " - " + this.estado;
		} else {
				return "Incidencia " + this.codigo + " - Puesto: " + this.numPuesto + " - "  + this.problema + " - " + this.estado + " - " + this.solucion;
		}
		
	}
	
}
