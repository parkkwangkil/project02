package programming02;

public class Person {
	String name;
	 String call;
	String address;
	
	public Person(String name, String address, String call){
		this.name =name;
		this.address = address;
		this.call = call;
	}
	
	
	
	public void setPerson(String name, String address, String call){
		this.name=name;
		this.address = address;
		this.call = call;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCall() {
		return call;
	}
	public void setCall(String call) {
		this.call = call;
	}


}
