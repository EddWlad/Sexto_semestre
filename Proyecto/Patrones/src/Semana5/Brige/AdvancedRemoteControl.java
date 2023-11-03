package Semana5.Brige;

public class AdvancedRemoteControl extends RemoteControl 
{
	AdvancedRemoteControl(Device device)
	{
		super(device);
	}

	@Override
	void powerOn() {
		device.turnOn();
		
	}

	@Override
	void powerOff() {
		device.turnOff();
		
	}

	@Override
	void setChannel(int channel) {
		device.setChannel(channel);
		
	}

}
