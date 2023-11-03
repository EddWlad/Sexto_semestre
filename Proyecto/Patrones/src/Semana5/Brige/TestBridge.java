package Semana5.Brige;

public class TestBridge {

	public static void main(String[] args) {
		Device tv = new TV();
		Device radio = new Radio();
		
		RemoteControl tvRemote = new AdvancedRemoteControl(tv);
		RemoteControl radioRemote = new AdvancedRemoteControl(radio);
		
		tvRemote.powerOn();
		tvRemote.setChannel(5);
		tvRemote.powerOff();
		
		radioRemote.powerOn();
		radioRemote.setChannel(102);
		radioRemote.powerOff();

	}

}
