package patronesCreacionales.patronBuilder;

public class Celular 
{
	private String marca;
	private String modelo;
	private int ram;
	private double almacenamiento;
	
	private Celular() {}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}

	public int getRam() {
		return ram;
	}
	public double getAlmacenamiento() {
		return almacenamiento;
	}
	
	//Clase interna builder
	public static class builderCelular 
	{
		private String marca;
		private String modelo;
		private int ram;
		private double almacenamiento;
		public builderCelular setMarca(String marca) {
			this.marca = marca;
			return this;
		}
		
		public builderCelular setModelo(String modelo) {
			this.modelo = modelo;
			return this;
		}
		
		public builderCelular setRam(int ram) {
			this.ram = ram;
			return this;
		}

		public builderCelular setAlmacenamiento(double almacenamiento) {
			this.almacenamiento = almacenamiento;
			return this;
		}

		//metodo constructor de objeto
		public Celular buildCelular()
		{
			Celular celular = new Celular();
			celular.marca = this.marca;
			celular.modelo = this.modelo;
			celular.ram = this.ram;
			celular.almacenamiento = this.almacenamiento;
			return celular;
		}
		
	}
	
	
}
