package test02;

public class Test {
	public static void main(String[] args) {
		Television tv = new Television();
//		tv.turnOn();
//		tv.turnOff();
//		
//		Aircon air = new Aircon();
//		air.turnOn();
//		air.turnOff();
		
		RemoteControl remocon = new Television();
		remocon.turnOn();
		remocon.turnOff();
		System.out.println(remocon instanceof Television);
		
		remocon = new Aircon();
		remocon.turnOn();
		remocon.turnOff();
	}

}
