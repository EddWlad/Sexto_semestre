package Semana5.Adapter;

public class TestAdapter {

	public static void main(String[] args) {
		Adaptee adaptee = new Adaptee();
		Target adapter = new Adapter(adaptee);
		
		adapter.request();

	}

}
