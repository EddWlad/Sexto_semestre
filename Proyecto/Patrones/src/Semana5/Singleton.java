package Semana5;

public class Singleton 
{
	// se declara una variable de tipo Singleton llamada instancia de la mism clase
	private static Singleton instancia;
	//constructor vacio de la clase Singleton se colo en private para que la clase principal no pueda acceder al constructor
	private Singleton()
	{
		
	}
	//Se crea el metodo get y se valida si esta nulo si lo esta se crea la instancia y si no no, desde este metodo se puede acceder al constructor
	public static Singleton getInstancia() 
	{
		if(instancia == null)
		{
			instancia = new Singleton();
		}
		return instancia;
			
	}
	
	public void mostrarMensaje()
	{
		System.out.println("!Hola! Soy instancia de Singleton.");
	}
	
}
