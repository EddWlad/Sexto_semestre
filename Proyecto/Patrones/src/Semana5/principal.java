package Semana5;

public class principal {

	public static void main(String[] args) 
	{
		System.out.println("Hola mundo");
		//patron singleton debe tener un constructor privado de esta forma se llama al constructor mediante el metodo getInstancia
		// crea una variable tipo Singleton instancia1 y llama al metodo de la clase
		Singleton instancia1 = Singleton.getInstancia();
		instancia1.mostrarMensaje();
		Singleton instancia2 = Singleton.getInstancia();
		instancia2.mostrarMensaje();


	}

}
