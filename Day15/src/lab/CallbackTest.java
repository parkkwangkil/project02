package lab;

public class CallbackTest {
	public static void main(String[] args) {
	
	ActionListner listner =new MyClass();
	Timer t = new Timer(1000, listner);
	t.start();


	for(int i=0; i<1000; i++){
		try{Thread.sleep(1000);}
		catch (InterruptedException e) {}
		
	}
	
	
	
}}
