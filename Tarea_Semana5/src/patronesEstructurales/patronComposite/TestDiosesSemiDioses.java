package patronesEstructurales.patronComposite;

public class TestDiosesSemiDioses {

	public static void main(String[] args) 
	{
		Dioses dios1 = new DiosesGriegos("Zeus","Rayo");
		Dioses dios2 = new DiosesGriegos("Ades","Inframundo");
		Dioses dios3 = new DiosesGriegos("Poseidon","Mares");
		
		TitanGriego titan = new TitanGriego("Kronos", "Tiempo");
		titan.agregarDios(dios1);
		titan.agregarDios(dios2);
		titan.agregarDios(dios3);
		
		Dioses dios4 = new DiosesGriegos("Apolo", "Sol");
		
		TitanGriego titan2 = new TitanGriego("Gaia", "Tierra");
		
		titan2.agregarDios(dios4);
		
		titan.agregarDios(titan2);
		
		titan.mostrarDioses();
		
		
		
	}

}
