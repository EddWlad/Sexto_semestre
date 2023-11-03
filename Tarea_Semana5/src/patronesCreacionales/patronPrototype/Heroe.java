package patronesCreacionales.patronPrototype;

public class Heroe implements Clonacion {
	private String nombre;
	private String habilidad2;
	private String habilidad3;
	private double nivelFuerza;

	public Heroe(String nombre, String habilidad2, String habilidad3, double nivelFuerza) {
		this.nombre = nombre;
		this.habilidad2 = habilidad2;
		this.habilidad3 = habilidad3;
		this.nivelFuerza = nivelFuerza;
	}

	public void setHabilidad3(String habilidad3) {
		this.habilidad3 = habilidad3;
	}

	public void setNivelFuerza(double nivelFuerza) {
		this.nivelFuerza = nivelFuerza;
	}

	@Override
	public Clonacion clonar() {
		return new Heroe(nombre, habilidad2, habilidad3, nivelFuerza);
	}
	
	public void mostrarInfoHeroe() {
		
		System.out.println("");
		System.out.println("Nombre: " + nombre + "\nSuperpoder 1: " + habilidad2 + "\nSuperpoder 2: " + habilidad3
				+ "\nNivel de fuerza " + nivelFuerza);
		
	}

}
