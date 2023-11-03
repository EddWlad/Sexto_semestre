package Semana5.Brige;

public class Radio implements Device {

	@Override
	public void turnOn() {
		System.out.println("Radio encendida");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Radio apagada");
		
	}

	@Override
	public void setChannel(int channel) {
		System.out.println("Cambiando de frecuencia de radio a: "+channel);
		
	}

}
