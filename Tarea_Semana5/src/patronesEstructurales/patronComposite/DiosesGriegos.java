package patronesEstructurales.patronComposite;

public class DiosesGriegos implements Dioses 
{
	private String nombreDios;
	private String encargado;
	
	DiosesGriegos(String nombre,String encargado)
	{
		this.nombreDios = nombre;
		this.encargado = encargado;
	}

	
	@Override
	public void mostrarDioses() {
		System.out.println("Dios: "+nombreDios);
		System.out.println("Dios del : "+encargado);
		
	}
	
}
