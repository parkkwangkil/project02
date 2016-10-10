package test02;

public class Aircon implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("에어컨 on");
	}

	@Override
	public void turnOff() {
		System.out.println("에어컨 off");
		
	}

}
