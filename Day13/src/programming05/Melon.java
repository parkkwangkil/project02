package programming05;

public class Melon extends Food{
	private String farm;
	
	public String getFarm() {
		return farm;
	}

	public void setFarm(String farm) {
		this.farm = farm;
	}

	public Melon(int cal, int pay, int weight, String farm){
		super(cal,pay,weight);
		this.farm=farm;
	}
	public  String toString(){
	return super.toString()+"≥Û¿Â¡§∫∏"+farm; 
	}
	

}
