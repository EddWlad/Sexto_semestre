package Semana5.Brige;

public class TV implements Device 
{

	@Override
	public void turnOn() {
		System.out.println("TV encendida");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV apagada");
		
	}

	@Override
	public void setChannel(int channel) {
		System.out.println("Cambiando canal de TV a: "+channel);
		
	}

}
