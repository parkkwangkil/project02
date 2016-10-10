package programming02;

public class Customer extends Person{
	String custnum;
	int mile;
	
	public Customer(String name, String address, String call, String custnum , int mile){
		super(name,call,address);
		this.custnum = custnum;
		this.mile = mile;
	}
	
	public String getCustnum() {
		return custnum;
	}
	
	public void setCustnum(String custnum) {
		this.custnum = custnum;
	}
	public int getMile() {
		return mile;
	}
	public void setMile(int mile) {
		this.mile = mile;
	}
	
	public String toString(){
		return "고객번호 :"+custnum+"마일리지 :"+mile; 
	}
	

}
