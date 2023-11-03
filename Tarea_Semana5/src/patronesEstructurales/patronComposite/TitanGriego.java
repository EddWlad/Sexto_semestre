package patronesEstructurales.patronComposite;

import java.util.ArrayList;

public class TitanGriego implements Dioses {

	private String nombreSemiDios;
	private String hijodeDios;
	
	private ArrayList<Dioses> dioses = new ArrayList<>();
	
	TitanGriego(String nombreSemiDios,String hijoDios)
	{
		this.nombreSemiDios = nombreSemiDios;
		this.hijodeDios = hijoDios;
	}
	
	public void agregarDios(Dioses dios)
	{
		dioses.add(dios);
	}
	
	@Override
	public void mostrarDioses() {
		System.out.println("Titan: "+nombreSemiDios+" Titan del: "+hijodeDios);
		for(Dioses elementoDioses : dioses )
		{
			elementoDioses.mostrarDioses();
		}
	}
}
