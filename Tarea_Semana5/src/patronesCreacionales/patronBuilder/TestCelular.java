package patronesCreacionales.patronBuilder;

public class TestCelular {

	public static void main(String[] args) {
		Celular celular = new Celular.builderCelular().setMarca("BISON").setModelo("PRO X10").setRam(16)
				.setAlmacenamiento(256).buildCelular();
		
		System.out.println("Marca: "+celular.getMarca());
		System.out.println("Modelo: "+celular.getModelo());
		System.out.println("Ram: "+celular.getRam()+"GB");
		System.out.println("Almacenamiento: "+celular.getAlmacenamiento()+"GB");

	}

}
