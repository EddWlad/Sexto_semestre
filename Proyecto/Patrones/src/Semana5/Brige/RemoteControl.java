package Semana5.Brige;

abstract class RemoteControl {
	protected Device device;
	
	RemoteControl(Device device)
	{
		this.device = device;
	}
	
	abstract void powerOn();
	abstract void powerOff();
	abstract void setChannel(int channel);
	
}
