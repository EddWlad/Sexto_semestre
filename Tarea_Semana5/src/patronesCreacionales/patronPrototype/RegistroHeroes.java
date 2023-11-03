package patronesCreacionales.patronPrototype;

public class RegistroHeroes {

	public static void main(String[] args) {
		Heroe heroePrimordial = new Heroe("Pickle", "Super Fuerza", "Curacion Divina", 100);
		
		System.out.println("Registro de heroes");
		
		Heroe heroeClonado = (Heroe) heroePrimordial.clonar();
		heroeClonado.setHabilidad3("Control sobre el fuego");
		heroeClonado.setNivelFuerza(84);
		
		Heroe heroeClonado2 = (Heroe) heroePrimordial.clonar();
		heroeClonado2.setHabilidad3("Volar");
		heroeClonado2.setNivelFuerza(76);
		
		heroePrimordial.mostrarInfoHeroe();
		heroeClonado.mostrarInfoHeroe();
		heroeClonado2.mostrarInfoHeroe();

	}

}
