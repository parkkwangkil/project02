package test02;

public class Aircon implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("������ on");
	}

	@Override
	public void turnOff() {
		System.out.println("������ off");
		
	}

}
